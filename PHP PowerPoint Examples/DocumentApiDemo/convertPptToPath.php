<?php

use Spire\Cloud\Powerpoint\Sdk\Api\DocumentApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new DocumentApi($configuration);

$name = "ConvertPptToPath.pptx";
$format = "Pptx"; //Available format: Pptx, Ppsx, Ppt, Pps, Odp, Pdf, Xps, Ps, Pcl
$password = null;
$folder = "Powerpoint";
$storage = null;
$outPath = "Output/ConvertPptToPath.pptx";
$result = $apiInstance->convertPptToPath($name, $outPath, $format, $options, $password, $storage, $folder);
print_r($result);