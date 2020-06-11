import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.table_api.TableApi(configuration)

fileName = "AddSlideTable.pptx"
password = ""
storage = ""
slide_index = 1
x = 50
y = 50
heights = "[150,150,150,150]"
widths = "[150,150,150,150]"
table_data = "[[11,12,13,14],[21,22,23,24],[31,32,33,34],[41,42,43,44]]"
inputFolder = "input"
result =api.add_slide_table(fileName, slide_index, x, y, heights, widths, table_data,password=password, storage=storage, folder=inputFolder)