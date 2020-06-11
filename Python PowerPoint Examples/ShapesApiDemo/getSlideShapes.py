import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "SlideShapes.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_index = 0
result = api.get_slide_shapes(fileName, slide_index, password=password, storage=storage, folder=inputFolder)