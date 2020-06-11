<?php

use Spire\Cloud\Powerpoint\Sdk\Api\MasterSlidesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new MasterSlidesApi($configuration);

$name = "GetMasterSlidesList.pptx";
$folder = "input";
$password = null;
$storage = null;
$result = $apiInstance->getMasterSlidesList($name, $password, $folder, $storage);
print_r($result);