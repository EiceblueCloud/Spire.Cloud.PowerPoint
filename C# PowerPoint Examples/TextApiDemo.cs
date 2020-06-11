using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;

namespace CloudPowerpoint
{
    class TextApiDemo
    {
        static string appId = "your id";
        static string appKey = "your key";
        static string baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey, baseUrl);
        static TextApi textApi = new TextApi(configuration);
        public static void GetPptPresentationTextItems()
        {
            string name = "test.pptx";
            bool? withEmpty = false;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = textApi.GetPptPresentationTextItems(name, withEmpty, password, folder, storage);
        }
        public static void GetPptSlideTextItems()
        {
            string name = "test.pptx";
            int? slideIndex = 0;
            bool? withEmpty = false;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = textApi.GetPptSlideTextItems(name, slideIndex, withEmpty, password, folder, storage);       
        }
        public static void ReplacePresentationText()
        {
            string name = "template.pptx";
            string oldValue = "apple";
            string newValue = "orange";
            bool? ignoreCase = false;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = textApi.ReplacePresentationText(name, oldValue, newValue, ignoreCase, password, folder, storage);
        }
        public static void ReplaceSlideText()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string oldValue = "apple";
            string newValue = "orange";
            bool? ignoreCase = true;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = textApi.ReplaceSlideText(name, slideIndex, oldValue, newValue, ignoreCase, password, folder, storage);
        }
    }
}
