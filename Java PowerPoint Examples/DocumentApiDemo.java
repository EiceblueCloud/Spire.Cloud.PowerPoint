import java.io.File;

import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.model.*;
import spire.cloud.powerpoint.sdk.api.DocumentApi;

public class DocumentApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey, baseUrl);
    static DocumentApi documentApi = new DocumentApi(configuration);

    public static void getPptDocument() throws ApiException {
        String name = "getPptDocument.pptx";
        String password = null;
        String storage = null;
        String folder = "input";
        Document response = documentApi.getPptDocument(name, password, storage, folder);
    }

    public static void createPptDocument() throws ApiException {
        String name = "createPptDocument.pptx";
        File data = new File("D:/inputFile/test.pptx");
        String inputPassword = null;
        String password = null;
        String storage = null;
        String folder = "input";
        Document response = documentApi.createPptDocument(name, data, inputPassword, password, storage, folder);
    }

    public static void createPptDocumentFromSource() throws ApiException {
        String name = "createPptDocumentFromSource.pptx";
        String sourcePath = "source";
        String sourcePassword = null;
        String sourceStorage = null;
        String password = "test";
        String storage = null;
        String newFolder = "input";
        Document response = documentApi.createPptDocumentFromSource(name, sourcePath, sourcePassword, sourceStorage, password, storage, newFolder);
    }

    public static void convertPpt() throws ApiException {
        String name = "convertPpt.pptx";
        String format = ExportFormat.PDF.toString(); // Odp、PPT、PPtx、PPS、PPSx、Pdf、Xps
        ExportOptions options = null;
        String password = null;
        String storage = null;
        String folder = "input";
        File response = documentApi.convertPpt(name, format, options, password, storage, folder);
    }

    public static void convertPptToPath() throws ApiException {
        String name = "convertPptToPath.pptx";
        String format = ExportFormat.PPTX.toString(); // Odp、PPT、PPtx、PPS、PPSx、Pdf、Xps
        ExportOptions options = null;
        String password = null;
        String storage = null;
        String folder = "input";
        String destFilePath = "output/convertPptToPath_out.pptx";
        documentApi.convertPptToPath(name, destFilePath, format, options, password, storage, folder);
    }

    public static void splitPpt() throws ApiException {
        String name = "splitPpt.pptx";
        ExportOptions options = null;
        String format = SlideExportFormat.SVG.toString(); // JPEG PNG GIF BMP PPTX PPSX PPT PPS ODP PDF XPS PS PCL SVG
        Integer width = 400;
        Integer height = 300;
        Integer from = 3;
        Integer to = 6;
        String destFolder = "output";
        String password = null;
        String storage = null;
        String folder = "input";
        SplitDocumentResult response = documentApi.splitPpt(name, options, format, width, height, to, from, destFolder, password, storage, folder);
    }

    public static void setPptSlideSize() throws ApiException {
        String name = "setPptSlideSize.pptx";
        String password = null;
        String storage = null;
        String folder = "input";
        Integer width = 800;
        Integer height = 600;
        String sizeType = null; //Available values : OnScreen, LetterPaper, A4Paper, Slide35mm, Overhead, Banner, Custom, Ledger, A3Paper, B4IsoPaper, B5IsoPaper, B4JisPaper, B5JisPaper, HagakiCard, OnScreen16x9, OnScreen16x10
        String scaleType = null; //Available values : DoNotScale, EnsureFit, Maximize; Default value : DoNotScale
        Document response = documentApi.setPptSlideSize(name, password, storage, folder, width, height, sizeType, scaleType);
    }
}
