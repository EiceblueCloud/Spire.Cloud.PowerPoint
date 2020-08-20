(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.TextApi(apiClient);
    
    var name = "SlideTextItems.pptx";
    var slideIndex = 1;
    var opt = { 'withEmpty': 'false', 'folder': 'input' };
    var response = instance.getPptSlideTextItems(name, slideIndex, opt,
        function (error, data, response) {
            if (error) throw error;  
        });
})();