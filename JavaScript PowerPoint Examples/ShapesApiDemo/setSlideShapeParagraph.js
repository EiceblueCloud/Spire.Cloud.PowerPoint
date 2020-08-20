(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
    
    var name = 'SetSlideShapeParagraph.pptx';
    var folder = 'input';
    var slideIndex = 0;
    var shapeIndex = 0;
    var paragraphIndex = 0;

    var opts = {};
    opts.source = new SpirecloudPowerpoint.Paragraph();
    opts.source.MarginLeft = 50;
    opts.source.TextAlignment = 'Baseline';
    opts.source.Alignment = 'Center';
    opts.folder = folder;
    
    var response = instance.setSlideShapeParagraph(name, slideIndex, shapeIndex, paragraphIndex, opts,
     function (error, data, response) {
        if (error) throw error;
     });
})();