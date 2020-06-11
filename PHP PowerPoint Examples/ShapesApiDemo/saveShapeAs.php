<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "SlideShapes.pptx";
$password = null;
$folder = "input";
$storage = null;
$slideIndex = 0;
$shapeIndex = "1";
$format = "png"; //Available format: png, jpg, bmp
$outPath = "Shapes/SaveShapeAs.png";
$scaleX = 1.0;
$scaleY = 1.0;
$bounds = null;
$fontsFolder = null;
$apiInstance->saveShapeAs($name, $slideIndex, $shapeIndex, $format, $outPath,$password, $folder, $storage,$scaleX,$scaleY,$bounds,$fontsFolder);