import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.master_slides_api.MasterSlidesApi(configuration)

name = "CopyMasterSlide.pptx"
password = ""
storage = ""
folder = "input"
source = "input/MasterSlide.pptx"
masterIndex = 0
applyToAll = "false"

api.copy_master_slide_from(name=name, source=source, master_index=masterIndex, clone_from_password=password,
                           clone_from_storage=storage, apply_to_all=applyToAll, password=password,
                           storage=storage,
                           folder=folder)
