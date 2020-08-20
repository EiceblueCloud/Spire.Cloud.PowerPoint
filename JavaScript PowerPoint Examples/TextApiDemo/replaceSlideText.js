(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.TextApi(apiClient);
    
    var name = "ReplaceSlideText.pptx";
    var folder = "input";
    var oldValue = "r1";
    var newValue = "newValue";
    var slideIndex = 0;
    var opt = { 'ignoreCase': 'false', 'folder': folder };
    var response = instance.replaceSlideText(name, slideIndex, oldValue, newValue, opt,
        function (error, data, response) {
            if (error) throw error;  
        });
})();