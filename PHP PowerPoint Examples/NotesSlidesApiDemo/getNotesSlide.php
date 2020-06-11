<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\NotesSlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new NotesSlidesApi($configuration);

$name = "GetNotesSlide.pptx";
$password = null;
$folder = "Powerpoint";
$storage = null;
$slideIndex = 0;
$result = $apiInstance->getNotesSlide($name,$slideIndex, $password, $folder, $storage);
print_r($result);