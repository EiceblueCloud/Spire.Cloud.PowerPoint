import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "SlideCopy.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_to_copy = 2
position = 3
source = "input/SlideCopy.pptx"
result =api.copy_slide(fileName, password=password, storage=storage, folder=inputFolder,slide_to_copy=slide_to_copy, position=position, source=source)