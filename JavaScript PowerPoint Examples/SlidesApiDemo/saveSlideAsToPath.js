(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.SlidesApi(apiClient);

    var name = "saveSlideAsToPath.pptx";
    var folder = "input";
    var slideIndex = 1;
    //Supported formats: pptx/Ppt/Pps/Ppsx/Pcl/Odp/Ps/Xps/Jpeg/Png/Gif/Bmp/Svg/Pdf
    var format = 'Pptx';
    var destFilePath = 'output/SaveSlideAsToPath.pptx';
    //If there isn't password, just remove the corresponding parameters
    var opt = { 'width': 800, 'height': 600, 'password': '123', 'folder': folder  };
    var response = instance.saveSlideAsToPath(name, slideIndex, format, destFilePath, opt,
        function (error, data, response) {
            if (error) throw error;
    });
})();