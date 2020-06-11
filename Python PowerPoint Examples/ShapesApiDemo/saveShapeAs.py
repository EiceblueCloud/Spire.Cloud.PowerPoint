import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.shapes_api.ShapesApi(configuration)

fileName = "SlideShapes.pptx"
slide_index = 0
shape_index = "1"
#supports format: Png/Jpg/Bmp/
format = "png"
dest_file_path = "Shapes/SaveShapeAs.png"
password = ""
storage = ""
scaleX = 1.0
scaleY = 1.0
bounds = 0
fonts_folder = ""
inputFolder = "input"
result =api.save_shape_as(fileName, slide_index, shape_index, format, dest_file_path,password=password, folder=inputFolder, storage=storage, scale_x=scaleX, scale_y=scaleY, bounds=bounds, fonts_folder=fonts_folder)