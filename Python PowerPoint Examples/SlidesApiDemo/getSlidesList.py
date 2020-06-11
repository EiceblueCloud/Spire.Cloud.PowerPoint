import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "GetSlidesList.pptx"
password = ""
storage = ""
inputFolder = "input"
result = api.get_slides_list(fileName, password=password, storage=storage, folder=inputFolder)