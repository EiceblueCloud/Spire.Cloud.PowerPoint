<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "DeleteSlide_1.pptx";
$password = null;
$folder = "/Slides/DeleteSlide/";
$storage = null;
$slideIndex = 0;
$apiInstance->deleteSlideByIndex($name, $slideIndex, $password, $folder, $storage);