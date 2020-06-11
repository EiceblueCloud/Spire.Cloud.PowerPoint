import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.text_api.TextApi(configuration)

#support file format: .pptx/.ppt/.pptm/.pps/.ppsx/.pot/.potx/.odp/
fileName = "SlideTextItems.pptx"
password = ""
storage = ""
#support :flase/true
with_empty = "false"
slideIndex = 1
inputFolder = "input"
result = api.get_ppt_slide_text_items(fileName, with_empty=with_empty, slide_index=slideIndex,password=password, storage=storage, folder=inputFolder)