<?php

use Spire\Cloud\Powerpoint\Sdk\Api\LayoutSlidesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new LayoutSlidesApi($configuration);

$name = "GetLayoutSlidesList.pptx";
$password = null;
$folder = "input";
$storage = null;
$result = $apiInstance->getLayoutSlidesList($name, $password, $folder, $storage);
print_r($result);