import spire.cloud.powerpoint.sdk.*;
import spire.cloud.powerpoint.sdk.api.NotesSlidesApi;
import spire.cloud.powerpoint.sdk.model.NotesSlide;

public class NotesSlidesApiDemo {
    static String appId = "your id";
    static String appKey = "your key";
    static String baseUrl = "https://api.e-iceblue.cn";
    static Configuration configuration = new Configuration(appId, appKey, baseUrl);
    static NotesSlidesApi notesSlidesApi = new NotesSlidesApi(configuration);

    public static void deleteNotesSlide() throws ApiException {
        String name = "template.pptx";
        Integer slideIndex = 0;
        String password = null;
        String storage = null;
        String folder = "input";
        NotesSlide response = notesSlidesApi.deleteNotesSlide(name, slideIndex, password, folder, storage);
    }

    public static void getNotesSlide() throws ApiException {
        String name = "template.pptx";
        Integer slideIndex = 0;
        String password = null;
        String storage = null;
        String folder = "input";
        NotesSlide response = notesSlidesApi.getNotesSlide(name, slideIndex, password, folder, storage);
    }

    public static void addNotesSlide() throws ApiException {
        String name = "template.pptx";
        Integer slideIndex = 0;
        String note = "This is note info";
        String password = null;
        String storage = null;
        String folder = "input";
        NotesSlide response = notesSlidesApi.addNotesSlide(name, slideIndex, note, password, folder, storage);
    }

    public static void setNotesSlide() throws ApiException {
        String name = "template.pptx";
        Integer slideIndex = 0;
        String note = "update note";
        String password = null;
        String storage = null;
        String folder = "input";
        NotesSlide response = notesSlidesApi.setNotesSlide(name, slideIndex, note, password, folder, storage);
    }
}
