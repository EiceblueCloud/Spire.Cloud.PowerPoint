import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.master_slides_api.MasterSlidesApi(configuration)

name = "GetMasterSlidesList.pptx"
password = ""
storage = ""
folder = "input"

result = api.get_master_slides_list(name=name,
                                    password=password, storage=storage,
                                    folder=folder)
