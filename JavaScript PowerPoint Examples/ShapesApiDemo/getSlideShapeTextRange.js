(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
    
    var name = 'SlideShapes.pptx';
    var folder = 'input';
    var shapeIndex = 0;
    var slideIndex = 0;
    var paragraphIndex = 0;
    var portionIndex = 0;
    var opt = { 'folder': folder };
    var response = instance.getSlideShapeTextRange(name, slideIndex, shapeIndex, paragraphIndex, portionIndex, opt,
     function (error, data, response) {
        if (error) throw error;
     });
})();