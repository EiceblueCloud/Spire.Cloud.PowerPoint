using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;

namespace CloudPowerpoint
{
    class PlaceholdersApiDemo
    {
        static string appId = "your id";
        static string appKey = "your key";
        static string baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey, baseUrl);
        static PlaceholdersApi placeholdersApi = new PlaceholdersApi(configuration);
        public static void GetSlidesPlaceholder()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            int? placeholderIndex = 0;
            string password = null;
            string folder = "input";
            string storage = null;    
            var response = placeholdersApi.GetSlidesPlaceholder(name, slideIndex, placeholderIndex, password, folder, storage);
        }
        public static void GetSlidesPlaceholders()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = placeholdersApi.GetSlidesPlaceholders(name, slideIndex, password, folder, storage);
        }
    }
}
