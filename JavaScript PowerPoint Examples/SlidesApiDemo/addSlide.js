(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.SlidesApi(apiClient);

    var name = "addSlide.pptx";
    var folder = "input";
    //The "layoutAlias" can be TitleOnly, Title, Blank, TwoTextAndTwoObjects, SectionHeader, TwoObjects, TitleObjectAndCaption, TitleAndObject, PictureAndCaption, VerticalTitleAndText...
    var opt = { 'position': 0, 'layoutAlias': "TitleOnly", 'folder': folder };
    var response = instance.addSlide(name, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();
