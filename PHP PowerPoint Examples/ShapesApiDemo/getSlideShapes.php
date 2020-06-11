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
$result = $apiInstance->getSlideShapes($name,$slideIndex, $password, $folder, $storage);
print_r($result);