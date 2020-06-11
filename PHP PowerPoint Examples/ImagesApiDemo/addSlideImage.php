<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ImagesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ImagesApi($configuration);

$name = "AddSlideImage.pptx";
$password = null;
$folder = "Images";
$storage = null;
$slideIndex = 0;
$x = 0;
$y = 0;
$width = 500;
$height = 500;
$filename = "D:/data/Image.jpg";
$image_data = new SplFileObject($filename);
$result = $apiInstance->addSlideImage($name,$slideIndex,$x,$y,$width,$height,$image_data, $password, $folder, $storage);
print_r($result);