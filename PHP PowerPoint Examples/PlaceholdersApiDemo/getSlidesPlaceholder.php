<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\PlaceholdersApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new PlaceholdersApi($configuration);

$name = "GetSlidesPlaceholder.pptx";
$password = null;
$folder = "Powerpoint";
$storage = null;
$slideIndex = 0;
$placeholderIndex = 0;
$result = $apiInstance->getSlidesPlaceholder($name,$slideIndex,$placeholderIndex, $password, $folder, $storage);
print_r($result);