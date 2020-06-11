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
    class GeneralApiDemo
    {
        static String appId = "your id";
        static String appKey = "your key";
        static String baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey,baseUrl);
        static GeneralApi generalApi = new GeneralApi(configuration);
        public static void ConvertInRequest()
        {
            string format = ExportFormat.Ppt.ToString(); //PPTX PPSX PPT PPS ODP PDF XPS PS PCL
            string inputFilePath = "D:/inputFile/convertInRequest.pptx";
            System.IO.Stream document = new FileStream(inputFilePath, FileMode.Open);
            string password = null;
            var response = generalApi.ConvertInRequest(format, document, password);
            document.Close();
        }
        public static void ConvertInRequestToPath()
        {
            string format = ExportFormat.Pdf.ToString(); //PPTX PPSX PPT PPS ODP PDF XPS PS PCL
            string destFilePath = "output/convertInRequestToPath_out.pdf";
            string inputFilePath = "D:/inputFile/convertInRequestToPath.pptx";
            System.IO.Stream document = new FileStream(inputFilePath, FileMode.Open);
            string password = null;
            generalApi.ConvertInRequestToPath(format, destFilePath, document, password);
            document.Close();
        }
    }
}
