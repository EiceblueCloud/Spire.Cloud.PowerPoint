<?php

use Spire\Cloud\Powerpoint\Sdk\Api\PropertiesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;
use Spire\Cloud\Powerpoint\Sdk\Model\DocumentProperty;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new PropertiesApi($configuration);

$name = "SetPptDocumentProperty.pptx";
$password = null;
$folder = "input";
$storage = null;
$property = new DocumentProperty();
$property->setName("Keywords");
$property->setValue("SetPptDocumentProperty_pptx");
$property->setBuiltIn(false);
$propertyName = "Keywords";
$result = $apiInstance->setPptDocumentProperty($name, $propertyName, $property, $password, $folder, $storage);
print_r($result);