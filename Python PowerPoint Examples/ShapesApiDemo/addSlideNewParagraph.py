import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "AddSlideNewParagraph.pptx"
password = ""
storage = ""
inputFolder = "input"

slide_index = 0
shape_index = "4"
source = spirecloudpowerpoint.models.Paragraph()
source.alignment = "Right"
source.text_alignment = "Top"
source.east_asian_line_break = False
source.indent = 2
source.margin_left = 1
source.margin_right = 5
source.space_after = 1
source.space_before = 5
result =api.add_slide_new_paragraph(fileName, slide_index, shape_index, source=source, password=password,storage=storage,folder=inputFolder)
