<?php

use Spire\Cloud\Powerpoint\Sdk\Api\ShapesApi;
use Spire\Cloud\Powerpoint\Sdk\Configuration;

$appId = "your id";
$appKey = "your key";
$baseUrl="https://api.e-iceblue.cn";
$configuration = new Configuration($appId, $appKey,$baseUrl);
$apiInstance = new ShapesApi($configuration);

$name = "AddNewShape.pptx";
$password = null;
$folder = "input";
$storage = null;

$slideIndex = 0;
$source = new ShapeBase();
$source->setShapeType("Rectangle");
$source->setX(50);
$source->setY(50);
$source->setHeight(100);
$source->setWidth(200);
$source->setAlternativeText("AlternativeText");

$imgPath = "input/Image.jpg";
$url = new ResourceUri();
$url->setHref($imgPath);
$url->setRelation(null);
$url->setLinkType(null);
$url->setTitle(null);
$image = new ResourceUriElement();
$image->setUri($url);

$pictureFill = new PictureFill();
$pictureFill->setCropBottom(2);
$pictureFill->setCropLeft(5);
$pictureFill->setCropRight(2);
$pictureFill->setCropTop(5);
$pictureFill->setDpi(96);
$pictureFill->setImage($image);
$pictureFill->setBase64Data(null);
$pictureFill->setSvgData(null);
$pictureFill->setPictureFillMode("Tile");

$source->setFillFormat($pictureFill);
//effect
$blurEffect = new  BlurEffect();
$blurEffect->setRadius(1);
$blurEffect->setGrow(false);

$glowEffect = new GlowEffect();
$glowEffect->setRadius(1);
$glowEffect->setColor("red");

$innerShadowEffect = new InnerShadowEffect();
$innerShadowEffect->setDirection(30);
$innerShadowEffect->setDistance(2);
$innerShadowEffect->setBlurRadius(1);
$innerShadowEffect->setShadowColor("blue");

$outerShadowEffect = new OuterShadowEffect();
$outerShadowEffect->setDirection(45);
$outerShadowEffect->setDistance(2);
$outerShadowEffect->setBlurRadius(1);
$outerShadowEffect->setShadowColor("black");
$presetShadowEffect = new PresetShadowEffect();
$presetShadowEffect->setDirection(20);
$presetShadowEffect->setDistance(2);
$presetShadowEffect->setPreset("TopLeftDrop");
$presetShadowEffect->setShadowColor("yellow");

$softEdgeEffect = new SoftEdgeEffect();
$softEdgeEffect->setRadius(2);

$reflectionEffect = new ReflectionEffect();
$reflectionEffect->setDirection(30);
$reflectionEffect->setFadeDirection(30);
$reflectionEffect->setDistance(1);
$reflectionEffect->setBlurRadius(1);
$reflectionEffect->setScaleHorizontal(100);
$reflectionEffect->setScaleVertical(100);
$reflectionEffect->setSkewHorizontal(0);
$reflectionEffect->setSkewVertical(0);
$reflectionEffect->setstartPosAlpha(0);
$reflectionEffect->setEndPosAlpha(100);
$reflectionEffect->setStartReflectionOpacity(100);
$reflectionEffect->setEndReflectionOpacity(0);
$reflectionEffect->setRectangleAlign("TopLeft");
$reflectionEffect->setRotateShadowWithShape(true);

$fillOverlayEffect = new FillOverlayEffect();
$fillOverlayEffect->setBlend("Darken");

$effectFormat = new EffectFormat();
$effectFormat->setBlur($blurEffect);
$effectFormat->setGlow($glowEffect);
$effectFormat->setInnerShadow($innerShadowEffect);
$effectFormat->setOuterShadow($outerShadowEffect);
$effectFormat->setPresetShadow($presetShadowEffect);
$effectFormat->setSoftEdge($softEdgeEffect);
$effectFormat->setReflection($reflectionEffect);
$effectFormat->setFillOverlay($fillOverlayEffect);

$source->setEffectFormat($effectFormat);

//lineformat
$begainArrowHead = new ArrowHeadProperties();
$begainArrowHead->setLength("Short");
$begainArrowHead->setStyle("TriangleArrowHead");
$begainArrowHead->setWidth("Narrow");

$endArrowHead = new ArrowHeadProperties();
$endArrowHead->setLength("Short");
$endArrowHead->setStyle("TriangleArrowHead");
$endArrowHead->setWidth("Narrow");

$lineFormat = new LineFormat();
$lineFormat->setAlignment("Center");
$lineFormat->setCapStyle("Round");
$lineFormat->setDashStyle("Dot");
$lineFormat->setJoinStyle("Bevel");
$lineFormat->setStyle("ThinThin");
$lineFormat->setBeginArrowHead($begainArrowHead);
$lineFormat->setEndArrowHead($endArrowHead);
$lineFormat->setCustomDashPattern(null);

$solidFill = new SolidFill();
$solidFill->setColor("Red");

$lineFormat->setFillFormat($solidFill);
$lineFormat->setMiterLimit(1);
$lineFormat->setWidth(4);

$source->setLineFormat($lineFormat);

$shapeToClone = null;
$position = null;

$apiInstance->addNewShape($name, $slideIndex, $source, $password, $folder, $storage, $shapeToClone, $position);