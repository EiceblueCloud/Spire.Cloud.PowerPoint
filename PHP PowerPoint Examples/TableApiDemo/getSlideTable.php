<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TableApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TableApi($configuration);

$name = "SlideTable.pptx"; 
$password = null; 
$folder = "Powerpoint"; 
$storage = null; 
$slideIndex = 0;  // int | slide index
$shapeIndex = "0"; // string | Shape index.
$result = $apiInstance->getSlideTable($name,$slideIndex,$shapeIndex, $password, $folder, $storage);