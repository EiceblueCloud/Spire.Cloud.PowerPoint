(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.PlaceholdersApi(apiClient);

    var name = "GetSlidesPlaceholders.pptx";
    var slideIndex = 0;
    var opt = { 'folder': 'input' };
    var response = instance.getSlidesPlaceholders(name, slideIndex, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();