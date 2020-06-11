import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "SlideCopyPw.pptx"
password = "123456"
storage = ""
inputFolder = "input"
slide_to_copy = 1
position = 0
source = "input/SlideCopyPw.pptx"
result =api.copy_slide(fileName, source_password=password, password=password, storage=storage, folder=inputFolder, slide_to_copy=slide_to_copy, position=position, source=source)