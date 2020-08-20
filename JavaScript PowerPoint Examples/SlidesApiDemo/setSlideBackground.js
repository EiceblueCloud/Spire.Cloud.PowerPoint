(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.SlidesApi(apiClient);

    var name = "setSlideBackground.pptx";
    var folder ="input";
    var slideIndex = 0;
    var opts = {};
    opts.source = new SpirecloudPowerpoint.SlideBackground();

    //SolidFill
    // opts.source.Type = "Costom";
    // opts.source.FillFormat = new SpirecloudPowerpoint.SolidFill("Lightpink");
    // opts.source.FillFormat.Type = "Solid";

    //GradientFill
    var stops = new Array();
    var stop1 = new SpirecloudPowerpoint.GradientFillStop();
    stop1.Color = "Green";
    stop1.Position = 0;
    var stop2 = new SpirecloudPowerpoint.GradientFillStop();
    stop2.Color = "Yellow";
    stop2.Position = 1;
    stops[0] = stop1;
    stops[1] = stop2;
    var gradientFill = new SpirecloudPowerpoint.GradientFill();
    gradientFill.Direction = "FromCorner1";
    gradientFill.Shape = "Linear";
    gradientFill.Stops = stops;
    gradientFill.LinearAngle = 30;
    gradientFill.IsScaled = false;
    gradientFill.TileFlip = "Horizontal";
    opts.source.FillFormat = gradientFill;
    opts.source.FillFormat.Type = "Gradient";
    opts.source.Type = "Costom";

    //PictureFill
    // opts.source.Type = "Costom";
    // var imgPath = "input/Image.jpg";
    // var image = new SpirecloudPowerpoint.ResourceUriElement();
    // var url = new SpirecloudPowerpoint.ResourceUri();
    // url.Href = imgPath;
    // image.Uri = url;
    // var pictureFill = new SpirecloudPowerpoint.PictureFill();
    // pictureFill.CropBottom = 2;
    // pictureFill.CropLeft = 5;
    // pictureFill.CropRight = 2;
    // pictureFill.CropTop = 5;
    // pictureFill.Image = image;
    // pictureFill.Dpi = 96;
    // pictureFill.PictureFillMode = SpirecloudPowerpoint.PictureFill.PictureFillModeEnum.Stretch;
    // opts.source.FillFormat = pictureFill;
    // opts.source.FillFormat.Type = "Picture";

    opts.folder = folder;
    var response = instance.setSlideBackground(name, slideIndex, opts,
        function (error, data, response) {
            if (error) throw error;
    });
})();