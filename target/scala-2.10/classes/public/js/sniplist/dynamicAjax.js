/**
 * Created by Thomas on 7/30/2014.
 */

var globalStateId = 0;

$(document).ready(function(){
    bindDynamicLinkClick();

    $(window).on('popstate', function(evt) {
        var data = {
            url: window.location.pathname,
            type: 'application/javascript'
        };
        replaceContent(data, null);

    });



});

function bindDynamicLinkClick() {
    $(".dynamic-link").unbind();
    $(".dynamic-link").click(function(e) {
        e.preventDefault();
        var url = $(this).attr('href');


        var data = {
            url: url,
            type: 'application/javascript'
        };
        replaceContent(data, null);

        var stateObj = {id: 1};

        window.history.pushState(stateObj, "Title", url);
    });

}

function replaceContent(data, callBack) {

    $('#wrapper-content').block({
        message: '<h4>Loading...</h4><img class="ajax-loading" src="/assets/img/ajax-loader.gif" alt="loading"></div>',
        css: {
            border: '5px solid #F4712'
        },
        showOverlay: false,
        blockMsgClass: 'loading-block'
    });

    var url = data.url;
    $.ajax({
        url : data.url,
        data : data,
        contentType: data.type,
        success: function(data) {
            $('#wrapper-content').unblock();
            $("#wrapper-content").html(data);

            addSnipReady();
            viewSniplistsReady();
            viewSnipsReady();

            bindDynamicLinkClick();
        },
        error: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message").text(data.error);
        }
    });
}