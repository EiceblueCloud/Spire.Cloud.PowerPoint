using Spire.Cloud.Powerpoint.Sdk.Client;
using Spire.Cloud.Powerpoint.Sdk.Api;
using Spire.Cloud.Powerpoint.Sdk.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace CloudPowerpoint
{
    class MasterSlidesApiDemo
    {
        static String appId = "your id";
        static String appKey = "your key";
        static String baseUrl = "https://api.e-iceblue.cn";
        static Configuration configuration = new Configuration(appId, appKey,baseUrl);
        static MasterSlidesApi masterSlidesApi = new MasterSlidesApi(configuration);
        public static void GetMasterSlide()
        {
            string name = "getMasterSlide.pptx";
            string password = null;
            int? slideIndex = 0;
            string storage = null;
            string folder = "input";
            var response = masterSlidesApi.GetMasterSlide(name, slideIndex, password, folder, storage);
        }
        public static void GetMasterSlidesList()
        {
            string name = "getMasterSlidesList.pptx";
            string password = null;
            string folder = "input";
            string storage = null;
            var response = masterSlidesApi.GetMasterSlidesList(name, password, folder, storage);
        }
        public static void CopyMasterSlideFrom()
        {
            string name = "copyMasterSlideFrom.pptx";
            string source = "source/masterSource.pptx";
            int? masterIndex = 0;
            string password = null;
            string cloneFromPassword = null;
            string cloneFromStorage = null;
            bool? applyToAll = null;
            string newFolder = "masterslides";
            string storage = null;
            var response = masterSlidesApi.CopyMasterSlideFrom(name, source, masterIndex, cloneFromPassword, cloneFromStorage, applyToAll, password, newFolder, storage);
        }
    }
}
