(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.PropertiesApi(apiClient);

    var name = "SetPptDocumentProperties.pptx";
    var properties = new SpirecloudPowerpoint.DocumentProperties();
    properties.List = new Array();
    var property1 = new SpirecloudPowerpoint.DocumentProperty();
    property1.Name = "Keywords";
    property1.Value = "Set document properties.";
    property1.BuiltIn = false;
    properties.List.push(property1);
    var property2 = new SpirecloudPowerpoint.DocumentProperty();
    property2.Name = "Author";
    property2.Value = "eiceblue";
    property2.BuiltIn = false;
    properties.List.push(property2);
    var property3 = new SpirecloudPowerpoint.DocumentProperty();
    property3.Name = "Company";
    property3.Value = "冰蓝";
    property3.BuiltIn = true;
    properties.List.push(property3);
    var property4 = new SpirecloudPowerpoint.DocumentProperty();
    property4.Name = "LastSavedBy";
    property4.Value = "123456@iCloud.com.";
    property4.BuiltIn = true;
    properties.List.push(property4);
    var property5 = new SpirecloudPowerpoint.DocumentProperty();
    property5.Name = "SharedDoc";
    property5.Value = "true";
    property5.BuiltIn = false;
    properties.List.push(property5);
    var opt = { 'folder': "input", 'properties': properties };
    var response = instance.setPptDocumentProperties(name, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();