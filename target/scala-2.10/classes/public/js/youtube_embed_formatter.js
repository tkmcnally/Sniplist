function getVideo(songUrl) {
    jsRoutes.controllers.Snips.getVideo(songUrl).ajax({
        success: function(data) {
            $("#global-message").addClass("hidden");
            $("#add-snip-iframe").attr("src", "//www.youtube.com/embed/" + data.video_id);
            $("#title-input").val(data.title);

            $("input[name=snip_title]").val(data.title);
            $("input[name=snip_video_id]").val(data.video_id);
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