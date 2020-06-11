import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.ShapesApi;
import spire.cloud.powerpoint.sdk.model.*;

public class ShapesApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey,baseUrl);
    static ShapesApi shapesApi = new ShapesApi(configuration);
    
    public static void deleteSlideParagraph() throws ApiException {
        String name = "deleteSlideParagraph.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  paragraphIndex = 0;
        String password = null;
        String storage = null;
        String folder = "input";
        Paragraphs response = shapesApi.deleteSlideParagraph(name, slideIndex, shapeIndex, paragraphIndex, password, folder, storage);
    }
    public static void deleteSlideParagraphs() throws ApiException {
        String name = "deleteSlideParagraphs.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String paragraphs = "[0,1]";
        String password = null;
        String storage = null;
        String folder = "input";
        Paragraphs response = shapesApi.deleteSlideParagraphs(name, slideIndex, shapeIndex, paragraphs, password, folder, storage);
    }
    public static void deleteSlideShape() throws ApiException {
        String name = "deleteSlideShape.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String password = null;
        String storage = null;
        String folder = "input";
        Shapes response = shapesApi.deleteSlideShape(name, slideIndex, shapeIndex, password, folder, storage);
    }
    public static void deleteSlideShapes() throws ApiException {
        String name = "deleteSlideShapes.pptx";
        Integer  slideIndex = 0;
        String shapes = "[0,1]";
        String password = null;
        String storage = null;
        String folder = "input";
        Shapes response = shapesApi.deleteSlideShapes(name, slideIndex, shapes, password, folder, storage);
    }
    public static void deleteSlideTextRanges() throws ApiException {
        String name = "deleteSlideTextRanges.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  paragraphIndex = 0;
        String portions = "[0,1]";
        String password = null;
        String storage = null;
        String folder = "input";
        Portions response = shapesApi.deleteSlideTextRanges(name, slideIndex, shapeIndex, paragraphIndex, portions, password, folder, storage);
    }
    public static void deleteSlideTextRange() throws ApiException {
        String name = "deleteSlideTextRange.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  paragraphIndex = 0;
        int portionIndex = 0;
        String password = null;
        String storage = null;
        String folder = "input";
        Portions response = shapesApi.deleteSlideTextRange(name, slideIndex, shapeIndex, paragraphIndex, portionIndex, password, folder, storage);
    }
    public static void getSlideShape() throws ApiException {
        String name = "getSlideShape.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String password = null;
        String storage = null;
        String folder = "input";
        ShapeBase response = shapesApi.getSlideShape(name, slideIndex, shapeIndex, password, folder, storage);
    }
    public static void getSlideShapeParagraph() throws ApiException {
        String name = "getSlideShapeParagraph.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  paragraphIndex = 0;
        String password = null;
        String storage = null;
        String folder = "input";
        Paragraph response = shapesApi.getSlideShapeParagraph(name, slideIndex, shapeIndex, paragraphIndex, password, folder, storage);
    }
    public static void getSlideShapeParagraphs() throws ApiException {
        String name = "getSlideShapeParagraphs.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String password = null;
        String storage = null;
        String folder = "input";
        Paragraphs response = shapesApi.getSlideShapeParagraphs(name, slideIndex, shapeIndex, password, folder, storage);
    }
    public static void getSlideShapeTextRange() throws ApiException {
        String name = "getSlideShapeTextRange.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  paragraphIndex = 0;
        Integer  portionIndex = 0;
        String password = null;
        String storage = null;
        String folder = "input";
        Portion response = shapesApi.getSlideShapeTextRange(name, slideIndex, shapeIndex, paragraphIndex, portionIndex, password, folder, storage);
    }
    public static void getSlideShapeTextRanges() throws ApiException {
        String name = "getSlideShapeTextRanges.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  paragraphIndex = 0;
        String password = null;
        String storage = null;
        String folder = "input";
        Portions response = shapesApi.getSlideShapeTextRanges(name, slideIndex, shapeIndex, paragraphIndex, password, folder, storage);
    }
    public static void getSlideShapes() throws ApiException {
        String name = "getSlideShapes.pptx";
        Integer  slideIndex = 0;
        String password = null;
        String storage = null;
        String folder = "input";
        Shapes response = shapesApi.getSlideShapes(name, slideIndex, password, folder, storage);
    }
    public static void addNewShape() throws ApiException {
        String name = "addNewShape.pptx";
        Integer  slideIndex = 0;
        String password = null;
        String storage = null;
        String folder = "input";
        ShapeBase source = new ShapeBase();
        source.setName("ShapeName");
        source.setShapeType(ShapeTypeEnum.BEVEL.toString());
        source.setX(50d);
        source.setY(50d);
        source.setHeight(100d);
        source.setWidth(200d);
        source.setAlternativeText( "AlternativeText");
        source.setAlternativeTextTitle("AlternativeTextTitle");
        source.setHidden( false);
        //picture
        String fileName = "input/image.jpg";
        ResourceUriElement image = new ResourceUriElement();
        ResourceUri url = new ResourceUri();
        url.setHref(fileName);
        url.setRelation(null);
        url.setLinkType(null);
        url.setTitle(null);
        image.setUri(url);
        PictureFill pictureFill = new PictureFill();
        pictureFill.setCropBottom(2d);
        pictureFill.setCropLeft(5d);
        pictureFill.setCropRight(2d);
        pictureFill.setCropTop(5d);
        pictureFill.setDpi(96);
        pictureFill.setImage(image);
        pictureFill.setBase64Data(null);
        pictureFill.setSvgData(null);
        pictureFill.setPictureFillMode("Tile");
        source.setFillFormat(pictureFill);
        source.setZorderPosition(0);
        source.setType("ShapeBase");

        ArrowHeadProperties begainArrowHead = new ArrowHeadProperties();
        begainArrowHead.setLength("Short");
        begainArrowHead.setStyle("TriangleArrowHead");
        begainArrowHead.setWidth("Narrow");
        ArrowHeadProperties endArrowHead = new ArrowHeadProperties();
        endArrowHead.setLength("Short");
        endArrowHead.setStyle("TriangleArrowHead");
        endArrowHead.setWidth("Narrow");
        LineFormat lineFormat = new LineFormat();
        lineFormat.setAlignment("Center");
        lineFormat.setCapStyle("Round");
        lineFormat.setDashStyle("Dot");
        lineFormat.joinStyle("Bevel");
        lineFormat.style("ThinThin");
        lineFormat.beginArrowHead(begainArrowHead);
        lineFormat.endArrowHead(endArrowHead);
        lineFormat.setCustomDashPattern(null);
        SolidFill solidFill = new SolidFill("red");
        lineFormat.setFillFormat(solidFill);
        lineFormat.setMiterLimit(1d);
        lineFormat.setWidth(4d);
        source.setLineFormat(lineFormat);
        Integer shapeToClone = null;
        Integer position = null;
        ShapeBase response = shapesApi.addNewShape(name, slideIndex, source, password, folder, storage, shapeToClone, position);
    }
    public static void addSlideNewParagraph() throws ApiException {
        String name = "addSlideNewParagraph.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Paragraph source = new Paragraph();
        source.setAlignment(Paragraph.AlignmentEnum.CENTER);
        source.setEastAsianLineBreak(false);
        source.setTextAlignment(Paragraph.TextAlignmentEnum.CENTER);
        source.setMarginLeft(1d);
        source.setMarginRight(5d);
        source.setSpaceAfter(1d);
        source.setSpaceBefore(5d);
        source.setIndent(2d);
        String password = null;
        String storage = null;
        String folder = "input";
        Integer  position = null;
        Paragraph response = shapesApi.addSlideNewParagraph(name, slideIndex, shapeIndex, source, password, folder, storage, position);
    }
    public static void addSlideNewTextRange() throws ApiException {
        String name = "addSlideNewTextRange.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  paragraphIndex = 0;
        Portion source = new Portion();
        source.setText("add new Text");
        source.setFontBold(true);
        source.setFontColor("blue");
        source.spacing(5d);
        String password = null;
        String storage = null;
        Integer  position = null;
        String folder = "input";
        Portion response = shapesApi.addSlideNewTextRange(name, slideIndex, shapeIndex, paragraphIndex, source, password, folder, storage, position);
    }
    public static void setParagraphTextRangeProperties() throws ApiException {
        String name = "shapes.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  paragraphIndex = 0;
        Integer  portionIndex = 0;
        Portion source = new Portion();
        source.setText( "SetParagraphTextRangeProperties");
        source.setFontHeight(20d);
        String password = null;
        String storage = null;
        String folder = "input";
        source.setSpacing(1d);
        source.setFontColor( "blue");
        Portion response = shapesApi.setParagraphTextRangeProperties(name, slideIndex, shapeIndex, paragraphIndex, portionIndex, source, password, folder, storage);
    }
    public static void saveShapeAs() throws ApiException {
        String name = "saveShapeAs.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String format = "png";
        String destFilePath = "output/saveShapeAs_out.png";
        String password = null;
        String storage = null;
        double scaleX = 1.0;
        double scaleY = 1.0;
        Integer  bounds = null;
        String fontsFolder = null;
        String folder = "input";
        shapesApi.saveShapeAs(name, slideIndex, shapeIndex, format, destFilePath, password, folder, storage, scaleX, scaleY, bounds, fontsFolder);
    }
    public static void setSlideShapeInfo() throws ApiException {
        String name = "setSlideShapeInfo.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        ShapeBase source = new ShapeBase();
        source.setShapeType(ShapeTypeEnum.RECTANGLE.getValue());
        source.setX(50d);
        source.setY(50d);
        source.setHeight(200d);
        source.setWidth(100d);
        source.setAlternativeText("AlternativeText");
        SolidFill solidFill = new SolidFill("red");
        source.setFillFormat(solidFill);
        source.setZorderPosition(1);
        source.setType("ShapeBase");
        source.setLineFormat(null);
        String password = null;
        String storage = null;
        String folder = "input";
        ShapeBase response = shapesApi.setSlideShapeInfo(name, slideIndex, shapeIndex, source, password, folder, storage);
    }
    public static void setSlideShapeParagraph() throws ApiException {
        String name = "setSlideShapeParagraph.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  paragraphIndex = 0;
        Paragraph source = new Paragraph();
        source.setMarginLeft(50d);
        source.setTextAlignment(Paragraph.TextAlignmentEnum.TOP);
        source.setAlignment(Paragraph.AlignmentEnum.RIGHT);
        String password = null;
        String storage = null;
        String folder = "input";
        Paragraph response = shapesApi.setSlideShapeParagraph(name, slideIndex, shapeIndex, paragraphIndex, source, password, folder, storage);
    }
}
