<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "DeleteSlideComment_1.pptx"; 
$password = null;
$folder = "Slides"; 
$storage = null; 
$slideIndex = 0;
$commentIndex = 0;
$apiInstance->deleteSlideComment($name, $slideIndex,$commentIndex, $password, $folder, $storage);