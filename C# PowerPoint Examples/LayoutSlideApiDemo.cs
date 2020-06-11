using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;
using System;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CloudPowerpoint
{
    class LayoutSlideApiDemo
    {
        static String appId = "your id";
        static String appKey = "your key";
        static String baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey,baseUrl);
        static LayoutSlidesApi layoutSlidesApi = new LayoutSlidesApi(configuration);
        public static void GetLayoutSlide()
        {
            string name = "getLayoutSlide.pptx";
            int? slideIndex = 0;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = layoutSlidesApi.GetLayoutSlide(name, slideIndex, password, folder, storage);
        }
        public static void GetLayoutSlidesList()
        {
            string name = "getLayoutSlidesList.pptx";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = layoutSlidesApi.GetLayoutSlidesList(name, password, folder, storage);
        }
    }
}
