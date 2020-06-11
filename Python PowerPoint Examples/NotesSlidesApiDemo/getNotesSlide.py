import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.notes_slides_api.NotesSlidesApi(configuration)

name = "GetNotesSlide.pptx"
password = ""
storage = ""
folder = "input"
slideIndex = 0

result = api.get_notes_slide(name=name, slide_index=slideIndex,
                             password=password, storage=storage,
                             folder=folder)
