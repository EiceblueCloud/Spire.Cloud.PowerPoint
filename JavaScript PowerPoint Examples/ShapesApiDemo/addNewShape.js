(function (){
    var appId = "your ID";
    var appKey = "your Key";
    var baseUrl = "https://api.e-iceblue.cn";

    var SpirecloudPowerpoint = require('../../src/index');
    var apiClient = new SpirecloudPowerpoint.ApiClient(appId, appKey,baseUrl);
    var instance = new SpirecloudPowerpoint.ShapesApi(apiClient);
    
    var name = 'AddNewShape.pptx';
    var folder = 'input';
    var opts = {};
    var slideIndex = 0;
    opts.source = new SpirecloudPowerpoint.ShapeBase();
    opts.source.ShapeType = "Rectangle";
    opts.source.Width = 200.0;
    opts.source.Height = 100.0;
    opts.source.X = 50.0;
    opts.source.Y = 50.0;
    opts.source.AlternativeText = "AlternativeText";

    var imgPath = "input/Image.jpg";
    var image = new SpirecloudPowerpoint.ResourceUriElement();
    var url = new SpirecloudPowerpoint.ResourceUri();
    url.Href = imgPath;
    image.Uri = url;
    var pictureFill = new SpirecloudPowerpoint.PictureFill();
    pictureFill.CropBottom = 2;
    pictureFill.CropLeft = 5;
    pictureFill.CropRight = 2;
    pictureFill.CropTop = 5;
    pictureFill.Image = image;
    pictureFill.Dpi = 96;
    pictureFill.PictureFillMode = SpirecloudPowerpoint.PictureFill.PictureFillModeEnum.Tile;
    opts.source.FillFormat = pictureFill;
    opts.source.FillFormat.Type = "Picture";

    //effect format                             
    opts.source.EffectFormat = new SpirecloudPowerpoint.EffectFormat();
    opts.source.EffectFormat.Blur = new SpirecloudPowerpoint.BlurEffect();
    opts.source.EffectFormat.Blur.Radius = 1.0;
    opts.source.EffectFormat.Blur.Grow = false;
    opts.source.EffectFormat.Glow = new SpirecloudPowerpoint.GlowEffect();
    opts.source.EffectFormat.Glow.Radius = 1.0;
    opts.source.EffectFormat.Glow.Color = "Red";
    opts.source.EffectFormat.InnerShadow = new SpirecloudPowerpoint.InnerShadowEffect();
    opts.source.EffectFormat.InnerShadow.Direction = 30.0;
    opts.source.EffectFormat.InnerShadow.Distance = 2.0;
    opts.source.EffectFormat.InnerShadow.BlurRadius = 1.0;
    opts.source.EffectFormat.InnerShadow.ShadowColor = "Blue";
    opts.source.EffectFormat.OuterShadow = new SpirecloudPowerpoint.OuterShadowEffect();
    opts.source.EffectFormat.OuterShadow.Direction = 45.0;
    opts.source.EffectFormat.OuterShadow.Distance = 2.0;
    opts.source.EffectFormat.OuterShadow.BlurRadius = 1.0;
    opts.source.EffectFormat.OuterShadow.ShadowColor = "Black";
    opts.source.EffectFormat.PresetShadow = new SpirecloudPowerpoint.PresetShadowEffect();
    opts.source.EffectFormat.PresetShadow.Direction = 20.0;
    opts.source.EffectFormat.PresetShadow.Distance = 2.0;
    opts.source.EffectFormat.PresetShadow.Preset = "TopLeftDrop";
    opts.source.EffectFormat.PresetShadow.shadowColor = "Yellow";
    opts.source.EffectFormat.SoftEdge = new SpirecloudPowerpoint.SoftEdgeEffect();
    opts.source.EffectFormat.SoftEdge.Radius = 2.0;
    opts.source.EffectFormat.Reflection = new SpirecloudPowerpoint.ReflectionEffect();
    opts.source.EffectFormat.Reflection.Direction = 30.0;
    opts.source.EffectFormat.Reflection.FadeDirection = 30.0;
    opts.source.EffectFormat.Reflection.Distance = 1.0;
    opts.source.EffectFormat.Reflection.BlurRadius = 1.0;
    opts.source.EffectFormat.Reflection.ScaleHorizontal = 100.0;
    opts.source.EffectFormat.Reflection.ScaleVertical = 100.0;
    opts.source.EffectFormat.Reflection.SkewHorizontal = 0.0;
    opts.source.EffectFormat.Reflection.SkewVertical = 0.0;
    opts.source.EffectFormat.Reflection.StartPosAlpha = 0.0;
    opts.source.EffectFormat.Reflection.EndPosAlpha = 100.0;
    opts.source.EffectFormat.Reflection.StartReflectionOpacity = 100.0;
    opts.source.EffectFormat.Reflection.EndReflectionOpacity = 0.0;
    opts.source.EffectFormat.Reflection.RectangleAlign = "TopLeft";
    opts.source.EffectFormat.Reflection.RotateShadowWithShape = false;
    opts.source.EffectFormat.FillOverlay = new SpirecloudPowerpoint.FillOverlayEffect();
    opts.source.EffectFormat.FillOverlay.Blend = "Darken";

    //lineformat
    opts.source.LineFormat = new SpirecloudPowerpoint.LineFormat();
    opts.source.LineFormat.Alignment = "Center";
    opts.source.LineFormat.CapStyle = "Round";
    opts.source.LineFormat.DashStyle = "Dot";
    opts.source.LineFormat.JoinStyle = "Bevel";
    opts.source.LineFormat.Style = "ThinThin";
    opts.source.LineFormat.BeginArrowHead = new SpirecloudPowerpoint.ArrowHeadProperties();
    opts.source.LineFormat.BeginArrowHead.Length = "Short";
    opts.source.LineFormat.BeginArrowHead.Style = "TriangleArrowHead";
    opts.source.LineFormat.BeginArrowHead.Width = "Narrow";
    opts.source.LineFormat.EndArrowHead = new SpirecloudPowerpoint.ArrowHeadProperties();
    opts.source.LineFormat.EndArrowHead.Length = "Short";
    opts.source.LineFormat.EndArrowHead.Style = "TriangleArrowHead";
    opts.source.LineFormat.EndArrowHead.Width = "Narrow";
    opts.source.LineFormat.MiterLimit = 1.0;
    opts.source.LineFormat.Width = 4.0;
    opts.source.LineFormat.FillFormat = new SpirecloudPowerpoint.SolidFill("Red");
    opts.source.LineFormat.FillFormat.Type = "Solid";

    opts.folder = folder;

    var response = instance.addNewShape(name, slideIndex, opts,
        function (error, data, response) {
            if (error) throw error;
        });
})();