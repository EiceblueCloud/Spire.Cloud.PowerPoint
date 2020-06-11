import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.document_api.DocumentApi(configuration)

name = "SplitPpt.pptx"
password = ""
storage = ""
format = "Jpeg"  # Supported formats:Jpeg/Png/Gif/Bmp/Ppt/Pptx/Pps/Ppsx/Odp/Pdf/Xps/Ps/Pcl/Svg
options = None
width = 400
height = 300
to = 3
_from = 0
destFolder = "output/SplitPpt/"
folder = "input"

api.split_ppt(name, format=format, options=options,
              password=password, storage=storage, folder=folder,
              dest_folder=destFolder, width=width, height=height, to=to, _from=_from)
