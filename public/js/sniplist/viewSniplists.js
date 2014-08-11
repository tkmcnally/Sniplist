/**
 * Created by Thomas on 6/26/2014.
 */

function loadSnipLists(localUser, fn) {
    jsRoutes.controllers.SniplistController.loadSnipListByUser(localUser).ajax({
        success: function(data) {
            $("#sniplist-array").html(data).hide().fadeIn(100);
            initialize();
            bindExternalPlayerButtons();
        },
        error: function(xhr, status, error) {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message").text(xhr.responseText);
        }
    });
}

function createSnipList() {

    var formData = new FormData();
    formData.append('sniplist_name', $("#new-sniplist-name").val());

    jsRoutes.controllers.SniplistController.saveSnipList().ajax({
        data: formData,
        cache: false,
        contentType: false,
        processData: false,
        success: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").removeClass("alert-danger");
            $("#global-message").addClass("alert-success");
            $("#global-message").text(data.message);
            var localUser = $('#sniplist-array').attr('value');
            loadSnipLists(localUser);
        },
        error: function(xhr, status, error) {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message").text(xhr.responseText);
        }
    });
}

function deleteSnipList(snipList_id) {
    jsRoutes.controllers.SniplistCollectionController.toggleSniplist(snipList_id).ajax({
        success: function(data) {
            var tableRow = $("table").filter(function() {
                return $(this).attr('id') == snipList_id;
            });

            tableRow.remove();


            $("#global-message").removeClass("hidden");
            $("#global-message").removeClass("alert-danger");
            $("#global-message").addClass("alert-success");
            $("#global-message").text(data.message);
            var localUser = $('#sniplist-array').attr('value');
            loadSnipLists(localUser);
        },
        error: function(xhr, status, error) {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message").text(xhr.responseText);
        }
    });
}

function favouriteSniplist(snipList) {
    $('table').each(function(){
        if( $(this).attr('id') == snipList) {
            $(this).find('.favourite-sniplist').toggleClass('red');
        }
    });
    jsRoutes.controllers.SniplistCollectionController.toggleSniplist(snipList).ajax({
        success: function(data) {
        },
        error: function(xhr, status, error) {

        }
    })
}



function deleteSnipFromSnipList(snipList, snip) {
    jsRoutes.controllers.SniplistController.deleteFromSnipList(snipList, snip).ajax({
        success: function(data) {
            var localUser = $('#sniplist-array').attr('value');
            loadSnipLists(localUser);
        },
        error: function(xhr, status, error) {

        }
    })
}

$(document).ready(viewSniplistsReady);

function viewSniplistsReady() {

    $('#new-playlist').popover({
        html: true,
        content: '<div class="input-group input-group-sm"><span class="input-group-addon">Name:</span><input id="new-sniplist-name" type="text" class="form-control" placeholder="Birthday Jams"><span class="input-group-btn"><button id="create-playlist-btn" class="btn btn-primary" type="button">Submit</button></span></div>'
    }).parent().on('click', '#create-playlist-btn', function() {
        createSnipList();
        $('#new-playlist').popover('hide');
    });

    initialize();

}

function initialize() {

    $('.remove-playlist').click(function(e) {
        deleteSnipList($(this).closest('table').attr('id'));
    });

    $('.remove-snip-from-sniplist').click(function(e) {
        deleteSnipFromSnipList($(this).closest('table').attr('id'), $(this).attr('value'));
    });

    //Dismiss popup whenever clicking outside
    $('html').on('click', function(e) {
        if (typeof $(e.target).data('original-title') == 'undefined' &&
            !$(e.target).parents().is('.popover.in')) {
            if( $('[data-original-title]').length) {
                $('[data-original-title]').popover('hide');
            }
        }
    });

    $(".favourite-sniplist").click(function() {
        favouriteSniplist($(this).closest('table').attr('id'));
    });

    $(".favourite-snip").click(function() {
        favouriteSnip($(this).closest("tr").find(".snip-id").attr("value"));
    });


}
