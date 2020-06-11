<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "test.pptx";
$password = null;
$folder = "input";
$storage = null;
$position = 0;
$layoutAlias = "TitleOnly"; // TwoTextAndTwoObjects/ Title/ TextAndObject/ Blank/ VerticalTitleAndText/ PictureAndCaption/ TitleAndObject/ TwoObjects
$apiInstance->addSlide($name, $position, $password, $folder, $storage, $layoutAlias);