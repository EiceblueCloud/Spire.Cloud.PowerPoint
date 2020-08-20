(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.MasterSlidesApi(apiClient);

    var name = "MasterSlide1.pptx";
    var opt = {'folder': "input" };
    var source = "input/MasterSlide2.pptx";
    var masterIndex = 0;
    var response = instance.copyMasterSlideFrom(name, source, masterIndex, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();