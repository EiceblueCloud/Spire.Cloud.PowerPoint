import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.placeholders_api.PlaceholdersApi(configuration)

fileName = "getSlidesPlaceholders.pptx"
password = ""
storage = ""
slideIndex = 0
inputFolder = "input"
result = api.get_slides_placeholders(fileName, slideIndex,password=password, storage=storage,folder=inputFolder)
