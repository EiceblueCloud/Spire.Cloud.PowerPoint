using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;
using Spire.Cloud.Powerpoint.Sdk.Model;
using System;
using System.Linq;
using System.Threading.Tasks;
using System.IO;

namespace CloudPowerpoint
{
    class DocumentApiDemo
    {
        static String appId = "your id";
        static String appKey = "your key";
        static String baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey, baseUrl);
        static DocumentApi documentApi = new DocumentApi(configuration);
        public static void GetPptDocument()
        {
            string name = "getPptDocument.pptx";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = documentApi.GetPptDocument(name, password, storage, folder);
        }
        public static void CreatePptDocument()
        {
            string name = "createPptDocument.pptx";
            System.IO.Stream data = new FileStream("D:/inputFile/test.pptx", FileMode.Open);
            string inputPassword = null;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = documentApi.CreatePptDocument(name, data, inputPassword, password, storage, folder);
        }
        public static void CreatePptDocumentFromSource()
        {
            string name = "createPptDocumentFromSource.pptx";
            string sourcePath = "source";
            string sourcePassword = null;
            string sourceStorage = null;
            string password = "test";
            string storage = null;
            string newFolder = "input";
            var response = documentApi.CreatePptDocumentFromSource(name, sourcePath, sourcePassword, sourceStorage, password, storage, newFolder);
        }
      
        public static void ConvertPpt()
        {
            string name = "convertPpt.pptx";
            string format = ExportFormat.Pdf.ToString(); // Odp、PPT、PPtx、PPS、PPSx、Pdf、Xps
            ExportOptions options = null;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = documentApi.ConvertPpt(name, format, options, password, storage, folder);
        }
        public static void ConvertPptToPath()
        {
            string name = "convertPptToPath.pptx";
            string format = ExportFormat.Pptx.ToString(); // Odp、PPT、PPtx、PPS、PPSx、Pdf、Xps
            ExportOptions options = null;
            string password = null;
            string storage = null;
            string folder = "input";
            string destFilePath = "output/convertPptToPath_out.pptx";
            documentApi.ConvertPptToPath(name, destFilePath, format, options, password, storage, folder);
        }
        public static void SplitPpt()
        {
            string name = "splitPpt.pptx";
            ExportOptions options = null;
            string format = SlideExportFormat.Svg.ToString(); // JPEG PNG GIF BMP PPTX PPSX PPT PPS ODP PDF XPS PS PCL SVG
            int? width = 400;
            int? height = 300;
            int? from = 3;
            int? to = 6;
            string destFolder = "output";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = documentApi.SplitPpt(name, options, format, width, height, to, from, destFolder, password, storage, folder);
        }
        public static void SetPptSlideSize()
        {
            string name = "setPptSlideSize.pptx";
            string password = null;
            string storage = null;
            string folder = "input";
            int? width = 800;
            int? height = 600;
            string sizeType = null; //Available values : OnScreen, LetterPaper, A4Paper, Slide35mm, Overhead, Banner, Custom, Ledger, A3Paper, B4IsoPaper, B5IsoPaper, B4JisPaper, B5JisPaper, HagakiCard, OnScreen16x9, OnScreen16x10
            string scaleType = null; //Available values : DoNotScale, EnsureFit, Maximize; Default value : DoNotScale
            var response = documentApi.SetPptSlideSize(name, password, storage, folder, width, height, sizeType, scaleType);
        }
    }
}
