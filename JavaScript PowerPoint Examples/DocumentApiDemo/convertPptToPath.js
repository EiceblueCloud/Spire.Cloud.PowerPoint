(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.DocumentApi(apiClient);

    var name = "ConvertPptToPath.pptx";
    var format = "Pptx"; //Available values : Pptx, Ppsx, Ppt, Pps, Odp, Pdf, Xps, Ps, Pcl
    var opt = { 'folder': 'Powerpoint' };
    var destFilePath = "output/" + name;
    instance.convertPptToPath(name, destFilePath, format, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();