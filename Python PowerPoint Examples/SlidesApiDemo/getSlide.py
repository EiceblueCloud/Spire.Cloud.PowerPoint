import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "GetSlide.pptx"
password = ""
storage = ""
slide_index = 2
inputFolder = "input"
result =api.get_slide(fileName, slide_index=slide_index, password=password, storage=storage, folder=inputFolder)