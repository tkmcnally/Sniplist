function createSlider() {

    $("#slider").rangeSlider(
        {range: {min: 20, max: 20}},
        {bounds: {min: 0, max: 1}},
        {formatter: function (val) {
                return val.toString().toHHMMSS();
            }
        }
    );

    $("input[name=time_min]").val(0);
    $("input[name=time_max]").val(20);

    bindSliderEvents();

}

function bindSliderEvents() {
    $("#slider").bind("userValuesChanged", function(e, data) {

        if(globalPlayer) {
            globalPlayer.setCurrentTime(data.values.min);
            globalPlayer.play();
            globalPlayer.setVolume(0.2);
        }
        $("input[name=time_min]").val(data.values.min);
        $("input[name=time_max]").val(data.values.max);
    });
}