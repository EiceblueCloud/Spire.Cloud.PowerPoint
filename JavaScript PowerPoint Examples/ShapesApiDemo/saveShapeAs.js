(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
    
    var name = 'SlideShapes.pptx';
    var folder = 'input';
    var slideIndex = 0;
    var shapeIndex = 1;
    var format = 'png'; //Available values: bmp, jpg, png
    var destFilePath = 'Shapes/SaveShapeAs.png';
    var opts = {'scaleX': '1.0', 'scaleY': '1.0', 'folder': folder };
    var response = instance.saveShapeAs(name, slideIndex, shapeIndex, format,destFilePath, opts,
     function (error, data, response) {
        if (error) throw error;
     });
})();