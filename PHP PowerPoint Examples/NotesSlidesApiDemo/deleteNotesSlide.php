<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\NotesSlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new NotesSlidesApi($configuration);

$name = "DeleteNotesSlide.pptx";
$password = null;
$storage = null;
$folder = "NotesSlides";
$slideIndex = 0;
$apiInstance->deleteNotesSlide($name,$slideIndex, $password, $folder, $storage);
print_r($result);