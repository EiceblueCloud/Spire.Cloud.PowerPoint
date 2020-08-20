(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.TableApi(apiClient);
    
    var name = "SetSlideTableCellTextFormat.pptx";
    var folder = "input";
    var slideIndex = 0;
    var shapeIndex = 0;
    var path = "[0,0]";
    var opts = {};
    opts.source = new SpirecloudPowerpoint.Portion();
    opts.source.Text = "11111111111111";
    opts.source.FontItalic = true;
    opts.source.Spacing = 2.0;
    opts.source.FontColor = "lightpink";

    opts.folder = folder;
    var response = instance.setSlideTableCellTextFormat(name, slideIndex, shapeIndex, path, opts,
        function (error, data, response) {
            if (error) throw error;
        });
})();