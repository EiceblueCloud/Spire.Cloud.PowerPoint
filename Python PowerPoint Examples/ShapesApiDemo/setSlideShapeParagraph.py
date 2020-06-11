import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "SetSlideShapeParagraph.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_index = 0
shape_index = "0"
paragraph_index = 0
source = spirecloudpowerpoint.models.Paragraph()
source.text_alignment = "Baseline"
source.alignment = "Center"
source.margin_left = 50
source.bullet_type = "None"
result =api.set_slide_shape_paragraph(fileName, slide_index, shape_index, paragraph_index,source=source, password=password, storage=storage,folder=inputFolder)