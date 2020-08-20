(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
   
    var name = 'DeleteSlideParagraphs.pptx';
    var folder = 'input';
    var slideIndex = 0;
    var shapeIndex = 0;
    var opt = { 'paragraphs': '0,1', 'folder': folder };
    var response = instance.deleteSlideParagraphs(name, slideIndex, shapeIndex, opt,
    function (error, data, response) {
      if (error) throw error;
   });
})();