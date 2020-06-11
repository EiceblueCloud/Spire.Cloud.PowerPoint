<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "SlidesMove_1.pptx"; 
$slideIndex = 1;
$newPosition = 3;
$password = null; 
$folder = "Slides/SlidesMove/";
$storage = null; 
$apiInstance->moveSlide($name, $slideIndex, $newPosition, $password, $folder, $storage);