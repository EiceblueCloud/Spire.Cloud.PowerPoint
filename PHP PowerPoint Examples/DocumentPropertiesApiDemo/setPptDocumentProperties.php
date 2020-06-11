<?php

use Spire\Cloud\Powerpoint\Sdk\Api\PropertiesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;
use Spire\Cloud\Powerpoint\Sdk\Model\DocumentProperty;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new PropertiesApi($configuration);

$name = "SetPptDocumentProperties.pptx";
$password = null;
$folder = "input";
$storage = null;
$p0 = new DocumentProperty();
$p0->setName("Keywords");
$p0->setValue("Set document properties.");
$p0->setBuiltIn(false);

$p1 = new DocumentProperty();
$p1->setName("Author");
$p1->setValue("eiceblue");
$p1->setBuiltIn(false);

$p2 = new DocumentProperty();
$p2->setName("Company");
$p2->setValue("冰蓝");
$p2->setBuiltIn(false);

$p3 = new DocumentProperty();
$p3->setName("LastSavedBy");
$p3->setValue("123456@iCloud.com");
$p3->setBuiltIn(true);

$p4 = new DocumentProperty();
$p4->setName("SharedDoc");
$p4->setValue("true");
$p4->setBuiltIn(false);

$List = array($p0, $p1, $p2, $p3, $p4);
$properties = new Model\DocumentProperties();
$properties->setList($List);

$apiInstance->setPptDocumentProperties($name, $properties, $password, $folder, $storage);