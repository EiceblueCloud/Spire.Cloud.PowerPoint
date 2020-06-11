import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.placeholders_api.PlaceholdersApi(configuration)

fileName = "getSlidesPlaceholder.pptx"
password = ""
storage = ""
slideIndex = 0
inputFolder = "input"
placeholderIndex = 0
result = api.get_slides_placeholder(fileName, slideIndex, placeholderIndex,password=password, storage=storage, folder=inputFolder)