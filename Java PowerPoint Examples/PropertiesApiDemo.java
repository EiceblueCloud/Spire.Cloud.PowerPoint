import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.PropertiesApi;
import spire.cloud.powerpoint.sdk.model.*;

public class PropertiesApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey,baseUrl);
    static PropertiesApi propertiesApi = new PropertiesApi(configuration);

    public static void deletePptDocumentProperties() throws ApiException {
        String name = "deletePptDocumentProperties.pptx";
        String password = null;
        String folder = "input";
        String storage = null;
        DocumentProperties response = propertiesApi.deletePptDocumentProperties(name, password, folder, storage);
    }
    public static void deletePptDocumentProperty() throws ApiException {
        String name = "deletePptDocumentProperty.pptx";
        String propertyName = "Author";
        String password = null;
        String folder = "input";
        String storage = null;
        DocumentProperties response = propertiesApi.deletePptDocumentProperty(name, propertyName, password, folder, storage);
    }
    public static void getPptDocumentProperties() throws ApiException {
        String name = "getPptDocumentProperties.pptx";
        String password = null;
        String folder = "input";
        String storage = null;
        DocumentProperties response = propertiesApi.getPptDocumentProperties(name, password, folder, storage);
    }
    public static void getPptDocumentProperty() throws ApiException {
        String name = "getPptDocumentProperty.pptx";
        String propertyName = "Author";//Available values : Company, Format, LastSavedTime, Title
        String password = null;
        String folder = "input";
        String storage = null;
        DocumentProperty response = propertiesApi.getPptDocumentProperty(name, propertyName, password, folder, storage);
    }
    public static void setPptDocumentProperties() throws ApiException {
        String name = "setPptDocumentProperties.pptx";
        String password = null;
        String folder = "input";
        String storage = null;

        java.util.ArrayList<DocumentProperty> propertyList = new java.util.ArrayList<>();
        DocumentProperty property1 = new DocumentProperty();
        property1.setName("Keywords");
        property1.setValue("Set document properties.");
        property1.setBuiltIn(false);
        propertyList.add(property1);
        DocumentProperty property2 = new DocumentProperty();
        property2.setName( "Author");
        property2.setValue("eiceblue");
        property2.setBuiltIn(false);
        propertyList.add(property2);
        DocumentProperty property3 = new DocumentProperty();
        property3.setName("Company");
        property3.setValue("iceblue");
        property3.setBuiltIn(false);
        propertyList.add(property3);
        DocumentProperty property4 = new DocumentProperty();
        property4.setName("LastSavedBy");
        property4.setValue("123456@iCloud.com");
        property4.setBuiltIn(false);
        propertyList.add(property4);
        DocumentProperty property5 = new DocumentProperty();
        property5.setName("SharedDoc");
        property5.setValue("true");
        property5.setBuiltIn(false);
        propertyList.add(property5);
        DocumentProperties properties = new DocumentProperties();
        properties.list(propertyList);
        DocumentProperties response = propertiesApi.setPptDocumentProperties(name, properties, password, folder, storage);
    }
    public static void setPptDocumentProperty() throws ApiException {
        String name = "setPptDocumentProperty.pptx";
        String propertyName = "Keywords";
        DocumentProperty property = new DocumentProperty();
        property.setName("Keywords");
        property.setValue("SetPptDocumentProperty_pptx");
        property.setBuiltIn(false);
        String password = null;
        String folder = "input";
        String storage = null;
        DocumentProperty response = propertiesApi.setPptDocumentProperty(name, propertyName, property, password, folder, storage);
    }
}
