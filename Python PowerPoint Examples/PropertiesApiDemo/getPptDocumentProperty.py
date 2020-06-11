import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.properties_api.PropertiesApi(configuration)

name = "Property.pptx"
propertyName = "Author" #Author/Company/Format/LastSavedTime/Title
password = ""
storage = ""
folder = "input"

result = api.get_ppt_document_property(name, propertyName, password=password, storage=storage,
                                            folder=folder)