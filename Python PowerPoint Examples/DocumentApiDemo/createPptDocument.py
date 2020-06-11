import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.document_api.DocumentApi(configuration)

name = "CreatePptDocument.pptx"  # Supported formats:pptx/ppt/odp/pot/potx/pps/ppsx/pptm
inputPassword = ""
data = "D:\\input\\Test.pptx"
password = ""
storage = ""
folder = "output"
api.create_ppt_document(name, data=data, input_password=inputPassword, password=password, storage=storage,
                        folder=folder)
