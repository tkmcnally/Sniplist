/**
 * Created by Thomas on 6/26/2014.
 */

var attrSnipId = "data-snip-id";
var attrSniplistId = "data-sniplist-id";

//DO when the document is loaded.
$(document).ready(addSnipReady);

function addSnipReady() {

    //Adding built-in prototype for String to format Seconds to HH:MM:SS for the JQRangeSlider.
    String.prototype.toHHMMSS = function () {
        var sec_num = parseInt(this, 10);
        var hours = Math.floor(sec_num / 3600);
        var minutes = Math.floor((sec_num - (hours * 3600)) / 60);
        var seconds = sec_num - (hours * 3600) - (minutes * 60);

        if (hours < 10) {
            hours = "0" + hours;
        }
        if (minutes < 10) {
            minutes = "0" + minutes;
        }
        if (seconds < 10) {
            seconds = "0" + seconds;
        }
        var time = "";
        if (hours == 0) {
            time = minutes + ':' + seconds;
        } else {
            time = hours + ':' + minutes + ':' + seconds;
        }
        return time;
    }




    // MediaPlayer custom button for YouTube redirect.
    MediaElementPlayer.prototype.buildurltube = function(player, controls, layers, media) {
        var
        // create the loop button
            urltube =
                $('<div class="mejs-button mejs-youtube-button mejs-youtube">' +
                    '<button type="button" aria-controls="mep_0" title="WatchYoutube" aria-label="WatchYoutube" id="watch-youtube"></button>' +
                    '</div>')
                    // append it to the toolbar
                    .appendTo(controls)
                    // add a click toggle event
                    .click(function() {

                    });
    }


    // MediaPlayer custom information div for the currently playing Snip.
    MediaElementPlayer.prototype.buildinfo= function(player, controls, layers, media) {
        var
        // create the loop button
            info =
                $(  '<div id="live-meta-info" class="mejs-info hidden" data-snip-id="" data-sniplist-id="">' +
                        '<div class="row"> ' +
                            '<div class="col-md-10"> ' +
                                '<h2 id="mejs-snip-title">' +
                                '</h2> ' +
                            '</div> ' +
                            '<div class="col-md-2"> ' +
                                '<i class="fa fa-heart favourite-snip" data-snip-id=""></i>' +
                            '</div> ' +
                        '</div>' +
                        '<div class="row">' +
                            '<div class="col-md-10">' +
                                '<h4 id="mejs-snip-artist"></h4>' +
                            '</div>' +
                            '<div class="col-md-2">' +
                                '<h4 id="mejs-snip-curr-time" style="float: right">' +
                                '</h4>' +
                            '</div>' +
                        '</div>' +
                    '</div>')
                    // append it to the toolbar
                    .appendTo(controls)
                    // add a click toggle event
                    .click(function() {

                    });
    }

    // Initializing the MediaElementPlayer and assigning it to a global variable.
    if ($("#player").length) {
        //$("#sticky-footer").remove();
        globalPlayer = new MediaElementPlayer('#player', {
            //Configure intialization of MediaElementPlayer.
            plugins: ['flash', 'youtube'],
            startVolume: 0.2,
            videoVolume: 'horizontal',
            features: ['playpause','volume'],
            success: function (mediaElement, domObject) {

                //Create and bind the JQRangeSlider after player creation.
                createSlider();

                //Event listener to validate time is within slider bounds.
                mediaElement.addEventListener('timeupdate', function (e) {
                        var slider_min = parseInt($("input[name=time_min]").val());
                        var slider_max = parseInt($("input[name=time_max]").val());

                        //console.log(slider_min + " " + slider_max);

                        if (mediaElement.currentTime > slider_max) {
                            mediaElement.setCurrentTime(slider_min);
                        }

                        if (mediaElement.currentTime < slider_min) {
                            mediaElement.setCurrentTime(slider_min);
                        }
                    },
                    false
                );


                getVideo("https://www.youtube.com/watch?v=BB7R0ZY9w94", addSnipGetVideo);
            }
        });
    }

    if ($("#audioPlayer").length) {
        //Initializing the MediaElementPlayer and assigning it to a global variable.
        globalAudioPlayer = new MediaElementPlayer('#audioPlayer', {
            //Configure intialization of MediaElementPlayer.
            plugins: ['flash', 'youtube'],
            startVolume: 0.2,
      //      features: ['playpause', 'current', 'volume'],
            alwaysShowControls: true,
            features: ['playpause','urltube','info','volume'],
            audioVolume: 'vertical',
            audioWidth: 450,
            audioHeight:51,
            iPadUseNativeControls: true,
            iPhoneUseNativeControls: true,
            AndroidUseNativeControls: true,

            success: function (mediaElement, domObject) {
                //Event listener to validate time is within slider bounds.
                mediaElement.addEventListener('timeupdate', function (e) {
                        var time = mediaElement.currentTime;
                        $("#mejs-snip-curr-time").text(time.toString().toHHMMSS());
                    },
                    false
                );

                mediaElement.addEventListener('play', function (e) {
                    setPlayButtonView();
                }, false);

                mediaElement.addEventListener('pause', function (e) {
                    setPlayButtonView();
                }, false);


                mediaElement.addEventListener('ended', function (e) {
                        getNextSnip(loadNextSnip);
                    },
                    false
                );
            }
        });
    }

    bindExternalPlayerButtons();

}

