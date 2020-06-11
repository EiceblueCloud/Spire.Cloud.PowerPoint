import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "AddNewShape.pptx"
slide_index = 0
password = ""
storage = ""
inputFolder = "input"
shape_to_clone = 3
position = 0
result = api.add_new_shape(fileName, slide_index, source=None, password=password, storage=storage, folder=inputFolder,shape_to_clone=shape_to_clone, position=position)