<?php

use Spire\Cloud\Powerpoint\Sdk\Api\DocumentApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new DocumentApi($configuration);

$name = "SplitPpt.pptx";
$format = "Jpeg"; //Available format: Jpeg, Png, Gif, Bmp, Pptx, Ppsx, Ppt, Pps, Odp, Pdf, Xps, Ps, Pcl, Svg,
$options = null;
$width = 400;
$height = 300;
$to = 3;
$from = 0;
$password = null;
$folder = "input";
$storage = null;
$dest_folder = "output/SplitPpt/";
$result = $apiInstance->splitPpt($name, $options, $format, $width, $height, $to, $from, $dest_folder, $password, $storage, $folder);
print_r($result);