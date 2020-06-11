import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "AddSlideNewTextRange.pptx"
password = ""
storage = ""
inputFolder = "input"

slide_index = 0
shape_index = "0"
paragraph_index = 0
source = spirecloudpowerpoint.models.Portion()
source.text = "add new Text"
source.font_bold = True
source.font_color = "blue"
source.spacing = 5
result =api.add_slide_new_text_range(fileName, slide_index, shape_index, paragraph_index, source=source, password=password, storage=storage,folder=inputFolder)