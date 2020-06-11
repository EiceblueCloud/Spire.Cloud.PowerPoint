using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;
using Spire.Cloud.Powerpoint.Sdk.Model;
using System;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace CloudPowerpoint
{
    class ImagesApiDemo
    {
        static String appId = "your id";
        static String appKey = "your key";
        static String baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId,appKey,baseUrl);
        static ImagesApi imagesApi = new ImagesApi(configuration);
        public static void GetPptImagesList()
        {
            string name = "getPptImagesList.pptx";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = imagesApi.GetPptImagesList(name, password, folder, storage);
        }
        public static void AddSlideImage()
        {
            String name = "addSlideImage.pptx";
            string imagePath = "D:/inputFile/image.png";
            System.IO.Stream imageData = new FileStream(imagePath, FileMode.Open);
            String password = null;
            String folder = "input";
            String storage = null;
            int slideIndex = 0;
            double x = 0;
            double y = 0;
            double width = 500;
            double height = 500;
            imagesApi.AddSlideImage(name, slideIndex, x, y, width, height, imageData, password, folder, storage);
        }
        public static void GetSlideImages()
        {
            String name = "getSlideImages.pptx";
            int slideIndex = 1;
            string password = null;
            string folder = "input";
            string storage = null;
            imagesApi.GetSlideImages(name, slideIndex, password, folder, storage);
        }
    }
}
