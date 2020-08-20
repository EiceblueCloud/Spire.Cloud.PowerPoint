(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.TableApi(apiClient);
    
    var name = "DeleteSlideTable.pptx";
    var folder = 'input';
    var slideIndex = 0;
    var shapeIndex = 0;
    var opt = { 'folder': folder };
    var response = instance.deleteSlideTable(name, slideIndex, shapeIndex, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();