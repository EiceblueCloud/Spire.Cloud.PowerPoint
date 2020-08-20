(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.NotesSlidesApi(apiClient);

    var name = "DeleteNotesSlide.pptx";
    var opt = { 'folder': "input" };
    var slideIndex = 0;
    var response = instance.deleteNotesSlide(name, slideIndex, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();