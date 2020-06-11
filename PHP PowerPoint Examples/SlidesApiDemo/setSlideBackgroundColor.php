<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "SetSlideBackgroundColor.pptx"; 
$password = null; 
$folder = "/Slides/Background/"; 
$storage = null; 
$slideIndex = 0;
$color = "#FFB6C1";
$apiInstance->setSlideBackgroundColor($name, $slideIndex, $color,$folder, $password, $storage);