<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ImagesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ImagesApi($configuration);

$name = "GetSlideImages.pptx";
$password = null;
$folder = "input";
$storage = null;
$slideIndex = 0;
$result = $apiInstance->getSlideImages($name,$slideIndex, $password, $folder, $storage);
print_r($result);