<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "DeleteSlideTextRanges.pptx";
$password = null;
$folder = "input";
$storage = null;

$slideIndex = 0;
$shapeIndex = "0";
$paragraphIndex = 0;
$positions = "0,1";
$apiInstance->deleteSlideTextRanges($name, $slideIndex, $shapeIndex, $paragraphIndex, $positions, $password, $folder, $storage);