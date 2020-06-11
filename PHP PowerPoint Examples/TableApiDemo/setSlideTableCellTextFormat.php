<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TableApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;
use Spire\Cloud\Powerpoint\Sdk\Model\Portion;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TableApi($configuration);

$name = "SetSlideTableCellTextFormat.pptx"; 
$password = null; 
$folder = "Table"; 
$storage = null; 
$slideIndex = 0;
$shapeIndex = "0";
$path = "[0,0]";
$source = new Portion();
$source->setText("11111111111111");
$source->setFontColor( "lightpink");
$source->setFontItalic(true);
$source->setSpacing(2);
$apiInstance->setSlideTableCellTextFormat($name, $slideIndex, $shapeIndex, $path, $password, $source , $folder, $storage);