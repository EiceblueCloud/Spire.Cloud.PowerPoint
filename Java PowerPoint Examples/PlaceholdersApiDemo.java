import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.PlaceholdersApi;
import spire.cloud.powerpoint.sdk.model.*;

public class PlaceholdersApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey, baseUrl);
    static PlaceholdersApi placeholdersApi = new PlaceholdersApi(configuration);

    public static void getSlidesPlaceholder() throws ApiException {
        String name = "template.pptx";
        Integer slideIndex = 0;
        Integer placeholderIndex = 0;
        String password = null;
        String folder = "input";
        String storage = null;
        Placeholder response = placeholdersApi.getSlidesPlaceholder(name, slideIndex, placeholderIndex, password, folder, storage);
    }

    public static void getSlidesPlaceholders() throws ApiException {
        String name = "template.pptx";
        Integer slideIndex = 0;
        String password = null;
        String folder = "input";
        String storage = null;
        Placeholders response = placeholdersApi.getSlidesPlaceholders(name, slideIndex, password, folder, storage);
    }
}
