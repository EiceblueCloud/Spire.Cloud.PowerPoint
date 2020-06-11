import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.TextApi;
import spire.cloud.powerpoint.sdk.model.*;

public class TextApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey, baseUrl);
    static TextApi textApi = new TextApi(configuration);

    public static void getPptPresentationTextItems() throws ApiException {
        String name = "test.pptx";
        Boolean withEmpty = false;
        String password = null;
        String folder = "input";
        String storage = null;
        TextItems response = textApi.getPptPresentationTextItems(name, withEmpty, password, folder, storage);
    }
    public static void getPptSlideTextItems() throws ApiException {
        String name = "test.pptx";
        Integer  slideIndex = 0;
        Boolean withEmpty = false;
        String password = null;
        String folder = "input";
        String storage = null;
        TextItems response = textApi.getPptSlideTextItems(name, slideIndex, withEmpty, password, folder, storage);
    }
    public static void replacePresentationText() throws ApiException {
        String name = "template.pptx";
        String oldValue = "apple";
        String newValue = "orange";
        Boolean ignoreCase = false;
        String password = null;
        String folder = "input";
        String storage = null;
        DocumentReplaceResult response = textApi.replacePresentationText(name, oldValue, newValue, ignoreCase, password, folder, storage);
    }
    public static void replaceSlideText() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String oldValue = "apple";
        String newValue = "orange";
        Boolean ignoreCase = true;
        String password = null;
        String folder = "input";
        String storage = null;
        SlideReplaceResult response = textApi.replaceSlideText(name, slideIndex, oldValue, newValue, ignoreCase, password, folder, storage);
    }
}
