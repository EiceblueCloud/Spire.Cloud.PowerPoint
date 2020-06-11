<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TableApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TableApi($configuration);

$name = "AddSlideTable.pptx"; 
$password = null; 
$folder = "Table"; 
$storage = null; 
$slideIndex = 1;
$x = 50;
$y = 50;
$heights = "[150,150,150,150]";
$widths = "[150,150,150,150]";
$tableData = "[[11,12,13,14],[21,22,23,24],[31,32,33,34],[41,42,43,44]]";
$apiInstance->addSlideTable($name, $slideIndex, $x, $y, $heights, $widths, $tableData, $password, $folder, $storage);