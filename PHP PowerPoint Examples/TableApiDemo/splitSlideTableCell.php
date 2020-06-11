<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TableApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TableApi($configuration);

$name = "SplitSlideTableCell_1.pptx";
$password = null;
$folder = "Table";
$storage = null;
$slideIndex = 0;
$shapeIndex = "0";
$path = "[[1,0],[4,3]]"; //[1,0] refers to the table cell at location:column index =1, row index =0; [4,3] refers to splitting the cell to 4 columns and 3 rows
$apiInstance->splitSlideTableCell($name, $slideIndex, $shapeIndex, $path, $password, $folder, $storage);