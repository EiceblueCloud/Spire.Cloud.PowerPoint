<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TextApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TextApi($configuration);

$name = "PresentationTextItems.pptx";
$withEmpty = 'false'; //the default value is false
$password = null;
$folder = "Powerpoint";
$storage = null;
$result = $apiInstance->getPptPresentationTextItems($name, $withEmpty, $password, $folder, $storage);
print_r($result);