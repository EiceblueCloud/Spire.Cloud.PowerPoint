import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "SlidesReorderMany_1.pptx"
password = ""
storage = ""
old_positions = "5,1,0"
new_positions = "0,2,3"
inputFolder = "input"
result =api.reorder_many_slide(fileName, old_positions=old_positions, new_positions=new_positions, password=password,storage=storage, folder=inputFolder)