import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.images_api.ImagesApi(configuration)

name = "GetPptImagesList.pptx"
password = ""
storage = ""
folder = "input"

result = api.get_ppt_images_list(name=name, password=password, storage=storage,
                                 folder=folder)
