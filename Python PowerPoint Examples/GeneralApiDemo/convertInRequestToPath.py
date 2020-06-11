import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.general_api.GeneralApi(configuration)

format = "Pptx"  # Supported formats:Pptx/Ppsx/Ppt/Pps/Odp/Pdf/Xps/Ps/Pcl
destFilePath = "output.pptx"
file = "D:\\input\\Convert.pptx"
password = ""

result = api.convert_in_request_to_path(format=format, dest_file_path=destFilePath, file=file, password=password)
