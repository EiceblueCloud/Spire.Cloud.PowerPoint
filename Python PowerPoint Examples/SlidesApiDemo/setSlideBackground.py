import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "SetSlideBackground.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_index = 0
source = spirecloudpowerpoint.models.SlideBackground("custom")
#SolidFill
source.fill_format = spirecloudpowerpoint.models.SolidFill("lightpink")

#GradientFill
# stops_1 = spirecloudpowerpoint.models.GradientFillStop("green", 0)
# stops_2 = spirecloudpowerpoint.models.GradientFillStop("yellow", 1)
# source.fill_format = spirecloudpowerpoint.models.GradientFill("FromCorner1", "Linear", [stops_1, stops_2], 30,is_scaled=False, tile_flip="Horizontal")

#PictureFill
# imgPath = "input/Image.jpg";
# image = spirecloudpowerpoint.models.ResourceUriElement(spirecloudpowerpoint.models.ResourceUri(imgPath))
# source.fill_format = spirecloudpowerpoint.models.PictureFill(2, 5, 2, 5, 96, image, None, None, "Stretch")

result =api.set_slide_background(fileName, slide_index=slide_index, source=source, password=password,storage=storage, folder=inputFolder)