import java.io.File;

import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.model.ExportFormat;
import spire.cloud.powerpoint.sdk.api.GeneralApi;

public class GeneralApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey, baseUrl);
    static GeneralApi generalApi = new GeneralApi(configuration);

    public static void convertInRequest() throws ApiException {
        String format = ExportFormat.PPT.toString(); //PPTX PPSX PPT PPS ODP PDF XPS PS PCL
        String inputFilePath = "D:/inputFile/convertInRequest.pptx";
        File document = new File(inputFilePath);
        String password = null;
        File response = generalApi.convertInRequest(format, document, password);
    }

    public static void ConvertInRequestToPath() throws ApiException {
        String format = ExportFormat.PDF.toString(); //PPTX PPSX PPT PPS ODP PDF XPS PS PCL
        String destFilePath = "output/convertInRequestToPath_out.pdf";
        String inputFilePath = "D:/inputFile/convertInRequestToPath.pptx";
        File document = new File(inputFilePath);
        String password = null;
        generalApi.convertInRequestToPath(format, destFilePath, document, password);
    }

}
