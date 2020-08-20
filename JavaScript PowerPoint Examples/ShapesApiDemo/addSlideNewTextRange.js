(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
   
    var name = 'AddSlideNewTextRange.pptx';
    var folder = 'input';
    var slideIndex = 0;
    var shapeIndex = 0;
    var paragraphIndex = 0;
    var opts = {};
    opts.source = new SpirecloudPowerpoint.Portion();
    opts.source.Text = "add new Text";
    opts.source.FontBold = true;
    opts.source.Spacing = 5.0;
    opts.source.FontColor = "Blue";
    opts.folder = folder;
    var response =  instance.addSlideNewTextRange(name, slideIndex, shapeIndex, paragraphIndex, opts,
    function (error, data, response) {
      if (error) throw error;
   });
})();