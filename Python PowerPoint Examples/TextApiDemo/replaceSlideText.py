import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.text_api.TextApi(configuration)

#support file format: .pptx/.ppt/.pptm/.pps/.ppsx/.pot/.potx/.odp/
fileName = "ReplaceSlideText_false.pptx"
password = ""
storage = ""
slideIndex = 0
inputFolder = "input"
oldValue = "r1"
newValue = "newValue"
#support :flase/true
ignore_case = "false"
result =api.replace_slide_text(fileName, slideIndex, oldValue, newValue, password=password,storage=storage, folder=inputFolder, ignore_case=ignore_case)