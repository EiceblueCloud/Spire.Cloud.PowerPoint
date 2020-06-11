using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;
using Spire.Cloud.Powerpoint.Sdk.Model;

namespace CloudPowerpoint
{
    class TableApiDemo
    {
        static string appId = "your id";
        static string appKey = "your key";
        static string baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey, baseUrl);
        static TableApi tableApi = new TableApi(configuration);
        public static void DeleteSlideTable()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string password = null;
            string folder = "input";
            string storage = null;        
            tableApi.DeleteSlideTable(name, slideIndex, shapeIndex, password, folder, storage);
        }
        public static void GetSlideTable()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string password = null;
            string folder = "input";
            string storage = null;        
            var response = tableApi.GetSlideTable(name, slideIndex, shapeIndex, password, folder, storage);
        }
        public static void AddSlideTable()
        {
            string name = "template.pptx";
            int? slideIndex = 1;
            double? x = 0;
            double? y = 0;
            string heights = "[50,50,50,50]";
            string widths = "[150,150,150,150]";
            string tableData = "[" +
                "[11,12,13,14]," +
                "[21,22,23,24]," +
                "[31,32,33,34]," +
                "[41,42,43,44]" +
                "]";
            string password = null;
            string folder = "input";
            string storage = null;      
            var response = tableApi.AddSlideTable(name, slideIndex, x, y, heights, widths, tableData, password, folder, storage);
        }

        public static void SetSlideTableCellFormat()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";

            TableCell source = new TableCell("", 1, 1, 3.6, 3.6, 3.6, 3.6, "Center", "Horizontal");
            source.BorderLeft = null;
            source.BorderRight = null;
            source.BorderTop = null;
            source.FillFormat = new SolidFill("red");
            source.BorderDiagonalDown = null;
            source.BorderDiagonalUp = null;
            string password = null;
            string folder = "input";
            string storage = null;         
            var response = tableApi.SetSlideTableCellFormat(name, slideIndex, shapeIndex, source, password, folder, storage);
        }
        public static void MergeSlideTableCell()
        {        
            string name = "template.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string path = "[[1,2],[2,3]]";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = tableApi.MergeSlideTableCell(name, slideIndex, shapeIndex, path, password, folder, storage);
        }
        public static void SplitSlideTableCell()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string path = "[[1,2],[2,3]]";
            string password = null;
            string folder = "input";
            string storage = null;       
            var response = tableApi.SplitSlideTableCell(name, slideIndex, shapeIndex, path, password, folder, storage);
        }
        public static void SetSlideTableCellTextFormat()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            string path = "[0,0]";
            Portion source = new Portion();
            source.Text = "12345678";
            string password = null;
            string folder = "input";
            string storage = null;           
            var response = tableApi.SetSlideTableCellTextFormat(name, slideIndex, shapeIndex, path, password, source, folder, storage);
        }
        public static void SetSlideTableColumnWidth()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? columnIndex = 0;
            double? width = 200;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = tableApi.SetSlideTableColumnWidth(name, slideIndex, shapeIndex, columnIndex, width, password, folder, storage);
        }
        public static void SetSlideTableRowHeight()
        {
            string name = "template.pptx";
            int? slideIndex = 0;
            string shapeIndex = "0";
            int? rowIndex = 0;
            double? height = 70;
            string password = null;
            string folder = "input";
            string storage = null;
            var response = tableApi.SetSlideTableRowHeight(name, slideIndex, shapeIndex, rowIndex, height, password, folder, storage);
        }
    }
}
