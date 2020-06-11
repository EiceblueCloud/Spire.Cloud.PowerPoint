using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;

namespace CloudPowerpoint
{
    class ThemeApiDemo
    {
        static string appId = "your id";
        static string appKey = "your key";
        static string baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey, baseUrl);
        static ThemeApi themeApi = new ThemeApi(configuration);
        public static void GetSlidesTheme()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = themeApi.GetSlidesTheme(name, slideIndex, password, folder, storage);
        }      
        public static void GetSlidesThemeColorScheme()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = themeApi.GetSlidesThemeColorScheme(name, slideIndex, password, folder, storage);
        }
        public static void GetSlidesThemeFontScheme()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string password = null;
            string folder = "input";
            string storage = null;         
            var response = themeApi.GetSlidesThemeFontScheme(name, slideIndex, password, folder, storage);
        }
        public static void GetSlidesThemeFormatScheme()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = themeApi.GetSlidesThemeFormatScheme(name, slideIndex, password, folder, storage);
        }

    }
}
