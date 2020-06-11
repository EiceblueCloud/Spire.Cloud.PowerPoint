<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "SlideComments.pptx"; 
$password = null; 
$folder = "Powerpoint"; 
$storage = null; 
$slideIndex = 0;
$result = $apiInstance->getSlideComments($name,$slideIndex, $password, $folder, $storage);