import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "DeleteSlideTextRanges.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_index = 0
shape_index = "0"
paragraph_index = 0
portions = "[0,1]"
result =api.delete_slide_text_ranges(fileName, slide_index=slide_index, shape_index=shape_index, paragraph_index=paragraph_index, portions=portions,password=password, storage=storage,folder=inputFolder)