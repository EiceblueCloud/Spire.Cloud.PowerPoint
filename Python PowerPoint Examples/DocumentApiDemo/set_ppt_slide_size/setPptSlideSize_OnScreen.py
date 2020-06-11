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
sizeType = "OnScreen"  # OnScreen/LetterPaper/A4Paper/A3Paper/Slide35mm/Overhead/Banner/Custom/B5JisPaper/HagakiCard/Ledger
folder = "input"

api.set_ppt_slide_size(name, password=password, storage=storage, folder=folder,
                       width=width, height=height, sizetype=sizeType)
