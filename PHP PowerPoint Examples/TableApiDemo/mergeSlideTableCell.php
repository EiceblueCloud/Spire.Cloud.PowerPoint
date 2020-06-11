<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TableApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TableApi($configuration);

$name = "MergeSlideTableCell_1.pptx"; 
$password = null; 
$folder = "Table"; 
$storage = null; 
$slideIndex = 0;
$shapeIndex = "0";
$path = "[[1,2],[2,3]]";
$apiInstance->mergeSlideTableCell($name, $slideIndex, $shapeIndex, $path, $password, $folder, $storage);