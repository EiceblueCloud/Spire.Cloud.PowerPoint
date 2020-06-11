<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "SlideSaveAs.pptx"; 
$password = null; 
$folder = "SlideSaveAs"; 
$storage = null; 
$slideIndex = 3;
$format = "Pptx"; //Ppt，Pps，Ppsx, Pcl, Odp, Ps, Xps, Jpeg, Png, Gif, Bmp, Svg, Pdf
$options = null;
$width = 800;
$height = 600;
$outPath = "Slides/SaveSlideAsToPath/SaveSlideAsToPath.pptx";
$apiInstance->saveSlideAsToPath($name, $slideIndex, $format, $outPath, $options, $width, $height, $password, $folder, $storage);