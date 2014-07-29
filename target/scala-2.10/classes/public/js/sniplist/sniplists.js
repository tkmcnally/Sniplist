/**
 * Created by Thomas on 6/26/2014.
 */

function loadSnipLists(localUser, fn) {
    jsRoutes.controllers.SnipLists.loadSnipListByUser(localUser).ajax({
        success: function(data) {
            $("#sniplist-array").html(data).hide().fadeIn(100);
            initialize();
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

    jsRoutes.controllers.SnipLists.saveSnipList().ajax({
        data: formData,
        cache: false,
        contentType: false,
        processData: false,
        success: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").removeClass("alert-danger");
            $("#global-message").addClass("alert-success");
            $("#global-message").text(data);
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
    jsRoutes.controllers.SnipLists.deleteSnipList(snipList_id).ajax({
        success: function(data) {
            var tableRow = $("table").filter(function() {
                return $(this).attr('value') == snipList_id;
            });

            tableRow.remove();


            $("#global-message").removeClass("hidden");
            $("#global-message").removeClass("alert-danger");
            $("#global-message").addClass("alert-success");
            $("#global-message").text(data);
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

function deleteSnipFromSnipList(snipList, snip) {
    jsRoutes.controllers.SnipLists.deleteFromSnipList(snipList, snip).ajax({
        success: function(data) {
            var localUser = $('#sniplist-array').attr('value');
            loadSnipLists(localUser);
        },
        error: function(xhr, status, error) {
            $("#modal-message").removeClass("hidden");
            $("#modal-message").addClass("alert-danger");
            $("#modal-message").text(xhr.responseText);
        }
    })
}

$(document).ready(function() {

    $('#new-playlist').popover({
        html: true,
        content: '<div class="input-group input-group-sm"><span class="input-group-addon">Name:</span><input id="new-sniplist-name" type="text" class="form-control" placeholder="Birthday Jams"><span class="input-group-btn"><button id="create-playlist-btn" class="btn btn-primary" type="button">Submit</button></span></div>'
    }).parent().on('click', '#create-playlist-btn', function() {
        createSnipList();
        $('#new-playlist').popover('hide');
    });

    initialize();

});

function initialize() {

    $('.remove-playlist').click(function(e) {
        deleteSnipList($(this).closest('table').attr('value'));
    });

    $('.remove-snip-from-sniplist').click(function(e) {
        deleteSnipFromSnipList($(this).closest('table').attr('value'), $(this).attr('value'));
    });

    //Dismiss popup whenever clicking outside
    $('html').on('click', function(e) {
        if (typeof $(e.target).data('original-title') == 'undefined' &&
            !$(e.target).parents().is('.popover.in')) {
            $('[data-original-title]').popover('hide');
        }
    });
}
