(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ImagesApi(apiClient);

    var name = "AddSlideImage.pptx";
    var opt = { 'folder': "input" };
    var slideIndex = 0;
    var x = 0;
    var y = 0;
    var width = 500;
    var height = 500;
    var fs = require('fs');
    var imageData = fs.createReadStream("D://data/Image.jpg");
    var response = instance.addSlideImage(name, slideIndex, x, y, width, height, imageData, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();