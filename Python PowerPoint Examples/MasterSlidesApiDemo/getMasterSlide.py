import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.master_slides_api.MasterSlidesApi(configuration)

name = "GetMasterSlide.pptx"
password = ""
storage = ""
folder = "input"
slideIndex = 0

result = api.get_master_slide(name=name, slide_index=slideIndex,
                              password=password, storage=storage,
                              folder=folder)
