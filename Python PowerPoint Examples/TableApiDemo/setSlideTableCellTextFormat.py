import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.table_api.TableApi(configuration)

fileName = "SetSlideTableCellTextFormat.pptx"
password = ""
storage = ""
slide_index = 0
shape_index = "0"
path = "[0,0]"
source = spirecloudpowerpoint.models.Portion()
source.text = "11111111111111"
source.font_color = "lightpink"
source.font_italic = True
source.spacing = 2
inputFolder = "input"
result =api.set_slide_table_cell_text_format(fileName, slide_index, shape_index, path,source=source,password=password, storage=storage, folder=inputFolder)