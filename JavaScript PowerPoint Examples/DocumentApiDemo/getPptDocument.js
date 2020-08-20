(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.DocumentApi(apiClient);

    var name = "GetPptDocument.pptx";
    var opt = { 'folder': 'input' };
    instance.getPptDocument(name, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();