import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.theme_api.ThemeApi(configuration)

fileName = "SlidesTheme.pptx"
password = ""
storage = ""
slideIndex = 0
inputFolder = "input"
result =api.get_slides_theme_color_scheme(fileName, slide_index=slideIndex, password=password,storage=storage,folder=inputFolder)