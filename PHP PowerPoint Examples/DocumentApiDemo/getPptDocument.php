<?php

use Spire\Cloud\Powerpoint\Sdk\Api\DocumentApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new DocumentApi($configuration);

$name = "GetPptDocument.pptx";
$password = null;
$folder = "input";
$storage = null;
$result = $apiInstance->getPptDocument($name, $password, $storage, $folder);
print_r($result);