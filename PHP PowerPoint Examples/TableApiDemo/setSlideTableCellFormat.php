<?php

use \Spire\Cloud\Powerpoint\Sdk\Api\TableApi;
use \Spire\Cloud\Powerpoint\Sdk\Configuration;
use Spire\Cloud\Powerpoint\Sdk\Model\PictureFill;
use Spire\Cloud\Powerpoint\Sdk\Model\ResourceUri;
use Spire\Cloud\Powerpoint\Sdk\Model\ResourceUriElement;
use Spire\Cloud\Powerpoint\Sdk\Model\SolidFill;
use Spire\Cloud\Powerpoint\Sdk\Model\TableCell;


$appId="your id";
$appKey="your key";
$baseUrl = "https://api.e-iceblue.cn";
$configuration = new Configuration($appId,$appKey,$baseUrl);
$apiInstance = new TableApi($configuration);

/* FillFormat - SolidFill
$name = "SetSlideTableCellFormat_1.pptx"; // string | Document name.
$password = null; // string | Document password.
$folder = "Table"; // string | Document folder.
$storage = null; // string | Document storage.
$slideIndex = 0;
$shapeIndex = "0";
$source = new TableCell(array("text"=>"","row_span"=>1,"col_span"=>1,"margin_top"=>1,"margin_right"=>1,"margin_left"=>3.6,
    "margin_bottom"=>3.6,"text_anchor_type"=>"Center","text_vertical_type"=>"Horizontal"));

$solidFill = new SolidFill();
$solidFill->setColor("lightpink");

$source->setFillFormat($solidFill);
$source->setBorderDiagonalDown(null);
$source->setBorderDiagonalUp(null);
$apiInstance->setSlideTableCellFormat($name, $slideIndex, $shapeIndex, $source, $password, $folder, $storage);
*/

/* FillFormat - GradientFill
$name = "SetSlideTableCellFormat_1.pptx"; // string | Document name.
$password = null; // string | Document password.
$folder = "Table"; // string | Document folder.
$storage = null; // string | Document storage.
$slideIndex = 0;
$shapeIndex = "0";
$source = new TableCell(array("text"=>"","row_span"=>1,"col_span"=>1,"margin_top"=>3.6,"margin_right"=>3.6,"margin_left"=>3.6,
    "margin_bottom"=>3.6,"text_anchor_type"=>"Center","text_vertical_type"=>"Horizontal"));

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

$source->setBorderDiagonalDown(null);
$source->setBorderDiagonalUp(null);
$apiInstance->setSlideTableCellFormat($name, $slideIndex, $shapeIndex, $source, $password, $folder, $storage);
*/
//FillFormat - PictureFill
$name = "SetSlideTableCellFormat_1.pptx"; // string | Document name.
$password = null; // string | Document password.
$folder = "Table"; // string | Document folder.
$storage = null; // string | Document storage.
$slideIndex = 0;
$shapeIndex = "0";
$source = new TableCell(array("text"=>"","row_span"=>1,"col_span"=>1,"margin_top"=>3.6,"margin_right"=>3.6,"margin_left"=>3.6,
    "margin_bottom"=>3.6,"text_anchor_type"=>"Center","text_vertical_type"=>"Horizontal"));

$imgPath = "Powerpoint/Image.jpg";
$Uri = new ResourceUri();
$Uri->setHref($imgPath);
$Uri->setRelation(null);
$Uri->setLinkType(null);
$Uri->setTitle(null);
$image = new ResourceUriElement();
$image->setUri($Uri);

$pictureFill = new PictureFill( array("crop_bottom"=>2,"crop_left"=>5,"crop_right"=>2,"crop_top"=>5,
    "dpi"=>96, "image"=>$image, "base64_data"=>null, "svg_data"=>null, "picture_fill_mode"=>"Stretch"
));
$source->setFillFormat($pictureFill);

$apiInstance->setSlideTableCellFormat($name, $slideIndex, $shapeIndex, $source, $password, $folder, $storage);