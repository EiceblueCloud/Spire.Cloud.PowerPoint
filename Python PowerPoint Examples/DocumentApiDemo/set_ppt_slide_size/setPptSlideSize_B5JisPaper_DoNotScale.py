import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.document_api.DocumentApi(configuration)

name = "SlideSize_B5JisPaper_DoNotScale.pptx"
password = ""
storage = ""
width = 800
height = 600
sizeType = "B5JisPaper"  # OnScreen/LetterPaper/A4Paper/A3Paper/Slide35mm/Overhead/Banner/Custom/B5JisPaper/HagakiCard/Ledger
scaleType = "DoNotScale"  # DoNotScale/EnsureFit/Maximize
folder = "input"

api.set_ppt_slide_size(name, password=password, storage=storage, folder=folder,
                       width=width, height=height, size_type=sizeType, scale_type=scaleType)
