<?php

use Spire\Cloud\Powerpoint\Sdk\Api\DocumentApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new DocumentApi($configuration);

$name = "FromSource.pptx";
$sourcePath = "input";
$sourcePassword = null;
$sourceStorage = null;
$password = "password";
$storage = null;
$folder = "output";
$result = $apiInstance->createPptDocumentFromSource($name, $sourcePath, $sourcePassword, $sourceStorage, $password, $storage, $folder);
print_r($result);