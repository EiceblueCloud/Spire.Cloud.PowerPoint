<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "SetSlideShapeInfo.pptx";
$password = null;
$folder = "input";
$storage = null;

$slideIndex = 0;
$shapeIndex = "3";
$source = new ShapeBase();
$source->setShapeType("Rectangle");
$source->setX(50);
$source->setY(50);
$source->setHeight(200);
$source->setWidth(100);
$source->setAlternativeText("AlternativeText");

$solidFill = new SolidFill();
$solidFill->setColor("red");

$source->setFillFormat($solidFill);
$source->setZorderPosition(1);
$source->setType("ShapeBase");
$source->setLineFormat(null);

$apiInstance->setSlideShapeInfo($name, $slideIndex, $shapeIndex, $source, $password, $folder, $storage);