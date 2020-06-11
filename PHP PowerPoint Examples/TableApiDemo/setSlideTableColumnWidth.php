<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TableApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TableApi($configuration);

$name = "SetSlideTableColumnWidth.pptx"; 
$password = null; 
$folder = "Table"; 
$storage = null; 
$slideIndex = 0;
$shapeIndex = "0";
$columnIndex = 1;
$width = 10;
$apiInstance->setSlideTableColumnWidth($name, $slideIndex, $shapeIndex, $columnIndex, $width, $password, $folder, $storage);
