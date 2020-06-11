import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.document_api.DocumentApi(configuration)

name = "SlideSize_WH.pptx"
password = ""
storage = ""
width = 800
height = 600
folder = "input"

api.set_ppt_slide_size(name, password=password, storage=storage, folder=folder,
                       width=width, height=height)
