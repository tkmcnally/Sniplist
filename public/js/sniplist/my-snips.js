/**
 * Created by Thomas on 6/26/2014.
 */

$(document).ready(function() {

    //Bind buttons after table creation.
    bindTableButtons();
});

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
        var value_id = $(this).closest("tr").find(".snip-id" ).attr("id");
        var value = $(this).closest('tr').find('.snip-title').text();
        $('#add-to-playlist-modal-title').text("Add '" + value + "' to a playlist.");
        $('#selected-snip-id').val(value_id);

        loadModalData();
    });

    $('.playlist-li').click(function(e) {
        addToSniplist($(this).attr('value'), $('#selected-snip-id').val());
    });

    $('.save-snip').click(function(e) {
        e.preventDefault();
        saveSnipToCollection($(this).closest('tr'), $(this).closest("tr").find(".snip-id" ).attr("id"));
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

    var snip = elem.closest("tr").find(".snip-id" ).attr("id");
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
    jsRoutes.controllers.SnipLists.getSnipListsByUser().ajax({
        success: function(data) {
            $("#modal-content").html(data);
            bindTableButtons();
            $("#modal-message").addClass("hidden");
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

function saveSnipToCollection(snipRow, snip) {

    jsRoutes.controllers.MySnipsController.toggleSnip(snip).ajax({
        success: function(data) {
            if(snipRow) {
                snipRow.tooltip('show');
            }
        },
        error: function(xhr, status, error) {
            if(snipRow) {
                snipRow.text(xhr.responseText);
            }

        }
    })
}
