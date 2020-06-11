import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.document_api.DocumentApi(configuration)

name = "FromSource.pptx"  # Supported formats:pptx/ppt/odp/pot/potx/pps/ppsx/pptm
sourcePath = "input"
sourcePassword = ""
sourceStorage = ""
password = ""
storage = ""
folder = "output"

api.create_ppt_document_from_source(name, source_path=sourcePath,
                                    source_password=sourcePassword, source_storage=sourceStorage, password=password,
                                    storage=storage, folder=folder)
