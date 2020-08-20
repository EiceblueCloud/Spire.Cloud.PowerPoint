(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.TableApi(apiClient);
    
    var name = "SetSlideTableRowHeight.pptx";
    var folder = "input";
    var slideIndex = 0;
    var shapeIndex = 0;
    var rowIndex = 1;
    var height = 50;
    var opt = { 'folder': folder };
    var response = instance.setSlideTableRowHeight(name, slideIndex, shapeIndex, rowIndex, height, opt,
        function (error, data, response) {
            if (error) throw error;  
        });
})();