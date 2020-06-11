import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.table_api.TableApi(configuration)

fileName = "SetSlideTableRowHeight.pptx"
password = ""
storage = ""
slide_index = 0
shape_index = 0
row_index = 1
height = 50
inputFolder = "input"
result =api.set_slide_table_row_height(fileName, slide_index, shape_index, row_index=row_index, height=height,password=password, storage=storage, folder=inputFolder)