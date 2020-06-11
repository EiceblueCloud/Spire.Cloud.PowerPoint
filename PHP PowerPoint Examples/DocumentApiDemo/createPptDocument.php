<?php

use Spire\Cloud\Powerpoint\Sdk\Api\DocumentApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new DocumentApi($configuration);

$name = "CreatePptDocument.pptx";
$inputPassword = null;
$password = null;
$folder = "input";
$storage = null;
$filename ="D:/data/Test.pptx";
$document = new SplFileObject($filename);
$apiInstance->createPptDocument($name, $document, $inputPassword, $password, $storage, $folder);
