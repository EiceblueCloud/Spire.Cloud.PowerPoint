import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.table_api.TableApi(configuration)

fileName = "SlideTable.pptx"
password = ""
storage = ""
slideIndex = 0
shape_index = 0
inputFolder = "input"
result = api.get_slide_table(fileName, slide_index=slideIndex, shape_index=shape_index, password=password, storage=storage,folder=inputFolder)