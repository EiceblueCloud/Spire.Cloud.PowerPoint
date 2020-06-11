import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "addNewShape.pptx"
slideIndex = 0
password = ""
storage = ""
inputFolder = "input"
source = spirecloudpowerpoint.models.ShapeBase()
source.name = "ShapeName"
source.shape_type = "Rectangle"
source.x = 50
source.y = 50
source.height = 100
source.width = 200
source.alternative_text = "AlternativeText"
source.alternative_text_title = "AlternativeTextTitle"
source.hidden = False
imgPath = "input/Image.jpg";
image = spirecloudpowerpoint.models.ResourceUriElement(spirecloudpowerpoint.models.ResourceUri(imgPath))
# PictureFill
source.fill_format = spirecloudpowerpoint.models.PictureFill(2, 5, 2, 5, 96, image, None, None, "Tile")
source.type = "ShapeBase"

# Lineformat
# begainArrowHead = spirecloudpowerpoint.models.ArrowHeadProperties("Short", "TriangleArrowHead", "Narrow")
# endArrowHead = spirecloudpowerpoint.models.ArrowHeadProperties("Long", "Oval", "Narrow")
# source.line_format = spirecloudpowerpoint.models.LineFormat("Inset", "Round", "Solid", "Bevel", "ThinThin",
#                                                             begainArrowHead, endArrowHead, None,
#                                                             spirecloudpowerpoint.models.SolidFill("red"), 1, 4)

#  Effectformat
# blur = spirecloudpowerpoint.models.blur_effect.BlurEffect(1, False)
# glow = spirecloudpowerpoint.models.glow_effect.GlowEffect(1, "red")
# innerShadowEffect = spirecloudpowerpoint.models.inner_shadow_effect.InnerShadowEffect(30, 2, 1, "blue")
# outerShadowEffect = spirecloudpowerpoint.models.outer_shadow_effect.OuterShadowEffect(45, 2, 1, "black")
# presetShadowEffect = spirecloudpowerpoint.models.preset_shadow_effect.PresetShadowEffect(20, 2, "TopLeftDrop",
#                                                                                          "yellow")
# softEdgeEffect = spirecloudpowerpoint.models.soft_edge_effect.SoftEdgeEffect(2)
# reflectionEffect = spirecloudpowerpoint.models.reflection_effect.ReflectionEffect(30, 30, 1, 1, 100, 100, 0, 0,
#                                                                                   0, 100, 100, 0, "TopLeft",
#                                                                                   True)
# fillOverlayEffect = spirecloudpowerpoint.models.fill_overlay_effect.FillOverlayEffect("Darken")
# source.effect_format = spirecloudpowerpoint.models.EffectFormat(blur, glow=glow, inner_shadow=innerShadowEffect,
#                                                                 outer_shadow=outerShadowEffect,
#                                                                 preset_shadow=presetShadowEffect,
#                                                                 soft_edge=softEdgeEffect,
#                                                                 reflection=reflectionEffect,
#                                                                 fill_overlay=fillOverlayEffect)
result = api.add_new_shape(fileName, slideIndex, source=source, password=password, storage=storage, folder=inputFolder)
