import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.SlidesApi;
import spire.cloud.powerpoint.sdk.model.*;
import java.io.File;
import java.util.ArrayList;

public class SlidesApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey,baseUrl);
    static SlidesApi slidesApi = new SlidesApi(configuration);

    public static void deleteSlideByIndex() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 3;
        String password = null;
        String folder = "input";
        String storage = null;
        Slides response = slidesApi.deleteSlideByIndex(name, slideIndex, password, folder, storage);
    }
    public static void deleteSlidesList() throws ApiException {
        String name = "template.pptx";
        String slides = "0,2,4";
        String password = null;
        String folder = "input";
        String storage = null;
        Slides response = slidesApi.deleteSlidesList(name, slides, password, folder, storage);
    }
    public static void getSlide() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 2;
        String password = "test";
        String folder = "input";
        String storage = null;
        Slide response = slidesApi.getSlide(name, slideIndex, password, folder, storage);
    }
    public static void getSlidesList() throws ApiException {
        String name = "template.pptx";
        String password = null;
        String folder = "input";
        String storage = null;
        Slides slidesList = slidesApi.getSlidesList(name, password, folder, storage);
    }
    public static void addSlide() throws ApiException {
        String name = "template.pptx";
        Integer  position = 2;
        String password = null;
        String folder = "input";
        String storage = null;
        String layoutAlias = "TwoTextAndTwoObjects";//TitleOnly TwoTextAndTwoObjects Title TextAndObject Blank
        Slides response = slidesApi.addSlide(name, position, password, folder, storage, layoutAlias);
    }
    public static void copySlide() throws ApiException {
        String name = "template.pptx";
        Integer  slideToCopy = 2;
        Integer  position = 3;
        String source = "input/test_shapes.pptx";
        String sourcePassword = null;
        String sourceStorage = null;
        String password = null;
        String folder = "input";
        String storage = null;
        Slides response = slidesApi.copySlide(name, slideToCopy, position, source, sourcePassword, sourceStorage, password, folder, storage);
    }
    public static void moveSlide() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;//the first value is 0
        Integer  newPosition = 3;//the first value is 0
        String password = null;
        String folder = "input";
        String storage = null;
        Slides response = slidesApi.moveSlide(name, slideIndex, newPosition, password, folder, storage);
    }
    public static void reorderManySlide() throws ApiException {
        String name = "template.pptx";
        String oldPositions = "5,1,0";
        String newPositions = "0,2,3";
        String password = null;
        String folder = "input";
        String storage = null;
        Slides response = slidesApi.reorderManySlide(name, oldPositions, newPositions, password, folder, storage);
    }
    public static void setSlide() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 2;
        String password = null;
        String folder = "input";
        String storage = null;
        Slide slideDto = slidesApi.getSlide(name, slideIndex, password, folder, storage);
        ResourceUriElement uriElement = new ResourceUriElement();
        ResourceUri rUri = new ResourceUri();
        rUri.setHref("TitleOnly");
        uriElement.setUri(rUri);
        slideDto.setAlternateLinks(null);
        slideDto.setLayoutSlide(uriElement);
        slideDto.setShowMasterShapes(!slideDto.isShowMasterShapes());
        Slide response = slidesApi.setSlide(name, slideIndex, slideDto, password, folder, storage);
    }
    public static void deleteSlideComment() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        Integer  commentIndex = 0;
        String password = null;
        String folder = "input";
        String storage = null;
        SlideComments response = slidesApi.deleteSlideComment(name, slideIndex, commentIndex, password, folder, storage);
    }
    public static void deleteSlideComments() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String password = null;
        String folder = "input";
        String storage = null;
        SlideComments response = slidesApi.deleteSlideComments(name, slideIndex, password, folder, storage);
    }
    public static void deleteSlideBackground() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String password = null;
        String folder = "input";
        String storage = null;
        SlideBackground response = slidesApi.deleteSlideBackground(name, slideIndex, password, folder, storage);
    }
    public static void getSlideComments() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String password = null;
        String folder = "input";
        String storage = null;
        SlideComments response = slidesApi.getSlideComments(name, slideIndex, password, folder, storage);
    }
    public static void getSlideBackground() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 4;
        String password = null;
        String folder = "input";
        String storage = null;
        SlideBackground response = slidesApi.getSlideBackground(name, slideIndex, password, folder, storage);
    }
    public static void setSlideBackgroundColor() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 4;
        String color = "#FFB6C1";
        String password = null;
        String folder = "input";
        String storage = null;
        SlideBackground response = slidesApi.setSlideBackgroundColor(name, slideIndex, color, folder, password, storage);
    }
    public static void setSlideBackground() throws ApiException {
        String name = "template.pptx";
        String password = null;
        String folder = "input";
        String storage = null;
        Integer slideIndex = 0;
        //solidFill
        SlideBackground source = new SlideBackground();
        FillFormat fillFormat = new FillFormat();
        fillFormat.setType("SolidFill");
        source.setFillFormat(fillFormat);
        source.setType("SolidFill");
        SolidFill fill = new SolidFill("lightpink");
        source.fillFormat(fill);

//        //gradientFill
//        SlideBackground source = new SlideBackground();
//        FillFormat fillFormat = new FillFormat();
//        fillFormat.setType("GradientFill");
//        source.setFillFormat(fillFormat);
//        source.setType("GradientFill");
//        ArrayList<GradientFillStop> stops = new ArrayList<GradientFillStop>();
//        GradientFillStop stop1 = new GradientFillStop();
//        stop1.setColor("green");
//        stop1.setPosition(0d);
//        GradientFillStop stop2 = new GradientFillStop();
//        stop2.setColor("yellow");
//        stop2.setPosition(1d);
//        stops.add(stop1);
//        stops.add(stop2);
//        GradientFill fileformat = new GradientFill();
//        fileformat.setDirection("FromCorner1");
//        fileformat.setShape("Linear");
//        fileformat.setStops(stops);
//        fileformat.setLinearAngle(30d);
//        fileformat.setIsScaled(false);
//        fileformat.setTileFlip("Horizontal");
//        source.setFillFormat(fileformat);

//        //pictureFill
//        SlideBackground source = new SlideBackground();
//        source.setType("PictureFill");
//        FillFormat fillFormat = new FillFormat();
//        fillFormat.setType("PictureFill");
//        source.setFillFormat(fillFormat);
//        String imgPath = "input/Image.jpg";
//        ResourceUriElement image = new ResourceUriElement();
//        ResourceUri url = new ResourceUri();
//        url.setHref(imgPath);
//        url.setRelation(null);
//        url.setLinkType(null);
//        url.setTitle(null);
//        image.setUri(url);
//        PictureFill pictureFill = new PictureFill();
//        pictureFill.setCropBottom(2d);
//        pictureFill.setCropLeft(5d);
//        pictureFill.setCropRight(2d);
//        pictureFill.setCropTop(5d);
//        pictureFill.setDpi(96);
//        pictureFill.setImage(image);
//        pictureFill.setBase64Data(null);
//        pictureFill.setSvgData(null);
//        pictureFill.setPictureFillMode("Tile");
//        source.setFillFormat(pictureFill);
        SlideBackground response = slidesApi.setSlideBackground(name, slideIndex, source, folder, password, storage);
    }
    public static void saveSlideAsPdf() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PDF.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
    }
    public static void saveSlideAsPpt() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 3;
        String format = SlideExportFormat.PPT.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPptx() throws ApiException {
        String name = "template.ppt";
        Integer  slideIndex = 3;
        String format = SlideExportFormat.PPTX.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPng() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PNG.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsBmp() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.BMP.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsJpeg() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.JPEG.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsGif() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.GIF.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsOdp() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.ODP.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPcl() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PCL.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPps() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PPS.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPpsx() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PPSX.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPs() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PS.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsSvg() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.SVG.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsXps() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.XPS.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        File response = slidesApi.saveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPdfPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PDF.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.pdf";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsXpsPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.XPS.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.xps";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPclPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PCL.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.pcl";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPpsPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PPS.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.pps";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPpsxPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PPSX.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.ppsx";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPsPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PS.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.ps";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsSvgPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.SVG.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.svg";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsOdpPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.ODP.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.odp";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPptPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PPT.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.ppt";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPptxPath() throws ApiException {
        String name = "template.ppt";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PPTX.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.pptx";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsPngPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.PNG.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.png";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsBmpPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.BMP.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.bmp";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsJpegPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.JPEG.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.ipeg";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
    public static void saveSlideAsGifPath() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        String format = SlideExportFormat.GIF.toString();
        ExportOptions options = null;
        Integer  width = 400;
        Integer  height = 300;
        String password = null;
        String folder = "input";
        String storage = null;
        String destFilePath = "output/output.gif";
        slidesApi.saveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
    }
}
