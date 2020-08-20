(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.TextApi(apiClient);
    
    var name = "ReplacePresentationText.pptx";
    var folder = "input";
    var oldValue = "r1C1";
    var newValue = "newValue";
    var opt = { 'ignoreCase': 'false', 'folder': folder };
    var response = instance.replacePresentationText(name, oldValue, newValue, opt,
        function (error, data, response) {
            if (error) throw error;  
        });
})();