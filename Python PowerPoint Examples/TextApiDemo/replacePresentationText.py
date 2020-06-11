import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.text_api.TextApi(configuration)

#support file format: .pptx/.ppt/.pptm/.pps/.ppsx/.pot/.potx/.odp/
fileName = "ReplacePresentationText.pptx"
password = ""
storage = ""
inputFolder = "input"
oldValue = "r1C1"
newValue = "newValue"
#support :flase/true
ignore_case = "false"
result =api.replace_presentation_text(fileName, oldValue, newValue, password=password,storage=storage, folder=inputFolder, ignore_case=ignore_case)