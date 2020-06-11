<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "DeleteSlideParagraph.pptx";
$password = null;
$folder = "input";
$storage = null;

$slideIndex = 0;
$shapeIndex = "0";
$paragraphs = 0;
$apiInstance->deleteSlideParagraph($name, $slideIndex, $shapeIndex, $paragraphs, $password, $folder, $storage);