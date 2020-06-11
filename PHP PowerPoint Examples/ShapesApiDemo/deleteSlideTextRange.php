<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "DeleteSlideTextRange.pptx";
$password = null;
$folder = "input";
$storage = null;

$slideIndex = 0;
$shapeIndex = "0";
$paragraphIndex = 0;
$portionIndex = 0;
$apiInstance->deleteSlideTextRange($name, $slideIndex, $shapeIndex, $paragraphIndex, $portionIndex, $password, $folder, $storage);