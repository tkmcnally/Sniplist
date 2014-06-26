

function sliderFormatSeconds(seconds) {
    var hours = Math.floor(seconds/3600);
    var minutes = (seconds - (hours*3600)) / 60;
    var seconds = ((seconds - (hours*3600)) - (minutes * 60));

    return hours +":"+(minutes < 10 ? '0' + minutes : minutes)+ ":" + (seconds < 10 ? '0' + seconds : seconds)
}

$(document).ready(function() {

    (function ($) {
        // loop toggle
        MediaElementPlayer.prototype.buildslider = function (player, controls, layers, media) {
            var
            // create the loop button
                slider =
                    $('<div class="sniplist-bar ' + ((player.options.slider)) + '">' +
                        '<div id="slider1"></div>' +
                        '</div>')
                        // append it to the toolbar
                        .appendTo(controls)
                        // add a click toggle event
                        .click(function () {

                        });

            $("#slider").rangeSlider(
                {range: {min: 20, max: 20}},
                {bounds: {min: 0, max: 1}},
                {formatter: function (val) {

                   return val.toString().toHHMMSS();
                }
                }
            );


            $("#slider").bind("valuesChanging", function(e, data) {
                var _player = $('#player1')[0].player;

                player.media.setCurrentTime(data.values.min);
                player.play();
                $("input[name=time_min]").val(data.values.min)
                $("input[name=time_max]").val(data.values.max)
            });


        }





    })(jQuery);


});

