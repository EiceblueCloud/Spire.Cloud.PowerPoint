<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "SlideCopy1.pptx";
$sourcePassword = null;
$sourceStorage = null;
$password = null;
$folder = "/Slides/SlideCopy/";
$storage = null;
$slideToCopy = 2;
$position = 3;
$source = "Powerpoint/SlideCopy1.pptx";
$apiInstance->copySlide($name, $slideToCopy, $position, $source, $sourcePassword, $sourceStorage, $password, $folder, $storage);