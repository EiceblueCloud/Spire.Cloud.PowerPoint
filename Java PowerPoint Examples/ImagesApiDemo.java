import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.ImagesApi;
import spire.cloud.powerpoint.sdk.model.Images;

import java.io.File;

public class ImagesApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey, baseUrl);
    static ImagesApi imagesApi = new ImagesApi(configuration);
    
    public static void getPptImagesList() throws ApiException {
        String name = "getPptImagesList.pptx";
        String password = null;
        String folder = "input";
        String storage = null;
        Images response = imagesApi.getPptImagesList(name, password, folder, storage);
    }

    public static void addSlideImage() throws ApiException {
        String name = "addSlideImage.pptx";
        String imagePath = "D:/inputFile/image.png";
        File imageData = new File(imagePath);
        String password = null;
        String folder = "input";
        String storage = null;
        int slideIndex = 0;
        double x = 0;
        double y = 0;
        double width = 500;
        double height = 500;
        imagesApi.addSlideImage(name, slideIndex, x, y, width, height, imageData, password, folder, storage);
    }

    public static void getSlideImages() throws ApiException {
        String name = "getSlideImages.pptx";
        int slideIndex = 1;
        String password = null;
        String folder = "input";
        String storage = null;
        imagesApi.getSlideImages(name, slideIndex, password, folder, storage);
    }
}
