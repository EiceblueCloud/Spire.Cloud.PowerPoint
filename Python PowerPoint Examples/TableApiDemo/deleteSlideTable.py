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
slide_index = 0
shape_index = 0
inputFolder = "input"
result =api.delete_slide_table(fileName, slide_index, shape_index=shape_index,password=password, storage=storage, folder=inputFolder)