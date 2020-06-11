<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "DeleteSlideBackground.pptx"; // string | Document name.
$password = null; // string | Document password.
$folder = "Slides"; // string | Document folder.
$storage = null; // string | Document storage.
$slideIndex = 1;
$apiInstance->deleteSlideBackground($name, $slideIndex, $password, $folder, $storage);