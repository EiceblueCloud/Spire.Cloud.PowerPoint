<?php

use Spire\Cloud\Powerpoint\Sdk\Api\DocumentApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new DocumentApi($configuration);

$name = "SlideSize.pptx";
$password = null;
$folder = "input";
$storage = null;
$width = 600;
$height = 800;
//Available type: ON_SCREEN, LETTER_PAPER, A4_PAPER, SLIDE35MM, OVERHEAD, BANNER, CUSTOM, B5_JIS_PAPER, HAGAKI_CARD, LEDGER, A3_PAPER, B4_ISO_PAPER, B5_ISO_PAPER, B4_JIS_PAPER, ON_SCREEN16X9, ON_SCREEN16X10,
$size_type = SizeType::ON_SCREEN;
//Available type: DO_NOT_SCALE, ENSURE_FIT, MAXIMIZE, ENSURE_FIT
$scale_type = ScaleType::DO_NOT_SCALE;
$result = $apiInstance->setPptSlideSize($name, $password, $storage, $folder, $width, $height, $size_type, $scale_type);
print_r($result);