<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "AddSlideNewParagraph.pptx";
$password = null;
$folder = "input";
$storage = null;

$slideIndex = 0;
$shapeIndex = "4";
$position = null;
$source = new Paragraph();
$source->setAlignment("Right");
$source->setEastAsianLineBreak(false);
$source->setTextAlignment("Top");
$source->setMarginLeft(1);
$source->setMarginRight(5);
$source->setSpaceAfter(1);
$source->setSpaceBefore(5);
$apiInstance->addSlideNewParagraph($name, $slideIndex, $shapeIndex, $source, $password, $folder, $storage, $position);