(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
    
    var name = 'DeleteSlideShapes.pptx';
    var folder = 'input';
    var slideIndex = 0;
    var opts = { 'shapes' :'[0,1,2,3]','folder': folder };
    var response = instance.deleteSlideShapes(name, slideIndex, opts,
     function (error, data, response) {
        if (error) throw error;
     });
})();