import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "SetSlide.pptx"
password = ""
storage = ""
inputFolder = "input"
slide_index = 4
slide_dto = api.get_slide(fileName, slide_index, password=password, storage=storage, folder=inputFolder)
uriElement = spirecloudpowerpoint.models.ResourceUriElement()
uriElement.Uri = spirecloudpowerpoint.models.ResourceUri("TitleOnly")
slide_dto.layout_slide = uriElement
slide_dto.show_master_shapes = False
slide_dto.width = 800
slide_dto.height = 800
result =api.set_slide(fileName, slide_index=slide_index, slide_dto=slide_dto, password=password,storage=storage, folder=inputFolder)