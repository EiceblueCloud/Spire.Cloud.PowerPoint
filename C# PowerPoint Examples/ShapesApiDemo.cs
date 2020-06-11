using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;
using Spire.Cloud.Powerpoint.Sdk.Model;
using System;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using static Spire.Cloud.Powerpoint.Sdk.Model.ShapeBase;

namespace CloudPowerpoint
{
    class ShapesApiDemo
    {
        static String appId = "your id";
        static String appKey = "your key";
        static String baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(baseUrl, appId, appKey);
        static ShapesApi shapesApi = new ShapesApi(configuration);
        public static void DeleteSlideParagraph()
        {
            string name = "deleteSlideParagraph.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? paragraphIndex = 0;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.DeleteSlideParagraph(name, slideIndex, shapeIndex, paragraphIndex, password, folder, storage);
        }
        public static void DeleteSlideParagraphs()
        {
            string name = "deleteSlideParagraphs.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string paragraphs = "[0,1]";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.DeleteSlideParagraphs(name, slideIndex, shapeIndex, paragraphs, password, folder, storage);
        }
        public static void DeleteSlideShape()
        {
            string name = "deleteSlideShape.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.DeleteSlideShape(name, slideIndex, shapeIndex, password, folder, storage);
        }
        public static void DeleteSlideShapes()
        {
            string name = "deleteSlideShapes.pptx";
            int? slideIndex = 0;
            string shapes = "[0,1]";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.DeleteSlideShapes(name, slideIndex, shapes, password, folder, storage);
        }
        public static void DeleteSlideTextRanges()
        {
            string name = "deleteSlideTextRanges.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? paragraphIndex = 0;
            string portions = "[0,1]";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.DeleteSlideTextRanges(name, slideIndex, shapeIndex, paragraphIndex, portions, password, folder, storage);
        }
        public static void DeleteSlideTextRange()
        {
            string name = "deleteSlideTextRange.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? paragraphIndex = 0;
            int portionIndex = 0;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.DeleteSlideTextRange(name, slideIndex, shapeIndex, paragraphIndex, portionIndex, password, folder, storage);
        }
        public static void GetSlideShape()
        {
            string name = "getSlideShape.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.GetSlideShape(name, slideIndex, shapeIndex, password, folder, storage);
        }
        public static void GetSlideShapeParagraph()
        {
            string name = "getSlideShapeParagraph.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? paragraphIndex = 0;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.GetSlideShapeParagraph(name, slideIndex, shapeIndex, paragraphIndex, password, folder, storage);
        }
        public static void GetSlideShapeParagraphs()
        {
            string name = "getSlideShapeParagraphs.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.GetSlideShapeParagraphs(name, slideIndex, shapeIndex, password, folder, storage);
        }
        public static void GetSlideShapeTextRange()
        {
            string name = "getSlideShapeTextRange.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? paragraphIndex = 0;
            int? portionIndex = 0;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.GetSlideShapeTextRange(name, slideIndex, shapeIndex, paragraphIndex, portionIndex, password, folder, storage);
        }
        public static void GetSlideShapeTextRanges()
        {
            string name = "getSlideShapeTextRanges.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? paragraphIndex = 0;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.GetSlideShapeTextRanges(name, slideIndex, shapeIndex, paragraphIndex, password, folder, storage);
        }
        public static void GetSlideShapes()
        {
            string name = "getSlideShapes.pptx";
            int? slideIndex = 0;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.GetSlideShapes(name, slideIndex, password, folder, storage);
        }
        public static void AddNewShape()
        {
            string name = "addNewShape.pptx";
            int? slideIndex = 0;
            string password = null;
            string storage = null;
            string folder = "input";
            ShapeBase source = new ShapeBase();
            source.Name = "ShapeName";
            source.ShapeType = ShapeTypeEnum.Bevel.ToString();
            source.X = 50;
            source.Y = 50;
            source.Height = 100;
            source.Width = 200;
            source.AlternativeText = "AlternativeText";
            source.AlternativeTextTitle = "AlternativeTextTitle";
            source.Hidden = false;
            //picture
            string fileName = "input/image.jpg";
            ResourceUriElement image = new ResourceUriElement(new ResourceUri(fileName));
            source.FillFormat = new PictureFill(0, 0, 0, 0, 96, image, null, null, "Stretch");
            source.ZOrderPosition = 0;
            source.Type = "ShapeBase";

            ArrowHeadProperties begainArrowHead = new ArrowHeadProperties("Short", "TriangleArrowHead", "Narrow");
            ArrowHeadProperties endArrowHead = new ArrowHeadProperties("Short", "TriangleArrowHead", "Narrow");

            source.LineFormat = new LineFormat("Center", "Round", "Dot", "Bevel", "ThinThin",
                begainArrowHead, endArrowHead, null, new SolidFill("red"), 1, 4);

            int? shapeToClone = null;
            int? position = null;

            var response = shapesApi.AddNewShape(name, slideIndex, source, password, folder, storage, shapeToClone, position);
        }
        public static void AddSlideNewParagraph()
        {
            string name = "addSlideNewParagraph.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            Paragraph source = new Paragraph();
            source.EastAsianLineBreak = false;
            source.Alignment = "Center";
            source.TextAlignment = "Center";
            source.Indent = 2;
            source.MarginLeft = 1;
            source.MarginRight = 5;
            source.SpaceAfter = 1;
            source.SpaceBefore = 5;
            string password = null;
            string storage = null;
            string folder = "input";
            int? position = null;
            var response = shapesApi.AddSlideNewParagraph(name, slideIndex, shapeIndex, source, password, folder, storage, position);
        }
        public static void AddSlideNewTextRange()
        {
            string name = "addSlideNewTextRange.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? paragraphIndex = 0;
            Portion source = new Portion();
            source.Text = "add new text";
            source.FontColor = "blue";
            source.Spacing = 5;
            source.FontBold = true;
            string password = null;
            string storage = null;
            int? position = null;
            string folder = "input";
            var response = shapesApi.AddSlideNewTextRange(name, slideIndex, shapeIndex, paragraphIndex, source, password, folder, storage, position);
        }
        public static void SetParagraphTextRangeProperties()
        {
            string name = "shapes.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? paragraphIndex = 0;
            int? portionIndex = 0;
            Portion source = new Portion();
            source.Text = "SetParagraphTextRangeProperties";
            source.FontHeight = 20;
            string password = null;
            string storage = null;
            string folder = "input";
            source.Spacing = 1;
            source.FontColor = "blue";
            var response = shapesApi.SetParagraphTextRangeProperties(name, slideIndex, shapeIndex, paragraphIndex, portionIndex, source, password, folder, storage);
        }
        public static void SaveShapeAs()
        {
            string name = "saveShapeAs.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string format = "png";
            string destFilePath = "output/saveShapeAs_out.png";
            string password = null;
            string storage = null;
            double? scaleX = 1.0;
            double? scaleY = 1.0;
            int? bounds = null;
            string fontsFolder = null;
            string folder = "input";
            shapesApi.SaveShapeAs(name, slideIndex, shapeIndex, format, destFilePath, password, folder, storage, scaleX, scaleY, bounds, fontsFolder);
        }
        public static void SetSlideShapeInfo()
        {
            string name = "setSlideShapeInfo.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            ShapeBase source = new ShapeBase();
            source.ShapeType = "Rectangle";
            source.X = 50;
            source.Y = 50;
            source.Height = 400;
            source.Width = 600;
            source.AlternativeText = "AlternativeText";
            source.FillFormat = new SolidFill("Red");
            source.ZOrderPosition = 0;
            source.Type = "ShapeBase";
            source.LineFormat = null;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.SetSlideShapeInfo(name, slideIndex, shapeIndex, source, password, folder, storage);
        }
        public static void SetSlideShapeParagraph()
        {
            string name = "setSlideShapeParagraph.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? paragraphIndex = 0;
            Paragraph source = new Paragraph();
            source.TextAlignment = "Top";
            source.Alignment = "Right";
            source.MarginLeft = 50;
            string password = null;
            string storage = null;
            string folder = "input";
            var response = shapesApi.SetSlideShapeParagraph(name, slideIndex, shapeIndex, paragraphIndex, source, password, folder, storage);
        }
    }
}
