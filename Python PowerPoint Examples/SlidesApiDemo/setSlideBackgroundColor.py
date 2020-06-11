import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "SetSlideBackgroundColor.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_index = 0
color = "FFB6C1"
result =api.set_slide_background_color(fileName, slide_index=slide_index, color=color, password=password,storage=storage, folder=inputFolder)