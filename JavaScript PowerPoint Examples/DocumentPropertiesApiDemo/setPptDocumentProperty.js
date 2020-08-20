(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.PropertiesApi(apiClient);

    var name = "SetPptDocumentProperty.pptx";
    var propertyName = "Keywords";
    var property = new SpirecloudPowerpoint.DocumentProperty();
    property.Name = "Keywords";
    property.Value = "SetPptDocumentProperty_pptx";
    property.BuiltIn = false;
    var opt = { 'property': property, 'folder': "input" };
    var response = instance.setPptDocumentProperty(name, propertyName, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();