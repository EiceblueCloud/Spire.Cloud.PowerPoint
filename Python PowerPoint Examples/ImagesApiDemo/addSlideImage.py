import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey, baseUrl)
api = spirecloudpowerpoint.api.images_api.ImagesApi(configuration)

name = "AddSlideImage.pptx"
password = ""
storage = ""
folder = "input"
slideIndex = 0
x = 0
y = 0
width = 500
height = 500
imgPath = "D:\\input\Image.jpg"

api.add_slide_image(name, slide_index=slideIndex, x=x, y=y, width=width, height=height, image_data=imgPath,
                    password=password, storage=storage, folder=folder)
