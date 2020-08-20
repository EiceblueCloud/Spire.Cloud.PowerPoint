(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.PropertiesApi(apiClient);

    var name = "Property.pptx";
    var opt = { 'folder': 'input' };
    var propertyName = "Author";
    instance.getPptDocumentProperty(name, propertyName, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();