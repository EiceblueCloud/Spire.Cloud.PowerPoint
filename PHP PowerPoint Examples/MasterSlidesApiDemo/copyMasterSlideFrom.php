<?php

use Spire\Cloud\Powerpoint\Sdk\Api\MasterSlidesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new MasterSlidesApi($configuration);

$name = "MasterSlide1.pptx";
$source = "Powerpoint/MasterSlide2.pptx";
$masterIndex = 0;
$password = null;
$storage = null;
$cloneFromPassword = null;
$cloneFromStorage = null;
$newfolder = "MasterSlides";
$result = $apiInstance->copyMasterSlideFrom($name,$source,$masterIndex,$cloneFromPassword,$cloneFromStorage,null, $password, $newfolder, $storage);
print_r($result);