import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "DeleteSlideParagraph.pptx"
password = ""
storage = ""
inputFolder = "input"

slide_index = 0
shape_index = "0"
paragraph_index = 0
result =api.delete_slide_paragraph(fileName, slide_index, shape_index, paragraph_index,password=password, storage=storage, folder=inputFolder)