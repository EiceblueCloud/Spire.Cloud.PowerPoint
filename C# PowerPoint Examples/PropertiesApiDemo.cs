using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;
using Spire.Cloud.Powerpoint.Sdk.Model;

namespace CloudPowerpoint
{
    class PropertiesApiDemo
    {
        static String appId = "your id";
        static String appKey = "your key";
        static String baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(baseUrl, appId, appKey);
        static PropertiesApi propertiesApi = new PropertiesApi(configuration);
        public static void DeletePptDocumentProperties()
        {
            string name = "deletePptDocumentProperties.pptx";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = propertiesApi.DeletePptDocumentProperties(name, password, folder, storage);
        }
        public static void DeletePptDocumentProperty()
        {
            string name = "deletePptDocumentProperty.pptx";
            string propertyName = "Author";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = propertiesApi.DeletePptDocumentProperty(name, propertyName, password, folder, storage);
        }
        public static void GetPptDocumentProperties()
        {
            string name = "getPptDocumentProperties.pptx";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = propertiesApi.GetPptDocumentProperties(name, password, folder, storage);
        }
        public static void GetPptDocumentProperty()
        {
            string name = "getPptDocumentProperty.pptx";
            string propertyName = "Author";//Available values : Company, Format, LastSavedTime, Title
            string password = null;
            string folder = "input";
            string storage = null;
            var response = propertiesApi.GetPptDocumentProperty(name, propertyName, password, folder, storage);
        }
        public static void SetPptDocumentProperties()
        {
            string name = "setPptDocumentProperties.pptx";
            string password = null;
            string folder = "input";
            string storage = null;

            List<DocumentProperty> propertyList = new List<DocumentProperty>();
            DocumentProperty property1 = new DocumentProperty();
            property1.Name="Keywords";
            property1.Value="Set document properties.";
            property1.BuiltIn=false;
            propertyList.Add(property1);
            DocumentProperty property2 = new DocumentProperty();
            property2.Name = "Author";
            property2.Value = "eiceblue";
            property2.BuiltIn = false;
            propertyList.Add(property2);
            DocumentProperty property3 = new DocumentProperty();
            property3.Name = "Company";
            property3.Value = "冰蓝";
            property3.BuiltIn = false;
            propertyList.Add(property3);
            DocumentProperty property4 = new DocumentProperty();
            property4.Name = "LastSavedBy";
            property4.Value = "123456@iCloud.com";
            property4.BuiltIn = false;
            propertyList.Add(property4);
            DocumentProperty property5 = new DocumentProperty();
            property5.Name = "SharedDoc";
            property5.Value = "true";
            property5.BuiltIn = false;
            propertyList.Add(property5);
            DocumentProperties properties = new DocumentProperties(propertyList);

            var response = propertiesApi.SetPptDocumentProperties(name, properties, password, folder, storage);
        }
        public static void SetPptDocumentProperty()
        {
            string name = "setPptDocumentProperty.pptx";
            string propertyName = "Keywords";
            DocumentProperty property = new DocumentProperty("Keywords", "E-iceblue", false);
            string password = null;
            string folder = "input";
            string storage = null;
            var response = propertiesApi.SetPptDocumentProperty(name, propertyName, property, password, folder, storage);
        }
    }
}
