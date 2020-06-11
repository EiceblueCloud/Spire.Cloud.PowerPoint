import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.properties_api.PropertiesApi(configuration)

name = "SetPptDocumentProperty.pptx"  # Supported formats:ppt/pptx/pptm/pps/ppsx/pot/potx/odp
propertyName = "Keywords"
password = ""
storage = ""
folder = "input"
_property = spirecloudpowerpoint.models.DocumentProperty("Keywords", "SetPptDocumentProperty_pptx", False)

api.set_ppt_document_property(name, propertyName, _property=_property, password=password,
                              storage=storage, folder=folder)
