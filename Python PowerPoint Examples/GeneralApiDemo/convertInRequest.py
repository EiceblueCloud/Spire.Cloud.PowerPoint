import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.general_api.GeneralApi(configuration)

format = "Odp"  # Supported formats:Pptx/Ppsx/Ppt/Pps/Odp/Pdf/Xps/Ps/Pcl
file = "D:\\input\\Convert.pptx"
password = ""

result = api.convert_in_request(format=format, file=file, password=password)
