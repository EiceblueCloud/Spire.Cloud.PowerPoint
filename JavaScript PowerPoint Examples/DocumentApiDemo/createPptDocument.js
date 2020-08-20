(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.DocumentApi(apiClient);

    var name = "CreatePptDocument.pptx";
    var fs = require('fs');
    var file = fs.createReadStream("D://data/test.pptx");
    var opt = { 'folder': 'output', 'data': file };
    instance.createPptDocument(name, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();