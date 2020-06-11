<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TextApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TextApi($configuration);

$name = "ReplaceSlideText_false.pptx";
$password = null;
$folder = "Text/SlideReplaceText";
$storage = null;
$slideIndex = 0;
$oldValue = "Spire";
$newValue = "newValue";
$ignoreCase = 'true'; //the default value is false
$apiInstance->replaceSlideText($name,$slideIndex, $oldValue, $newValue, $ignoreCase, $password, $folder, $storage);