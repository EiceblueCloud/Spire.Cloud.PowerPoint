import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "DeleteSlideShapes.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_index = 0
shapes = "[0,1,2,3]"
result =api.delete_slide_shapes(fileName, slide_index=slide_index, shapes=shapes,password=password, storage=storage,folder=inputFolder)