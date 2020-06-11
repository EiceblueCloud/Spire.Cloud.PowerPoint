import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.properties_api.PropertiesApi(configuration)

name = "DelProperties.pptx" #Supported formats:ppt/pptx/pptm/pps/ppsx/pot/potx/odp
password = ""
storage = ""
inputFolder = "input"

api.delete_ppt_document_properties(name, password=password, storage=storage, folder=inputFolder)