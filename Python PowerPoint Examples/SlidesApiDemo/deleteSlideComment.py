import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "DeleteSlideComment.pptx"
password = ""
storage = ""
slide_index = 0
comment_index = 0
inputFolder = "input"
result =api.delete_slide_comment(fileName, slide_index=slide_index, comment_index=comment_index, password=password,storage=storage, folder=inputFolder)