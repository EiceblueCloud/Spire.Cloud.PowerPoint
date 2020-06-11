import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "SlidesMove_1.pptx"
password = ""
storage = ""
slide_index = 1
new_position = 3
inputFolder = "input"
result =api.move_slide(fileName, slide_index=slide_index, new_position=new_position, password=password,storage=storage, folder=inputFolder)