<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "SlidesReorderMany_1.pptx"; 
$oldPositions = "5,1,0";
$newPositions = "0,2,3";
$password = null;
$folder = "Slides/SlidesReorder/"; 
$storage = null; 
$apiInstance->reorderManySlide($name, $oldPositions, $newPositions, $password, $folder, $storage);