import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.document_api.DocumentApi(configuration)

name = "GetPptDocument.pptx"
password = ""
storage = ""
folder = "input"

result = api.get_ppt_document(name, password=password, storage=storage, folder=folder)
