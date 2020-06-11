<?php

use Spire\Cloud\Powerpoint\Sdk\Api\GeneralApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new GeneralApi($configuration);

$format = "Pdf"; //Available format: Pptx, Ppt, Odp, Pps, Ppsx, Pdf, Xps, Ps, Pcl,
$outPath = "output/ConvertInRequestToPath.pdf";
$password = null;
$filename = "D:/data/ConvertInRequestToPath.pptx";
$document = new SplFileObject($filename);;
$result = $apiInstance->convertInRequestToPath($format, $outPath, $document, $password);
print_r($result);