function loadNextSnip(data) {
    getSnip(data.snip_id, loadSnip, data.autoPlay);

}

function getVideo(songUrl, callBack) {
    jsRoutes.controllers.SnipController.getVideo(songUrl).ajax({
        success: function(data) {
            if(callBack) {
                callBack(data);
            } else {
                return data;
            }
        },
        error: function(data) {
            if(callBack) {
                callBack(data);
            }
        }
    })
}

function getSnip(snipId, callBack, autoPlay) {
    jsRoutes.controllers.SnipController.getSnip(snipId).ajax({
        success: function(data) {
                callBack(data, autoPlay);

        },
        error: function(data) {
            if(callBack) {
                callBack(data);
            } else {
                return data;
            }
        }
    })
}


// [Add Snip] - Change source of MediaPlayer and autoPlay.
function loadVideoPlayer() {
    var vidArray = [{ src: "https://www.youtube.com/v/" + $("input[name=snip_video_id]").val() + "?version=3", type: 'video/youtube' }];
    globalPlayer.setSrc(vidArray);
    globalPlayer.media.load();
    globalPlayer.setVolume(0.2);
    globalPlayer.play();
}

// [Add Snip] - Submit form data for new Snip to be created.
function saveSnip() {

    $("input[name=snip_title]").val($("#title-input").val());
    $("input[name=snip_artist]").val($("#artist-input").val());
    $("input[name=snip_album]").val($("#album-input").val());

    var formData = new FormData($("#hidden-add-snip-form")[0]);
    jsRoutes.controllers.SnipController.createSnip().ajax({
        data: formData,
        cache: false,
        contentType: false,
        processData: false,
        success: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").removeClass("alert-danger");
            $("#global-message").addClass("alert-success");
            $("#global-message-text").text("Your snip has been saved!");
        },
        error: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message-text").text(data.error);
        }
    })
}

function addSnipGetVideo(data) {
    if(data.error) {
        $("#global-message").removeClass("hidden");
        $("#global-message").addClass("alert-danger");
        $("#global-message-text").text(data.error);
    } else {
        $("#global-message").addClass("hidden");
        $("#title-input").val(data.title);
        $("#artist-input").val(data.artist);
        $("#album-input").val(data.album);
        $("#snip-thumbnail").attr('src', data.thumbnail_url);

        $("input[name=snip_title]").val(data.title);
        $("input[name=snip_video_id]").val(data.video_id);
        $("input[name=snip_artist]").val(data.artist);
        $("input[name=snip_album]").val(data.album);

        $("#slider").rangeSlider("option", "bounds", {min: 0, max: data.duration});
        $("#slider").resize();

        loadVideoPlayer();
    }
}


// [Main] - Set new source for audio player and autoPlay.
function loadSnip(data, autoPlay) {
    var liveSnip = $("#live-meta-info");
    if(data.snip_id != liveSnip.attr(attrSnipId)) {

        $("#mejs-snip-title").text(data.title);
        $("#mejs-snip-artist").text(data.artist);

        $("#live-meta-info").attr(attrSnipId, data.snip_id);
        if(data.owned == false) {
            $("#live-meta-info").find('.favourite-snip').addClass('fav');
        }
        $("#live-meta-info").find('.favourite-snip').attr(attrSnipId, data.snip_id);

        if (data && data.favourite == true) {
            $(".mejs-info .favourite-snip").addClass('red');
            $(".mejs-info .favourite-snip").removeClass('black');
        } else {
            $(".mejs-info .favourite-snip").removeClass('red');
            $(".mejs-info .favourite-snip").addClass('black');
        }

        globalAudioPlayer.media.pluginApi.cueVideoById({
            videoId: data.video_id,
            startSeconds: data.start_time,
            endSeconds: data.end_time
        });

        globalAudioPlayer.load();
        globalAudioPlayer.setVolume(0.2);
        if (autoPlay) {
            globalAudioPlayer.play();
        }

        $('#watch-youtube').click(function () {
            window.open('http://www.youtube.com/watch/' + data.video_id);
        });

        $(".favourite-snip").unbind();

        $(".favourite-snip").click(function() {
            if($(this).hasClass('fav')) {
                favouriteSnip($(this).attr(attrSnipId));
            }
            $(this).toggleClass('red');
        });

        $("#live-meta-info").removeClass('hidden');

    } else {
        if( globalAudioPlayer.media.paused == true) {
            globalAudioPlayer.play();
        } else {
            globalAudioPlayer.pause();
        }
    }

}

