(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.TableApi(apiClient);
    
    var name = "SetSlideTableColumnWidth.pptx";
    var folder = "input";
    var slideIndex = 0;
    var shapeIndex = 0;
    var columnIndex = 1;
    var width = 10;
    var opt = { 'folder': folder };
    var response = instance.setSlideTableColumnWidth(name, slideIndex, shapeIndex, columnIndex, width, opt,
        function (error, data, response) {
            if (error) throw error;   
        });
})();