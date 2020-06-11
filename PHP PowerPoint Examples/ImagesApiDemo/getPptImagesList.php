<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ImagesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ImagesApi($configuration);

$name = "GetPptImagesList.pptx";
$password = null;
$folder = "input";
$storage = null;
$result = $apiInstance->getPptImagesList($name, $password, $folder, $storage);
print_r($result);