/**
 * Created by Thomas on 6/26/2014.
 */

$(document).ready(function() {

    //Bind buttons after table creation.
    bindTableButtons();
});

function bindTableButtons() {
    $('.dropdown-delete-snip').click(function(e) {
        e.preventDefault();
        deleteSnip($(this));
    });
}