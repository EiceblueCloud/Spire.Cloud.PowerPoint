<?php

use Spire\Cloud\Powerpoint\Sdk\Api\GeneralApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new GeneralApi($configuration);

$format = "Pptx"; //Available format: Pptx, Ppt, Odp, Pps, Ppsx, Pdf, Xps, Ps, Pcl
$password = null;
$filename = "D:/data/ConvertInRequest.pptx";
$document = new SplFileObject($filename);
$result = $apiInstance->convertInRequest($format, $document, $password);
print_r($result);