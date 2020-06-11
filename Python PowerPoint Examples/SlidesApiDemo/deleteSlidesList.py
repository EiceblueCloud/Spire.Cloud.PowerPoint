import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "DeleteSlides.pptx"
password = ""
storage = ""
slides = "9,5,3,59"
inputFolder = "input"
result =api.delete_slides_list(fileName, slides=slides, password=password, storage=storage, folder=inputFolder)