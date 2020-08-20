(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
    
    var name = 'DeleteSlideTextRanges.pptx';
    var folder = 'input';
    var slideIndex = 0;
    var shapeIndex = 0;
    var paragraphIndex=0;
    var opt = { 'portions': '[0,1]', 'folder': folder };
    var response = instance.deleteSlideTextRanges(name, slideIndex, shapeIndex, paragraphIndex, opt,
     function (error, data, response) {
        if (error) throw error;
     });
})();