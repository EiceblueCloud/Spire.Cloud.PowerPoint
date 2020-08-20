(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.DocumentApi(apiClient);

    var name = "SetPptSlideSize.pptx";
    var width = 800;
    var height = 600;
    //Available types: OnScreen, LetterPaper, A4Paper, Slide35mm, Overhead, Banner, Custom, B5JisPaper, HagakiCard, Ledger, A3Paper, B4IsoPaper, B5IsoPaper, B4JisPaper, OnScreen16x9, OnScreen16x10
    var sizeType = null; 
    //Available types: DoNotScale, EnsureFit, Maximize
    var scaleType = null;
    var opt = {'folder': "input" , 'width': width, 'height': height, 'sizeType': sizeType, 'scaleType': scaleType };
    var response = instance.setPptSlideSize(name, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();