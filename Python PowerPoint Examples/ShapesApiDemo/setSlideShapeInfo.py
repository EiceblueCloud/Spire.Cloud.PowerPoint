import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "SetSlideShapeInfo.pptx"
inputFolder = "input"
password = ""
storage = ""
slide_index = 0
shape_index = "3"
source = spirecloudpowerpoint.models.ShapeBase()
source.shape_type = "Rectangle"
source.x = 50
source.y = 50
source.height = 200
source.width = 100
source.alternative_text = "AlternativeText"
source.z_order_position = 0
source.type = "ShapeBase"
source.fill_format = spirecloudpowerpoint.models.SolidFill("red")
source.z_order_position = 1
result =api.set_slide_shape_info(fileName, slide_index=slide_index, shape_index=shape_index,source=source,password=password, storage=storage,folder=inputFolder)