<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;
use Spire\Cloud\Powerpoint\Sdk\Model\ResourceUri;
use Spire\Cloud\Powerpoint\Sdk\Model\ResourceUriElement;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

$name = "SetSlide.pptx"; 
$slideIndex = 4;
$password = null; 
$folder = "Slides"; 
$storage = null; 
$slide = $apiInstance->getSlide($name, $slideIndex, $password, $folder, $storage);
$uriElement = new ResourceUriElement();
$uri = new ResourceUri();
$uri->setHref("TitleOnly");
$uriElement->setUri($uri);
$slide->setHeight(800);
$slide->setWidth(800);
$slide->setAlternateLinks(null);
$slide->setLayoutSlide($uriElement);
$slide->setShowMasterShapes(!$slide->getShowMasterShapes());
$apiInstance->setSlide($name, $slideIndex, $slide, $password, $folder, $storage);