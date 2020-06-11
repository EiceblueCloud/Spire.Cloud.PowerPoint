<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\NotesSlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new NotesSlidesApi($configuration);

$name = "AddNotesSlide.pptx";
$password = null;
$storage = null;
$slideIndex = 0;
$note = "This is note info";
$folder = "NotesSlides";
$apiInstance->addNotesSlide($name,$slideIndex,$note, $password, $folder, $storage);