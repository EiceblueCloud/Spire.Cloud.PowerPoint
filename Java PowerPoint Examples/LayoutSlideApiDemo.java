import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.LayoutSlidesApi;
import spire.cloud.powerpoint.sdk.model.*;

public class LayoutSlideApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey, baseUrl);
    static LayoutSlidesApi layoutSlidesApi = new LayoutSlidesApi(configuration);

    public static void getLayoutSlide() throws ApiException {
        String name = "getLayoutSlide.pptx";
        Integer slideIndex = 0;
        String password = null;
        String folder = "input";
        String storage = null;
        LayoutSlide response = layoutSlidesApi.getLayoutSlide(name, slideIndex, password, folder, storage);
    }

    public static void getLayoutSlidesList() throws ApiException {
        String name = "getLayoutSlidesList.pptx";
        String password = null;
        String folder = "input";
        String storage = null;
        LayoutSlides reponse = layoutSlidesApi.getLayoutSlidesList(name, password, folder, storage);
    }
}
