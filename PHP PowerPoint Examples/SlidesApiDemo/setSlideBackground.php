<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\SlidesApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;
use Spire\Cloud\Powerpoint\Sdk\Model\FillFormat;
use Spire\Cloud\Powerpoint\Sdk\Model\PictureFill;
use Spire\Cloud\Powerpoint\Sdk\Model\ResourceUri;
use Spire\Cloud\Powerpoint\Sdk\Model\ResourceUriElement;
use Spire\Cloud\Powerpoint\Sdk\Model\SlideBackground;
use Spire\Cloud\Powerpoint\Sdk\Test\Util;

$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new SlidesApi($configuration);

/* demo - solid
$name = "SetSlideBackground_1.pptx"; // string | Document name.
$password = null; // string | Document password.
$folder = "Slides/Background"; // string | Document folder.
$storage = null; // string | Document storage.
$slideIndex = 0;
$fillFormat = new FillFormat();
$fillFormat->setType("SolidFill");
$source = new SlideBackground(array("type" => "SolidFill" ,"fill_format" =>$fillFormat));
$fill = new SolidFill();
$fill->setColor("lightpink");
$source->setFillFormat($fill);
$apiInstance->setSlideBackground($name, $slideIndex, $source, $folder, $password, $storage);
*/

/* demo - Gradient
$name = "SetSlideBackground_2.pptx"; // string | Document name.
$password = null; // string | Document password.
$folder = "Slides/Background"; // string | Document folder.
$storage = null; // string | Document storage.
$slideIndex = 0;
$fillFormat = new FillFormat();
$fillFormat->setType("GradientFill");
$source = new SlideBackground(array("type" => "GradientFill" ,"fill_format" =>$fillFormat));

$stop1 = new GradientFillStop();
$stop1->setColor("green");
$stop1->setPosition(0);

$stop2 = new GradientFillStop();
$stop2->setColor("yellow");
$stop2->setPosition(1);

$stops = array($stop1, $stop2);

$fileFormat = new GradientFill();
$fileFormat->setDirection("FromCorner1");
$fileFormat->setShape("Linear");
$fileFormat->setStops($stops);
$fileFormat->setLinearAngle(30);
$fileFormat->setIsScaled(false);
$fileFormat->setTileFlip("Horizontal");
$source->setFillFormat($fileFormat);
$apiInstance->setSlideBackground($name, $slideIndex, $source, $folder, $password, $storage);
*/

// demo - picture
$name = "SetSlideBackground_3.pptx"; 
$password = null; 
$folder = "Slides/Background"; 
$storage = null; 
$slideIndex = 0;
$fillFormat = new FillFormat();
$fillFormat->setType("PictureFill");
$source = new SlideBackground(array("type" => "PictureFill" ,"fill_format" =>$fillFormat));
$imgPath = "Powerpoint/Image.jpg";
$Uri = new ResourceUri();
$Uri->setHref($imgPath);
$Uri->setRelation(null);
$Uri->setLinkType(null);
$Uri->setTitle(null);
$image = new ResourceUriElement();
$image->setUri($Uri);

$pictureFill = new PictureFill( array("crop_bottom"=>2,"crop_left"=>5,"crop_right"=>2,"crop_top"=>5,
    "dpi"=>96, "image"=>$image, "base64_data"=>null, "svg_data"=>null, "picture_fill_mode"=>"Tile"
));
$source->setFillFormat($pictureFill);

$apiInstance->setSlideBackground($name, $slideIndex, $source, $folder, $password, $storage);