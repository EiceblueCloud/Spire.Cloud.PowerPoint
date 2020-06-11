import spirecloudpowerpoint
from spirecloudpowerpoint.configuration import *

appId = "your id"
appKey = "your key"
baseUrl = "https://api.e-iceblue.cn"
configuration = Configuration(appId, appKey,baseUrl)
api= spirecloudpowerpoint.api.slides_api.SlidesApi(configuration)

fileName = "SaveSlideAs.pptx"
password = ""
storage = ""
inputFolder = "input"
slideIndex = 3
#supports format:Pptx/Ppt/Pps/Ppsx/Pcl/Odp/Ps/Xps/Jpeg/Png/Gif/Bmp/Svg/Pdf
format = "Pptx"
width = 800
height = 600
result = api.save_slide_as(fileName, slideIndex, format, password=password, storage=storage,folder=inputFolder, width=width, height=height)