import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.document_api.DocumentApi(configuration)

name = "ConvertPptToPath.pptx"
password = ""
storage = ""
format = "Pptx"  # Supported formats:Pptx/Ppt/Pps/Ppsx/Odp/Pdf/Xps/Ps/Pcl
folder = "input"
dest_file_path = "output/ConvertPptToPath.pptx"

api.convert_ppt_to_path(name, dest_file_path=dest_file_path, format=format,
                        password=password, storage=storage, folder=folder)
