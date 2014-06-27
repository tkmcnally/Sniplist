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

    //Initializing the MediaElementPlayer and assigning it to a global variable.


    if ($("#player").length) {
        $("#sticky-footer").remove();
        globalPlayer = new MediaElementPlayer('#player', {
            //Configure intialization of MediaElementPlayer.
            plugins: ['flash', 'youtube'],
            startVolume: 0.2,
            features: ['playpause', 'current', 'volume', 'slider'],
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

                getVideo("https://www.youtube.com/watch?v=BB7R0ZY9w94");
            }
        });
    }

    if ($("#audioPlayer").length) {
        //Initializing the MediaElementPlayer and assigning it to a global variable.
        globalAudioPlayer = new MediaElementPlayer('#audioPlayer', {
            //Configure intialization of MediaElementPlayer.
            plugins: ['flash', 'youtube'],
            startVolume: 0.2,
            features: ['playpause', 'current', 'volume'],
            success: function (mediaElement, domObject) {
            }
        });
    }



    bindExternalPlayerButtons();

});

function getVideo(songUrl) {
    jsRoutes.controllers.Snips.getVideo(songUrl).ajax({
        success: function(data) {
            $("#global-message").addClass("hidden");
            $("#title-input").val(data.title);
            $("#artist-input").val(data.artist);
            $("#album-input").val(data.album);

            $("input[name=snip_title]").val(data.title);
            $("input[name=snip_video_id]").val(data.video_id);

            $("#slider").rangeSlider("option", "bounds", {min: 0, max: data.duration});
            $("#slider").resize();

            loadVideoPlayer();

        },
        error: function() {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message").text("Invalid YouTube URL! Please try again.");
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

function deleteSnip(elem) {

    var snip = elem.closest("tr").find(".snip-id" ).attr("id");
    jsRoutes.controllers.Snips.deleteSnip(snip).ajax({
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
            $("#global-message").text(data);
        }
    });
}

function bindExternalPlayerButtons() {

    $('#url-input').keypress(function(e) {
        if( e.which == 13) {
            getVideo($(this).val()) ;
        }
    });

    $('#url-input-btn').click(function() {
        getVideo($('#url-input').val());
    });


    $('#save_snip_btn').click(function() {
        saveSnip();
    });

    $('#play-snip-button').click(function() {
        globalPlayer.setCurrentTime(parseInt($("input[name=time_min]").val()));
        globalPlayer.play();
    });

    $(".play-snippet").click(function() {
        var videoId = $(this).closest("tr").find(".snip-video-id").attr("value");
        var startTime = $(this).closest("tr").find(".snip-video-startTime").attr("value");
        var endTime = $(this).closest("tr").find(".snip-video-endTime").attr("value");

        globalAudioPlayer.media.pluginApi.cueVideoById({
            videoId: videoId,
            startSeconds: startTime,
            endSeconds: endTime
        });
        globalAudioPlayer.load();
        globalAudioPlayer.setVolume(0.2);
        globalAudioPlayer.play();
    });
}


