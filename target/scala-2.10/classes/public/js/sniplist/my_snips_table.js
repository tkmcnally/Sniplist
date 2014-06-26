/**
 * Created by Thomas on 6/26/2014.
 */

$(document).ready(function() {

    //Create Table.
    $("table").tablecloth({
        theme: "dark",
        bordered: true,
        condensed: true,
        striped: true,
        sortable: true,
        clean: true,
        cleanElements: "th td",
        customClass: "my-table"
    });

    //Bind buttons after table creation.
    bindTableButtons();
});

function bindTableButtons() {
    $('.dropdown-delete-snip').click(function(e) {
        e.preventDefault();
        deleteSnip($(this));
    });
}