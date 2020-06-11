import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "SetParagraphTextRangeProperties.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_index = 0
shape_index = "0"
paragraph_index = 0
portion_index = 0
source = spirecloudpowerpoint.models.Portion()
source.text = "SetParagraphTextRangeProperties"
source.font_height = 20
source.font_color = "green"
source.spacing = 2
source.font_bold = True
result =api.set_paragraph_text_range_properties(fileName, slide_index, shape_index, paragraph_index, portion_index,source=source, password=password, storage=storage,folder=inputFolder)