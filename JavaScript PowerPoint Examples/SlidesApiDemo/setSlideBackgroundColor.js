(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.SlidesApi(apiClient);

    var name = "setSlideBackgroundColor.pptx";
    var folder ="input";
    var slideIndex = 0;
    var color = '#FFB6C1';
    var opt = { 'folder': folder };
    var response = instance.setSlideBackgroundColor(name, slideIndex, color, opt,
        function (error, data, response) {
            if (error) throw error;
    });
})();