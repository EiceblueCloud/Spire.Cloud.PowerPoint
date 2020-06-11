using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;
using Spire.Cloud.Powerpoint.Sdk.Model;
using System.IO;

namespace CloudPowerpoint
{
    class SlidesApiDemo
    {
        static string appId = "your id";
        static string appKey = "your key";
        static string baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey,baseUrl);
        static SlidesApi slidesApi = new SlidesApi(configuration);
        public static void DeleteSlideByIndex()
        {
            string name = "template.pptx";
            int? slideIndex = 3;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.DeleteSlideByIndex(name, slideIndex, password, folder, storage);
        }
        public static void DeleteSlidesList()
        {
            string name = "template.pptx";
            string slides = "0,2,4";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.DeleteSlidesList(name, slides, password, folder, storage);
        }
        public static void GetSlide()
        {
            string name = "template.pptx";
            int? slideIndex = 2;
            string password = "test";
            string folder = "input";
            string storage = null;
            var response = slidesApi.GetSlide(name, slideIndex, password, folder, storage);
        }
        public static void GetSlidesList()
        {
            string name = "template.pptx";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.GetSlidesList(name, password, folder, storage);
        }
        public static void AddSlide()
        {
            string name = "template.pptx";
            int? position = 2;
            string password = null;
            string folder = "input";
            string storage = null;
            string layoutAlias = "TwoTextAndTwoObjects";//TitleOnly TwoTextAndTwoObjects Title TextAndObject Blank
            var response = slidesApi.AddSlide(name, position, password, folder, storage, layoutAlias);
        }
        public static void CopySlide()
        {
            string name = "template.pptx";
            int? slideToCopy = 2;
            int? position = 3;
            string source = "input/test_shapes.pptx";
            string sourcePassword = null;
            string sourceStorage = null;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.CopySlide(name, slideToCopy, position, source, sourcePassword, sourceStorage, password, folder, storage);
        }
        public static void MoveSlide()
        {
            string name = "template.pptx";
            int? slideIndex = 1;//the first value is 0
            int? newPosition = 3;//the first value is 0
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.MoveSlide(name, slideIndex, newPosition, password, folder, storage);
        }   
        public static void ReorderManySlide()
        {
            string name = "template.pptx";
            string oldPositions = "5,1,0";
            string newPositions = "0,2,3";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.ReorderManySlide(name, oldPositions, newPositions, password, folder, storage);
        }     
        public static void SetSlide()
        {
            string name = "template.pptx";
            int? slideIndex = 2;
            string password = null;
            string folder = "input";
            string storage = null;
            Slide slideDto = slidesApi.GetSlide(name, slideIndex, password, folder, storage);
            ResourceUriElement uriElement = new ResourceUriElement();
            uriElement.Uri = new ResourceUri("TitleOnly");
            slideDto.AlternateLinks = null;
            slideDto.LayoutSlide = uriElement;
            slideDto.ShowMasterShapes = !slideDto.ShowMasterShapes;
            var response = slidesApi.SetSlide(name, slideIndex, slideDto, password, folder, storage);
        }       
        public static void DeleteSlideComment()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            int? commentIndex = 0;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.DeleteSlideComment(name, slideIndex, commentIndex, password, folder, storage);
        }
        public static void DeleteSlideComments()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.DeleteSlideComments(name, slideIndex, password, folder, storage);
        }
        public static void DeleteSlideBackground()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.DeleteSlideBackground(name, slideIndex, password, folder, storage);
        }
        public static void GetSlideComments()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.GetSlideComments(name, slideIndex, password, folder, storage);
        }
        public static void GetSlideBackground()
        {
            string name = "template.pptx";
            int? slideIndex = 4;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.GetSlideBackground(name, slideIndex, password, folder, storage);
        }
        public static void SetSlideBackgroundColor()
        {
            string name = "template.pptx";
            int? slideIndex = 4;
            string color = "#FFB6C1";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SetSlideBackgroundColor(name, slideIndex, color, folder, password, storage);
        }
        public static void SetSlideBackground()
        {
            string name = "template.pptx";
            int? slideIndex = 0;

            //solid
            //SlideBackground source = new SlideBackground("custom");
            //source.Type = "SolidFill";
            //source.FillFormat = new SolidFill("SolidFill", "red");

            //gradient
            //List<GradientFillStop> stops = new List<GradientFillStop>();
            //GradientFillStop stop1 = new GradientFillStop("red", 0);
            //GradientFillStop stop2 = new GradientFillStop("blue", 1);
            //stops.Add(stop1);
            //stops.Add(stop2);
            //GradientFill g = new GradientFill("FromCorner1", "Linear", stops, 30, false, "Horizontal");
            //source.FillFormat = g;

            //picture
            SlideBackground source = new SlideBackground("custom");
            string fileName = "image.jpg";
            ResourceUriElement image = new ResourceUriElement(new ResourceUri(fileName));
            source.FillFormat = new PictureFill(0, 0, 0, 0, 96, image, null, null, "Stretch");
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SetSlideBackground(name, slideIndex, source, folder, password, storage);
        }
        public static void SaveSlideAsPdf()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Pdf.ToString();
            ExportOptions options = new ExportOptions();
            options["company"] = "e-iceblue";
            options["product"] = "spire.presentation";
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPpt()
        {
            string name = "template.pptx";
            int? slideIndex = 3;
            string format = SlideExportFormat.Ppt.ToString();
            ExportOptions options = new ExportOptions();
            options["company"] = "e-iceblue";
            options["product"] = "spire.presentation";
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPptx()
        {
            string name = "template.ppt";
            int? slideIndex = 3;
            string format = SlideExportFormat.Pptx.ToString();
            ExportOptions options = new ExportOptions();
            options["company"] = "e-iceblue";
            options["product"] = "spire.presentation";
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPng()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Png.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsBmp()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Bmp.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsJpeg()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Jpeg.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsGif()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Gif.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsOdp()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Odp.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPcl()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Pcl.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPps()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Pps.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPpsx()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Ppsx.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPs()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Ps.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsSvg()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Svg.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsXps()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Xps.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = slidesApi.SaveSlideAs(name, slideIndex, format, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPdfPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Pdf.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.pdf";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsXpsPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Xps.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.xps";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPclPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Pcl.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.pcl";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPpsPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Pps.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.pps";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPpsxPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Ppsx.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.ppsx";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPsPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Ps.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.ps";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsSvgPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Svg.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.svg";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsOdpPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Odp.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.odp";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPptPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Ppt.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.ppt";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPptxPath()
        {
            string name = "template.ppt";
            int? slideIndex = 1;
            string format = SlideExportFormat.Pptx.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.pptx";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsPngPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Png.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.png";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsBmpPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Bmp.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.bmp";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsJpegPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Jpeg.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.ipeg";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
        public static void SaveSlideAsGifPath()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            string format = SlideExportFormat.Gif.ToString();
            ExportOptions options = null;
            int? width = 400;
            int? height = 300;
            string password = null;
            string folder = "input";
            string storage = null;
            string destFilePath = "output/output.gif";
            slidesApi.SaveSlideAsToPath(name, slideIndex, format, destFilePath, options, width, height, password, folder, storage);
        }
    }
}
