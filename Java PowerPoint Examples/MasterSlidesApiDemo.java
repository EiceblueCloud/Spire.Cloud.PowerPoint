import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.MasterSlidesApi;
import spire.cloud.powerpoint.sdk.model.*;

public class MasterSlidesApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey, baseUrl);
    static MasterSlidesApi masterSlidesApi = new MasterSlidesApi(configuration);

    public static void getMasterSlide() throws ApiException {
        String name = "getMasterSlide.pptx";
        String password = null;
        Integer slideIndex = 0;
        String storage = null;
        String folder = "input";
        MasterSlide response = masterSlidesApi.getMasterSlide(name, slideIndex, password, folder, storage);
    }

    public static void getMasterSlidesList() throws ApiException {
        String name = "getMasterSlidesList.pptx";
        String password = null;
        String folder = "input";
        String storage = null;
        MasterSlides response = masterSlidesApi.getMasterSlidesList(name, password, folder, storage);
    }

    public static void copyMasterSlideFrom() throws ApiException {
        String name = "copyMasterSlideFrom.pptx";
        String source = "source/masterSource.pptx";
        Integer masterIndex = 0;
        String password = null;
        String cloneFromPassword = null;
        String cloneFromStorage = null;
        Boolean applyToAll = null;
        String newFolder = "masterslides";
        String storage = null;
        MasterSlide response = masterSlidesApi.copyMasterSlideFrom(name, source, masterIndex, cloneFromPassword, cloneFromStorage, applyToAll, password, newFolder, storage);
    }
}
