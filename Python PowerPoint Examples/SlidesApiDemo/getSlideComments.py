import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "GetSlideComments.pptx"
password = ""
storage = ""
slideIndex = 0
inputFolder = "input"
result = api.get_slide_comments(fileName, slideIndex, password=password, storage=storage, folder=inputFolder)
