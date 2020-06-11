<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "AddSlideNewTextRange.pptx";
$password = null;
$folder = "input";
$storage = null;

$slideIndex = 0;
$shapeIndex = "0";
$paragraphIndex = 0;
$position = null;
$source = new Portion();
$source->setText("add new Text");
$source->setFontBold(true);
$source->setFontColor("blue");
$source->setspacing(5);
$apiInstance->addSlideNewTextRange($name, $slideIndex, $shapeIndex, $paragraphIndex, $source, $password, $folder, $storage, $position);