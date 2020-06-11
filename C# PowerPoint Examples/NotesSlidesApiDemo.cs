using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;

namespace CloudPowerpoint
{
    class NotesSlidesApiDemo
    {
        static string appId = "your id";
        static string appKey = "your key";
        static string baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey, baseUrl);
        static NotesSlidesApi notesSlidesApi = new NotesSlidesApi(configuration);
        public static void DeleteNotesSlide()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = notesSlidesApi.DeleteNotesSlide(name, slideIndex, password, folder, storage);
        }
        public static void GetNotesSlide()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = notesSlidesApi.GetNotesSlide(name, slideIndex, password, folder, storage);
        }
        public static void AddNotesSlide()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string note = "This is note info";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = notesSlidesApi.AddNotesSlide(name, slideIndex, note, password, folder, storage);
        }
        public static void SetNotesSlide()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string note = "update note";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = notesSlidesApi.SetNotesSlide(name, slideIndex, note, password, folder, storage);
        }
    }
}
