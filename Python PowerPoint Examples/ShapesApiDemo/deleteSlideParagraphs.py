import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "DeleteSlideParagraphs.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_index = 0
shape_index = "4"
paragraphs = "[0,1]"
result =api.delete_slide_paragraphs(fileName, slide_index=slide_index, shape_index=shape_index, paragraphs=paragraphs,password=password, storage=storage,folder=inputFolder)