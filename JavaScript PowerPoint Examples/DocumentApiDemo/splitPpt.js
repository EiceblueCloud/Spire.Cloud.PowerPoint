(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.DocumentApi(apiClient);

    var name = "SplitPpt.pptx";
    var format = "Jpeg"; //Available values : Jpeg, Png, Gif, Bmp, Pptx, Ppsx, Ppt, Pps, Odp, Pdf, Xps, Ps, Pcl, Svg
    var width = 400;
    var height = 300;
    var to = 3;
    var from = 0;
    var destFolder = "output/SplitPpt/";
    var opt = { 'folder': "input", 'format': format, 'width': width, 'height': height, 'to': to, 'from': from, 'destFolder': destFolder };
    var response = instance.splitPpt(name, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();