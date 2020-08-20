(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.SlidesApi(apiClient);

    var name = "copySlide.pptx";
    var folder = "input";
    var slideToCopy = 2;
    //If there isn't password, just remove the corresponding parameters
    var opt = { 'position': 0, 'source': 'input/copySlide.pptx', 'sourcePassword': "123456", 'password': "123456", 'folder': folder };
    var response = instance.copySlide(name, slideToCopy, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();