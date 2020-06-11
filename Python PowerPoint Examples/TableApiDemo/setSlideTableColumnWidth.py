import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.table_api.TableApi(configuration)

fileName = "SetSlideTableColumnWidth.pptx"
password = ""
storage = ""
slide_index = 0
shape_index = 0
column_index = 1
width = 10
inputFolder = "input"
result =api.set_slide_table_column_width(fileName, slide_index, shape_index, column_index=column_index, width=width,password=password, storage=storage, folder=inputFolder)