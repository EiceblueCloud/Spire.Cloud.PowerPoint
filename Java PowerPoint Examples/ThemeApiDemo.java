import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.ThemeApi;
import spire.cloud.powerpoint.sdk.model.*;

public class ThemeApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey, baseUrl);
    static ThemeApi themeApi = new ThemeApi(configuration);

    public static void getSlidesTheme() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String password = null;
        String folder = "input";
        String storage = null;
        Theme response = themeApi.getSlidesTheme(name, slideIndex, password, folder, storage);
    }
    public static void getSlidesThemeColorScheme() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String password = null;
        String folder = "input";
        String storage = null;
        ColorScheme response = themeApi.getSlidesThemeColorScheme(name, slideIndex, password, folder, storage);
    }
    public static void getSlidesThemeFontScheme() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String password = null;
        String folder = "input";
        String storage = null;
        FontScheme response = themeApi.getSlidesThemeFontScheme(name, slideIndex, password, folder, storage);
    }
    public static void getSlidesThemeFormatScheme() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String password = null;
        String folder = "input";
        String storage = null;
        FormatScheme response = themeApi.getSlidesThemeFormatScheme(name, slideIndex, password, folder, storage);
    }
}
