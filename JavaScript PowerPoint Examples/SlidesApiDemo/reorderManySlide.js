(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.SlidesApi(apiClient);

    var name = "reorderManySlide.pptx";
    var folder = "input";
    //If there isn't password, just remove the corresponding parameters
    var opt = { 'oldPositions': '0,1', 'newPositions': '1,0', 'password': '123', 'folder': folder};
    var response = instance.reorderManySlide(name, opt,
        function (error, data, response) {
            if (error) throw error;
    });
})();