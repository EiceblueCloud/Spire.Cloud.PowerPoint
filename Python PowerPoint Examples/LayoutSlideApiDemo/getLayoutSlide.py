import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.layout_slides_api.LayoutSlidesApi(configuration)

name = "GetLayoutSlide.pptx"
password = ""
storage = ""
folder = "input"
slideIndex = 0

result = api.get_layout_slide(name=name, slide_index=slideIndex,
                              password=password, storage=storage,
                              folder=folder)
