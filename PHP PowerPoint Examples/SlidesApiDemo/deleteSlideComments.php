<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "DeleteSlideComments_1.pptx"; 
$password = null; 
$folder = "Slides"; 
$storage = null; 
$slideIndex = 1;
$apiInstance->deleteSlideComments($name, $slideIndex, $password, $folder, $storage);