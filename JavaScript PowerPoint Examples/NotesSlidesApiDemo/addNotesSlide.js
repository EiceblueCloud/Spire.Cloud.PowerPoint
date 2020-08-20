(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.NotesSlidesApi(apiClient);

    var name = "AddNotesSlide.pptx";
    var note = "This is note info";
    var slideIndex = 0;
    var opt = { 'folder': "input", 'note': note };
    var response = instance.addNotesSlide(name, slideIndex, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();