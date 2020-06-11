import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.properties_api.PropertiesApi(configuration)

name = "SetPptDocumentProperties.pptx" #Supported formats:ppt/pptx/pptm/pps/ppsx/pot/potx/odp
password = ""
storage = ""
folder = "input"
_property1 = spirecloudpowerpoint.models.DocumentProperty("Keywords", "Set document properties.", False)
_property2 = spirecloudpowerpoint.models.DocumentProperty("Author", "eiceblue", False)
_property3 = spirecloudpowerpoint.models.DocumentProperty("Company", "冰蓝", False)
_property4 = spirecloudpowerpoint.models.DocumentProperty("LastSavedBy", "123456@iCloud.com", False)
_property5 = spirecloudpowerpoint.models.DocumentProperty("SharedDoc", "true", False)
_list = []
_list.append(_property1)
_list.append(_property2)
_list.append(_property3)
_list.append(_property4)
_list.append(_property5)
properties = spirecloudpowerpoint.models.DocumentProperties(_list)

api.set_ppt_document_properties(name, properties=properties, password=password,
                                     storage=storage, folder=folder)