import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.TableApi;
import spire.cloud.powerpoint.sdk.model.*;

public class TableApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey,baseUrl);
    static TableApi tableApi = new TableApi(configuration);

    public static void deleteSlideTable() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String password = null;
        String folder = "input";
        String storage = null;
        tableApi.deleteSlideTable(name, slideIndex, shapeIndex, password, folder, storage);
    }
    public static void getSlideTable() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String password = null;
        String folder = "input";
        String storage = null;
        Table response = tableApi.getSlideTable(name, slideIndex, shapeIndex, password, folder, storage);
    }
    public static void addSlideTable() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 1;
        double x = 0;
        double y = 0;
        String heights = "[50,50,50,50]";
        String widths = "[150,150,150,150]";
        String tableData = "[" +
                "[11,12,13,14]," +
                "[21,22,23,24]," +
                "[31,32,33,34]," +
                "[41,42,43,44]" +
                "]";
        String password = null;
        String folder = "input";
        String storage = null;
        Table response = tableApi.addSlideTable(name, slideIndex, x, y, heights, widths, tableData, password, folder, storage);
    }

    public static void setSlideTableCellFormat() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        TableCell source = new TableCell();
        source.setText("");
        source.setRowSpan(1);
        source.setColSpan(1);
        source.setMarginTop(1d);
        source.setMarginRight(1d);
        source.setMarginLeft(3.6d);
        source.setMarginBottom(3.6d);
        source.setTextAnchorType("Center");
        source.setTextVerticalType("Horizontal");
        source.setFillFormat(new SolidFill("lightpink"));
        source.setBorderDiagonalDown(null);
        source.setBorderDiagonalUp(null);
        String password = null;
        String folder = "input";
        String storage = null;
        Table response = tableApi.setSlideTableCellFormat(name, slideIndex, shapeIndex, source, password, folder, storage);
    }
    public static void mergeSlideTableCell() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String path = "[[1,2],[2,3]]";
        String password = null;
        String folder = "input";
        String storage = null;
        Table response = tableApi.mergeSlideTableCell(name, slideIndex, shapeIndex, path, password, folder, storage);
    }
    public static void splitSlideTableCell() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String path = "[[1,2],[2,3]]";
        String password = null;
        String folder = "input";
        String storage = null;
        Table response = tableApi.splitSlideTableCell(name, slideIndex, shapeIndex, path, password, folder, storage);
    }
    public static void setSlideTableCellTextFormat() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        String path = "[0,0]";
        Portion source = new Portion();
        source.setText("12345678");
        String password = null;
        String folder = "input";
        String storage = null;
        Table response = tableApi.setSlideTableCellTextFormat(name, slideIndex, shapeIndex, path, password, source, folder, storage);
    }
    public static void setSlideTableColumnWidth() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  columnIndex = 0;
        double width = 200;
        String password = null;
        String folder = "input";
        String storage = null;
        Table response = tableApi.setSlideTableColumnWidth(name, slideIndex, shapeIndex, columnIndex, width, password, folder, storage);
    }
    public static void setSlideTableRowHeight() throws ApiException {
        String name = "template.pptx";
        Integer  slideIndex = 0;
        String shapeIndex = "0";
        Integer  rowIndex = 0;
        double height = 70;
        String password = null;
        String folder = "input";
        String storage = null;
        Table response = tableApi.setSlideTableRowHeight(name, slideIndex, shapeIndex, rowIndex, height, password, folder, storage);
    }
}
