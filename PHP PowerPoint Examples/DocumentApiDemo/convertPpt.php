<?php

use Spire\Cloud\Powerpoint\Sdk\Api\DocumentApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new DocumentApi($configuration);

$name = "ConvertPpt.pptx";
$format = "Pptx"; //Available format: Pptx, Ppsx, Ppt, Pps, Odp, Pdf, Xps, Ps, Pcl
$options = null;
$password = null;
$folder = "Powerpoint";
$storage = null;
$result = $apiInstance->convertPpt($name, $format, $options, $password, $storage, $folder);
print_r($result);