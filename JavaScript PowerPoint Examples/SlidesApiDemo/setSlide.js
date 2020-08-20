(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.SlidesApi(apiClient);

    var name = "setSlide.pptx";
    var folder ="input";
    var slideIndex = 0;
    var opts = {};
    opts.slideDto = new SpirecloudPowerpoint.Slide();
    opts.slideDto.SelfUri = new SpirecloudPowerpoint.ResourceUri();
    opts.slideDto.SelfUri.Href = "TitleOnly";
    opts.slideDto.Height = 800;
    opts.slideDto.Width = 800;
    opts.slideDto.ShowMasterShapes = false
    opts.folder = folder;
    var response = instance.setSlide(name, slideIndex, opts,
        function (error, data, response) {
            if (error) throw error;
    });
})();