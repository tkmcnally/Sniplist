/**
 * Created by Thomas on 6/26/2014.
 */
$(document).ready(viewSnipsReady);

function viewSnipsReady() {

    //Bind buttons after table creation.
    bindTableButtons();
}

function addToSniplist(snipList, snip) {

    jsRoutes.controllers.SnipLists.addToSnipList(snipList, snip).ajax({
        success: function(data) {

            loadModalData(function() {
                $("#modal-message").removeClass("hidden");
                $("#modal-message").removeClass("alert-danger");
                $("#modal-message").addClass("alert-success");
                $("#modal-message").text(data);
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
        e.preventDefault();
        deleteSnip($(this));
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


function deleteSnip(elem) {

    var snip = elem.closest("tr").find(".snip-id" ).attr("value");
    jsRoutes.controllers.MySnipsController.removeSnip(snip).ajax({
        success: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").removeClass("alert-danger");
            $("#global-message").addClass("alert-success");
            $("#global-message").text(data);
            $(elem.closest("tr").remove());
        },
        error: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message").text(data.error);
        }
    });
}

function loadModalData(callBack) {

    jsRoutes.controllers.SnipLists.viewSnipListsLocalUser().ajax({
        success: function(data) {
            $("#modal-content").html(data);
            bindTableButtons();
            if(callBack)
                callBack();
        },
        error: function(xhr, status, error) {
            $("#modal-message").removeClass("hidden");
            $("#modal-message").addClass("alert-danger");
            $("#modal-message").text(xhr.responseText);
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
    jsRoutes.controllers.MySnipsController.toggleSnip(snip).ajax({
        success: function(data) {
        },
        error: function(xhr, status, error) {
        }
    })
}

function getNextSnip(callBack) {

    var live_list_id = $("#live-snip-list-id").text();
    var id = $("#live-snip-id").text();
    var type = $("#live-list-type").text();
    var d = {
                playlistType: type,
                list_id: live_list_id,
                snip_id: id
            };
    jsRoutes.controllers.MySniplistsController.getNextSnip().ajax({
        type :  "POST",
        cache: false,
        contentType: 'application/json',
        processData: false,
        data: JSON.stringify(d),
        success: function(data) {
            callBack(data);
        },
        error: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message").text(data.error);
        }
    })

}