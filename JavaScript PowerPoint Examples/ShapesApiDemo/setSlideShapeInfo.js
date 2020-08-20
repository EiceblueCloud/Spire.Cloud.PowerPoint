(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
    
    var name = 'SetSlideShapeInfo.pptx';
    var folder = 'input';
    var slideIndex = 0;
    var shapeIndex = 2;
    var opts = {};
    opts.source = new SpirecloudPowerpoint.ShapeBase();
    opts.source.ShapeType = "Rectangle";
    opts.source.X = 50;
    opts.source.Y = 50;
    opts.source.Height = 200;
    opts.source.Width = 100;
    opts.source.AlternativeText = "AlternativeText";
    opts.source.FillFormat = new SpirecloudPowerpoint.SolidFill("Red");
    opts.source.FillFormat.Type = "Solid";
    opts.source.ZorderPosition = 1;
    opts.folder = folder;
    var response = instance.setSlideShapeInfo(name, slideIndex, shapeIndex, opts,
     function (error, data, response) {
        if (error) throw error;
     });
})();