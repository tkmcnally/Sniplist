/**
 * Created by Thomas on 6/26/2014.
 */
$(document).ready(viewSnipsReady);

function viewSnipsReady() {

    //Bind buttons after table creation.
    bindTableButtons();
}

function addToSniplist(snipList, snip) {

    jsRoutes.controllers.SniplistController.addToSnipList(snipList, snip).ajax({
        success: function(data) {

            loadModalData(function() {
                $("#modal-message").removeClass("hidden");
                $("#modal-message").removeClass("alert-danger");
                $("#modal-message").addClass("alert-success");
                $("#modal-message").text(data.message);
            });
        },
        error: function(xhr, status, error) {
            $("#modal-message").removeClass("hidden");
            $("#modal-message").addClass("alert-danger");
            $("#modal-message").text(xhr.responseText);
        }
    })
}

function bindTableButtons() {
    $('.dropdown-delete-snip').click(function(e) {
        var elem = $(this);
        e.preventDefault();
        deleteSnip(elem.attr(attrSnipId), function() {
            elem.closest('tr').remove();
        });
    });

    $('.add-to-playlist-a').click(function(e) {
        var value_id = $(this).closest("tr").find(".snip-id" ).attr("value");
        var value = $(this).closest('tr').find('.snip-title').text();
        $('#add-to-playlist-modal-title').text("Add '" + value + "' to a playlist.");
        $('#selected-snip-id').val(value_id);
        $("#modal-message").addClass("hidden");
        loadModalData();
    });

    $('.share-link-a').click(function(e) {
        $('#share-link-modal-input').val(location.host  + $(this).attr('value'));
    });

    $('.playlist-li').click(function(e) {
        addToSniplist($(this).attr('value'), $('#selected-snip-id').val());
    });

    $('.save-snip').click(function(e) {
        e.preventDefault();
        saveSnipToCollection($(this).closest('tr'), $(this).closest("tr").find(".snip-id" ).attr("value"));
    });

    $('.table-snip').on('shown.bs.tooltip', function() {
        setTimeout(function() {
            $('.table-snip').tooltip('hide');
        }, 2000);
    });

    $('.table-snip').tooltip({
        trigger: 'manual'
    });
}


function deleteSnip(snipId, callBack) {

    jsRoutes.controllers.SnipCollectionController.removeSnip(snipId).ajax({
        success: function(data) {
            globalSuccessMessage(data.message);
            if(callBack) {
                callBack();
            }
        },
        error: function(xhr, status, error) {
            globalErrorMessage(JSON.parse(xhr.responseText));
        }
    });
}

function loadModalData(callBack) {

    jsRoutes.controllers.SniplistController.viewSnipListsLocalUser().ajax({
        success: function(data) {
            $("#modal-content").html(data);
            bindTableButtons();
            if(callBack)
                callBack();
        },
        error: function(xhr, status, error) {
            $("#modal-message").removeClass("hidden");
            $("#modal-message").addClass("alert-danger");
            $("#global-message-text").text(xhr.responseText);
        }
    })
}

function favouriteSnip(snip) {
    $('tr').each(function(){
        if( $(this).find('.snip-id').attr('value') == snip) {
            $(this).find('.favourite-snip').toggleClass('red');
        }
    });

    if($('#live-snip-id').text() == snip) {
        $('.mejs-info .favourite-snip').toggleClass('red');
    }
    jsRoutes.controllers.SnipCollectionController.toggleSnip(snip).ajax({
        success: function(data) {
        },
        error: function(xhr, status, error) {

        }
    })
}

function getNextSnip(callBack) {
    if(typeof(Storage) !== 'undefined') {

        var playlistId = localStorage["playlist-id"];
        var array = JSON.parse(localStorage[playlistId]);
        var snipIndex = array.indexOf($("#live-meta-info").attr(attrSnipId));
        if(snipIndex < array.length - 1) {
            snipIndex++;
        } else {
            snipIndex = 0;
        }
        var bool;
        if(snipIndex == 0) {
            bool = false;
        } else {
            bool = true;
        }
        var data = {
            snip_id: array[snipIndex],
            list_id: playlistId,
            index: snipIndex,
            autoPlay: bool
        };
        callBack(data);

    } else {
        console.log("This browser does not support LocalStorage. Playlist autoplay disabled.");
        return;
    }
}


function storePlaylist(snip) {

    if(typeof(Storage) !== 'undefined') {
        var sniplistId = $(snip).closest('.playlist-container').attr(attrSniplistId);
        var snipIdArray = getSniplistSnips(snip);

        localStorage.clear();
        localStorage["playlist-id"] = sniplistId;
        localStorage[sniplistId] = JSON.stringify(snipIdArray);

        $("#live-meta-info").attr(attrSniplistId, sniplistId);

    } else {
        console.log("This browser does not support LocalStorage. Playlist autoplay disabled.");
    }
}

function getSniplistSnips(snipList) {
    var sniplistId = snipList.closest('.playlist-container');
    var snipElements = sniplistId.find(".play-snippet");
    var snipIdArray = new Array;

    snipElements.each(function (){
        snipIdArray.push($(this).attr(attrSnipId));
    });

    return snipIdArray;
}