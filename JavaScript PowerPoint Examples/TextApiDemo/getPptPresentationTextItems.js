(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.TextApi(apiClient);
    
    var name = "PresentationTextItems.pptx";
    var opt = { 'withEmpty': 'false', 'folder': 'input' };
    var response = instance.getPptPresentationTextItems(name, opt,
        function (error, data, response) {  
            if (error) throw error;  
        });
})();