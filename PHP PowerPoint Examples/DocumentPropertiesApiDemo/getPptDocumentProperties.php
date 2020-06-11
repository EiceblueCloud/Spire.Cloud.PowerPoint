<?php

use Spire\Cloud\Powerpoint\Sdk\Api\PropertiesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new PropertiesApi($configuration);

$name = "Properties.pptx";
$password = null;
$folder = "input";
$storage = null;
$result = $apiInstance->getPptDocumentProperties($name, $password, $folder, $storage);
print_r($result);
