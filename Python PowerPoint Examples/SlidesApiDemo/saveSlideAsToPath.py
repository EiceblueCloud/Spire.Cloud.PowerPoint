import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "SaveSlideAsToPath.pptx"
password = ""
storage = ""
inputFolder = "input"
slideIndex = 3
#supports format:Pptx/Ppt/Pps/Ppsx/Pcl/Odp/Ps/Xps/Jpeg/Png/Gif/Bmp/Svg/Pdf
format = "Pptx"
width = 800
height = 600
out_path = "output/SaveSlideAsToPath.pptx"
result = api.save_slide_as_to_path(fileName, slideIndex, format, out_path, password=password, storage=storage, folder=inputFolder, width=width, height=height)