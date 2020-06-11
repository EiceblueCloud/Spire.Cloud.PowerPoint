<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TextApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TextApi($configuration);

$name = "ReplacePresentationText_false.pptx";
$password = null;
$folder = "Text/PresentationReplaceText";
$storage = null;
$oldValue = "Spire";
$newValue = "newValue";
$ignoreCase = 'false'; //the default value is false
$result = $apiInstance->replacePresentationText($name, $oldValue, $newValue, $ignoreCase, $password, $folder, $storage);