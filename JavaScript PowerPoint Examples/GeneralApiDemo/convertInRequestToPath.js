(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.GeneralApi(apiClient);

    var name = "ConvertInRequestToPath.pptx";
    var fs = require('fs');
    var file = fs.createReadStream("D://data/test.pptx");
    var format = "Pptx";//Available values : Pptx, Ppsx, Ppt, Pps, Odp, Pdf, Xps, Ps, Pcl
    var opt = { 'file': file };
    var destFilePath = "output/" + name;
    var response = instance.convertInRequestToPath(format, destFilePath, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();
