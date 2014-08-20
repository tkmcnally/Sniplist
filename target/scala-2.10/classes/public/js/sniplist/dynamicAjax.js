/**
 * Created by Thomas on 7/30/2014.
 */

var globalStateId = 0;

$(document).ready(function(){
    ajaxBindings();

});

function bindDynamicLinkClick() {
    $(".dynamic-link").unbind();
    $(".dynamic-link").click(function(e) {
        e.preventDefault();
        var url = $(this).attr('href');


        var data = {
            url: url,
            contentType: 'application/javascript',
            type: 'GET'
        };
        replaceContent(data, null);

        var stateObj = {id: 1};

        window.history.pushState(stateObj, "Title", url);
    });

    $(".dynamic-form").unbind();
    $(".dynamic-form").click(function(e) {
        e.preventDefault();
        var formTag = $(this).closest('form');
        var url = formTag.attr('action');
        var formData = new FormData($(this).closest('form')[0]);
        console.log(formData);
        var data = {
            url: url,
            contentType: false,
            //payload: $("#userSettingsForm").serialize(),
            payload: formData,
            type: 'POST'
        };
        replaceContent(data, function(view) {
            loadContentContainer(view);
        });

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

    $("li a").filter(function (){
        if($(this).href == data.url) {
            $(this).parent().addClass('active');
        } else {
            $(this).parent().removeClass('active');
        }
    });

    $.ajax({
        url : data.url,
        data : data.payload,
        contentType: data.contentType,
        type: data.type,
        processData: false,
        success: function(data) {
            loadContentContainer(data);
            if(callBack != null){
                callBack(data);
            }
        },
        error: function(data) {
            $('#wrapper-content').unblock();
            if(callBack != null){
                callBack(data.responseText);
            }
        }
    });
}

function loadContentContainer(data) {
    $('#wrapper-content').unblock();
    $("#wrapper-content").html(data);

    addSnipReady();
    viewSniplistsReady();
    viewSnipsReady();

    bindDynamicLinkClick();

    globalMessageHide();

}

function ajaxBindings() {
    bindDynamicLinkClick();

    $(window).on('popstate', function(evt) {
        var data = {
            url: window.location.pathname,
            contentType: 'application/javascript',
            type: 'GET'
        };
        replaceContent(data, null);

    });
}

function uploadPhoto(form, callBack) {

    $.ajax({
        url : form.attr('action'),
        data : new FormData(form[0]),
        contentType: false,
        type: 'POST',
        processData: false,
        dataType: 'json',
        success: function(data) {
          $('#userProfilePhoto').attr('src', data.url);
            if(callBack != null) {
                callBack();
            }

        },
        error: function(data) {
           $('#form-error').removeClass("hidden");
           $('#form-message-text').html(JSON.parse(data.responseText).error);
        }
    });
}