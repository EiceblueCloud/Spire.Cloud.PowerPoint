import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.document_api.DocumentApi(configuration)

name = "ConvertPpt.pptx"
password = ""
storage = ""
format = "Pptx"  # Supported formats:Pptx/Ppt/Pps/Ppsx/Odp/Pdf/Xps/Ps/Pcl
folder = "input"

result = api.convert_ppt(name, format=format, password=password, storage=storage, folder=folder)