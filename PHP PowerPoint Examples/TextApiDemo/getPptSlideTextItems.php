<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TextApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TextApi($configuration);

$name = "SlideTextItems.pptx";
$withEmpty = 'true'; //the default value is false
$slideIndex = 1;
$password = null;
$folder = "Powerpoint";
$storage = null;
$result = $apiInstance->getPptSlideTextItems($name, $slideIndex, $withEmpty, $password, $folder, $storage);
print_r($result);