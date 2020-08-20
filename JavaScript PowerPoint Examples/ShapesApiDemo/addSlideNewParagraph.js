(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
    
    var name = 'AddSlideNewParagraph.pptx';
    var folder = 'input';
    var slideIndex = 0;
    var shapeIndex = 0;
    var opts = {};
    opts.source = new SpirecloudPowerpoint.Paragraph();
    opts.source.MarginLeft = 1.0;
    opts.source.MarginRight = 5.0;
    opts.source.SpaceBefore = 5.0;
    opts.source.SpaceAfter = 1.0;
    opts.source.Indent = 2.0;
    opts.source.Alignment = "Right";
    opts.source.TextAlignment = "Top";
    opts.folder = folder;
    
    var response = instance.addSlideNewParagraph(name, slideIndex, shapeIndex, opts,
     function (error, data, response) {
         if (error) throw error;
     });
})();