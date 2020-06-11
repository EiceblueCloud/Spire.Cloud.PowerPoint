<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "SetParagraphTextRangeProperties.pptx";
$password = null;
$folder = "input";
$storage = null;
$slideIndex = 0;
$shapeIndex = "0";
$paragraphIndex = 0;
$portionIndex = 0;
$source = new Portion();
$source->setText("SetParagraphTextRangeProperties");
$source->setFontHeight(20);
$source->setSpacing(2);
$source->setFontColor("green");
$source->setFontBold(true);
$apiInstance->setParagraphTextRangeProperties($name, $slideIndex, $shapeIndex, $paragraphIndex, $portionIndex, $source, $password, $folder, $storage);