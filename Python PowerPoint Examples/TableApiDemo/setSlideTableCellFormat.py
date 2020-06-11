import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.table_api.TableApi(configuration)

fileName = "SetSlideTableCellFormat.pptx"
password = ""
storage = ""
slide_index = 0
shape_index = 0
source = spirecloudpowerpoint.models.TableCell("", 1, 1, 1, 1, 3.6, 3.6, "Center", "Horizontal")
#SolidFill
source.fill_format = spirecloudpowerpoint.models.SolidFill("lightpink")

#GradientFill
# stops_1 = spirecloudpowerpoint.models.GradientFillStop("green", 0)
# stops_2 = spirecloudpowerpoint.models.GradientFillStop("yellow", 1)
# source.fill_format = spirecloudpowerpoint.models.GradientFill("FromCorner1", "Linear", [stops_1, stops_2], 30,
#                                                               is_scaled=False,
#                                                               tile_flip="Horizontal")

#PictureFill
# imgPath = "input/Image.jpg";
# image = spirecloudpowerpoint.models.ResourceUriElement(spirecloudpowerpoint.models.ResourceUri(imgPath))
# source.fill_format = spirecloudpowerpoint.models.PictureFill(2, 5, 2, 5, 96, image, None, None, "Stretch")

source.border_diagonal_down = None
source.border_diagonal_up = None
inputFolder = "input"
result =api.set_slide_table_cell_format(fileName, slide_index, shape_index, source=source,password=password, storage=storage, folder=inputFolder)