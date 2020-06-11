import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "TitleOnly.pptx"
position = 0
password = ""
storage = ""
inputFolder = "input"
#supports layoutAlias: TitleOnly/Title/123/null/Blank/TwoTextAndTwoObjects/SectionHeader/TwoObjects/TitleObjectAndCaption/TitleAndObject/PictureAndCaption/VerticalTitleAndText/
layoutAlias = "TitleOnly"
result =api.add_slide(fileName, position=position, password=password, storage=storage, folder=inputFolder,layout_alias=layoutAlias)