function setPlayButtonView() {
    var snip_id = $("#live-meta-info");
    $('.play-snippet').each(function(){
        if( $(this).attr(attrSnipId) == snip_id.attr(attrSnipId)) {
            $(this).toggleClass('fa-play');
            $(this).toggleClass('fa-pause');
        } else {
            $(this).addClass("fa-play");
            $(this).removeClass('fa-pause');
        }
    });

}

function followUser(followBtn) {
    var oldBtn = $(followBtn);

    jsRoutes.controllers.Application.toggleFollow(followBtn.attr('value')).ajax({
        success: function(data) {

            if (data.following == true) {
                $(followBtn).addClass("btn-success");
                $(followBtn).removeClass("btn-primary");
                $(followBtn).html("Following");
            } else {
                $(followBtn).removeClass("btn-success");
                $(followBtn).addClass("btn-primary");
                $(followBtn).html("Follow");
            }
        },
        error: function(data) {
            if($(oldBtn).hasClass('btn-primary')) {
                $(followBtn).addClass("btn-primary");
                $(followBtn).removeClass("btn-success");
            } else {
                $(followBtn).removeClass("btn-primary");
                $(followBtn).addClass("btn-success");
            }

            $(followBtn).html(oldBtn.html());
        }
    })
}

function globalErrorMessage(message) {
    $("#global-message").removeAttr('class');
    $("#global-message").addClass("col-md-8 alert alert-danger alert-dismissable");
    $("#global-message-icon").removeAttr('class');
    $("#global-message-icon").addClass('fa fa-exclamation-triangle');
    $("#global-message-text").text(message);
}

function globalSuccessMessage(message) {
    $("#global-message").removeAttr('class');
    $("#global-message").addClass("col-md-8 alert alert-success alert-dismissable");
    $("#global-message-icon").removeAttr('class');
    $("#global-message-icon").addClass("fa fa-check-circle");
    $("#global-message-text").text(message);
}

function globalMessageHide() {
    $("#global-message").addClass("hidden");
}




function bindExternalPlayerButtons() {

    // [Add Snip] - Enter trigger for URL input box.
    $('#url-input').keypress(function(e) {
        if( e.which == 13) {
            getVideo($(this).val(), addSnipGetVideo);
        }
    });

    // [Add Snip] - Button click trigger for URL input box.
    $('#url-input-btn').click(function() {
        getVideo($('#url-input').val(), addSnipGetVideo);
    });

     //[Add Snip] - Button click trigger to Save Snip.
     $('#save_snip_btn').click(function() {
        saveSnip();
     });

    // [Add Snip] - Button click trigger to seek to beginning of range slider.
    $('#play-snip-button').click(function() {
        globalPlayer.setCurrentTime(parseInt($("input[name=time_min]").val()));
        globalPlayer.play();
    });

    $(".follow-user-btn").click(function() {
        followUser($(this));
    });

    /* DATE PICKER */
    $('#birth-date-picker').datetimepicker({
        pickTime: false
    });

    /* NAVBAR ACTIVE SELECTOR */
    $('.nav-sidebar li').click(function(e) {
        $('.nav-sidebar li.active').removeClass('active');
        var $this = $(this);
        if (!$this.hasClass('active')) {
            $this.addClass('active');
        }
        e.preventDefault();
    });

    $("#uploadButton").click(function() {
        $('#userPhotoInput').click();
    });

    $('#userPhotoInput').change(function(e) {
        $("#uploadButton").button('loading');
        uploadPhoto($(this).closest('form'), function() {
            $("#uploadButton").button('reset');
        });

    });


    // [PLAY SNIP]
    $(".play-snippet").click(function() {
        var snipId = $(this).attr(attrSnipId);
        var sniplistId = $(this).closest('.playlist-container').attr(attrSniplistId);

        storePlaylist($(this));
        getSnip(snipId, function(data) {
            loadSnip(data, true);
        });
    });


    $(".fav").hover(function() {
        $(this).toggleClass("red");
    });

    $(".favourite-sniplist").click(function() {
        if($(this).hasClass('fav')) {
            favouriteSniplist($(this).attr(attrSniplistId));
        }
        $(this).toggleClass('red');
    });

    $(".favourite-snip").click(function() {
        if($(this).hasClass('fav')) {
            favouriteSnip($(this).attr(attrSnipId));
        }
        $(this).toggleClass('red');
    });


}
