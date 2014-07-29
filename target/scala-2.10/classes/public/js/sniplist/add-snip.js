/**
 * Created by Thomas on 6/26/2014.
 */

//DO when the document is loaded.
$(document).ready(function() {

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




    // loop toggle
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


    // loop toggle
    MediaElementPlayer.prototype.buildinfo= function(player, controls, layers, media) {
        var
        // create the loop button
            info =
                $('<div class="mejs-info hidden">' +
                    '<div class="row"> <div class="col-md-10"> <h2 id="mejs-snip-title"></h2> </div> <div class="col-md-2"> <span style="cursor: pointer" class="glyphicon glyphicon-heart favourite"></span> </div> </div>' +
                    '<div class="row"><div class="col-md-10"><h4 id="mejs-snip-artist"></h4></div>' +
                    '<div class="col-md-2"><h4 id="mejs-snip-curr-time" style="float: right"></h4></div></div><div id="live-snip-id" value="" hidden></div>' +
                    '</div>')
                    // append it to the toolbar
                    .appendTo(controls)
                    // add a click toggle event
                    .click(function() {

                    });
    }




    //Initializing the MediaElementPlayer and assigning it to a global variable.


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

                $(".favourite").click(function() {

                    $(this).toggleClass('red');
                    saveSnipToCollection(null, $("#live-snip-id").text());
                });

            }
        });
    }



    bindExternalPlayerButtons();

});

function getVideo(songUrl, callBack) {
    jsRoutes.controllers.Snips.getVideo(songUrl).ajax({
        success: function(data) {
            callBack(data);
        },
        error: function(data) {
            callBack(data);
        }
    })
}

function getSnip(snipId, callBack) {
    jsRoutes.controllers.Snips.getSnip(snipId).ajax({
        success: function(data) {
            callBack(data);
        },
        error: function(data) {
            callBack(data);
        }
    })
}

function loadVideoPlayer() {

    var vidArray = [{ src: "https://www.youtube.com/v/" + $("input[name=snip_video_id]").val() + "?version=3", type: 'video/youtube' }];
    globalPlayer.setSrc(vidArray);
    globalPlayer.media.load();
    globalPlayer.setVolume(0.2);
    globalPlayer.play();
}

function saveSnip() {

    $("input[name=snip_title]").val($("#title-input").val());
    $("input[name=snip_artist]").val($("#artist-input").val());
    $("input[name=snip_album]").val($("#album-input").val());

    var formData = new FormData($("#hidden-add-snip-form")[0]);
    jsRoutes.controllers.Snips.saveSnip().ajax({
        data: formData,
        cache: false,
        contentType: false,
        processData: false,
        success: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").removeClass("alert-danger");
            $("#global-message").addClass("alert-success");
            $("#global-message").text("Your snip has been saved!");
        },
        error: function(data) {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message").text(data.error);
        }

    })
}

function bindExternalPlayerButtons() {

    $('#url-input').keypress(function(e) {
        if( e.which == 13) {
            getVideo($(this).val(), addSnipGetVideo);
        }
    });

    $('#url-input-btn').click(function() {
        getVideo($('#url-input').val(), addSnipGetVideo);
    });


    $('#save_snip_btn').click(function() {
        saveSnip();
    });

    $('#play-snip-button').click(function() {
        globalPlayer.setCurrentTime(parseInt($("input[name=time_min]").val()));
        globalPlayer.play();
    });

    $(".play-snippet").click(function() {
        var snipId = $(this).closest("tr").find(".snip-id").attr("id");
        /*var videoId = $(this).closest("tr").find(".snip-video-id").attr("value");
        var startTime = $(this).closest("tr").find(".snip-video-startTime").attr("value");
        var endTime = $(this).closest("tr").find(".snip-video-endTime").attr("value");
        var title = $(this).closest("tr").find(".snip-title").text();
        var artist = $(this).closest("tr").find(".snip-artist").text();*/



        getSnip(snipId, playVideo);

    });


}


function addSnipGetVideo(data) {
    if(data.error) {
        $("#global-message").removeClass("hidden");
        $("#global-message").addClass("alert-danger");
        $("#global-message").text(data.error);
    } else {
        $("#global-message").addClass("hidden");
        $("#title-input").val(data.title);
        $("#artist-input").val(data.artist);
        $("#album-input").val(data.album);

        $("input[name=snip_title]").val(data.title);
        $("input[name=snip_video_id]").val(data.video_id);

        $("#slider").rangeSlider("option", "bounds", {min: 0, max: data.duration});
        $("#slider").resize();

        loadVideoPlayer();
    }
}

function playVideo(data) {

    globalAudioPlayer.media.pluginApi.cueVideoById({
        videoId: data.video_id,
        startSeconds: data.start_time,
        endSeconds: data.end_time
    });

    globalAudioPlayer.load();
    globalAudioPlayer.setVolume(0.2);
    globalAudioPlayer.play();

    $("#mejs-snip-title").text(data.title);
    $("#mejs-snip-artist").text(data.artist);
    // $("#live-snip-id").text(snipId);
    $("#live-snip-id").text(data.snip_id);

    $('#watch-youtube').click(function() {
        window.open('http://www.youtube.com/watch/' + data.video_id);
    });


    if(data && data.favourite == true) {
        $(".favourite").toggleClass('red');
    }

    $(".mejs-info").removeClass('hidden');
}