import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.table_api.TableApi(configuration)

fileName = "SplitSlideTableCell.pptx"
password = ""
storage = ""
slide_index = 0
shape_index = 0
path = "[[1,2],[2,3]]"
inputFolder = "input"
result =api.split_slide_table_cell(fileName, slide_index, shape_index, path=path,password=password, storage=storage, folder=inputFolder)