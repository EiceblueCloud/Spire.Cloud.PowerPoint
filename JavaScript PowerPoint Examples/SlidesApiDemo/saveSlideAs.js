(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.SlidesApi(apiClient);

    var name = "saveSlideAs.pptx";
    var folder = "input";
    var slideIndex = 1;
    //Supported formats: Pptx/Ppt/Pps/Ppsx/Pcl/Odp/Ps/Xps/Jpeg/Png/Gif/Bmp/Svg/Pdf
    var format = 'Pptx';
    var opt = { 'width': 800, 'height': 600, 'folder': folder };
    var response = instance.saveSlideAs(name, slideIndex, format, opt,
        function (error, data, response) {
            if (error) throw error;
    });
})();