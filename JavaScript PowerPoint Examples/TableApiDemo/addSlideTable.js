(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.TableApi(apiClient);
    
    var name = "AddSlideTable.pptx";
    var folder = 'input';
    var slideIndex = 1;
    var x = 50;
    var y = 50;
    var heights = '[150,150,150,150]';
    var widths = '[150,150,150,150]';
    var tableData = '[' +
        '[11,12,13,14],' +
        '[21,22,23,24],' +
        '[31,32,33,34],' +
        '[41,42,43,44],' +
        ']';
    var opt = { 'slideDto': '', 'folder': folder };
    var response = instance.addSlideTable(name, slideIndex, x, y, heights, widths, tableData, opt,
        function (error, data, response) {
            if (error) throw error;
        });
})();