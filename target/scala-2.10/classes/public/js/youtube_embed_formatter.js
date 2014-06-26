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

            $("#player1")[0].player.media.setSrc("https://www.youtube.com/watch?v=" + data.video_id);
            $("#player1")[0].player.load();
        },
        error: function() {
            $("#global-message").removeClass("hidden");
            $("#global-message").addClass("alert-danger");
            $("#global-message").text("Invalid YouTube URL! Please try again.");
        }
    })
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


$(document).ready(function() {


    String.prototype.toHHMMSS = function () {
        var sec_num = parseInt(this, 10); // don't forget the second param
        var hours   = Math.floor(sec_num / 3600);
        var minutes = Math.floor((sec_num - (hours * 3600)) / 60);
        var seconds = sec_num - (hours * 3600) - (minutes * 60);

        if (hours   < 10) {hours   = "0"+hours;}
        if (minutes < 10) {minutes = "0"+minutes;}
        if (seconds < 10) {seconds = "0"+seconds;}
        var time = "";
        if(hours == 0)
            time = minutes+':'+seconds;
        else
            time = hours+':'+minutes+':'+seconds;
        return time;
    }


    // create player
    var mediaElement = $('#player1').mediaelementplayer({
        // add desired features in order
        // I've put the loop function second,
        startVolume: 0.0,
        features: ['playpause','current','volume','slider'],
        success: function(mediaElement, domObject) {
            mediaElement.setMuted();
            mediaElement.addEventListener('timeupdate', function(e) {
                var slider_min = $("#slider").rangeSlider("min");
                var slider_max = $("#slider").rangeSlider("max");

                if(mediaElement.currentTime > slider_max) {
                    mediaElement.setCurrentTime(slider_min);
                }

                if(mediaElement.currentTime < slider_min) {
                    mediaElement.setCurrentTime(slider_min);
                }
            }, false);

        }
    });





});



