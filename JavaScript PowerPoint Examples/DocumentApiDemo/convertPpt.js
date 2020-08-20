(function (){
    var appId = "your ID";
    var appKey = "your Key"; 
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.DocumentApi(apiClient);

    var name = "ConvertPpt.pptx";
    var format = "Pptx"; //Available values : Pptx, Ppsx, Ppt, Pps, Odp, Pdf, Xps, Ps, Pcl
    var opt = { 'folder': 'input' };
    var response = instance.convertPpt(name, format, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();