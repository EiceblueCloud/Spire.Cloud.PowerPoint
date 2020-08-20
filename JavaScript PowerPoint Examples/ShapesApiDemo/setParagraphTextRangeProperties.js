(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
    
    var name = 'SetParagraphTextRangeProperties.pptx';
    var folder = 'input';
    var slideIndex = 0;
    var shapeIndex = 0;
    var paragraphIndex = 0;
    var portionIndex = 0;
    var opts = {};
    opts.source = new SpirecloudPowerpoint.Portion();
    opts.source.Text = "SetParagraphTextRangeProperties";
    opts.source.FontBold = true;
    opts.source.Spacing = 2.0;
    opts.source.FontHeight = 20.0;
    opts.source.FontColor = "green";
    opts.folder = folder;
    var response = instance.setParagraphTextRangeProperties(name, slideIndex, shapeIndex, paragraphIndex, portionIndex, opts,
     function (error, data, response) {
        if (error) throw error;
     });
})();