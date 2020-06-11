<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "DeleteSlides_1.pptx"; 
$password = null; 
$folder = "/Slides/DeleteSlides/"; 
$storage = null; 
$slides = "9,5,3,59";
$apiInstance->deleteSlidesList($name, $slides, $password, $folder, $storage);