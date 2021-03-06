<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "SetSlideShapeParagraph.pptx";
$password = null;
$folder = "input";
$storage = null;

$slideIndex = 0;
$shapeIndex = "0";
$paragraphIndex = 0;
$source = new Paragraph();
$source->setMarginLeft(50);
$source->setTextAlignment("Baseline");
$source->setAlignment("Center");

$apiInstance->setSlideShapeParagraph($name, $slideIndex, $shapeIndex, $paragraphIndex, $source, $password, $folder, $storage);