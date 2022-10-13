/*
 * Transcript class has the attributes to create Json request with Gson
 */

public class Transcript {

    private String geodiURL;
    public static String wsName;
    public static int startIndex;
    public static int endIndex;
    public static String search;

    public int ContentID;
    public String Content;
    public String DisplayName;
    public String ContentType;
    public Boolean HasViewer;
    public Boolean DisableDownload;
    public Boolean HasNote;
    public int SummaryID;
    public String Text;
    public Boolean FolderCanBeShown;
    public String PDisplayName;
    public int PId;
    public String PcontentType;
    public int NumberOfOccurences;

    public int getContentID() {
        return ContentID;
    }

    public void setContentID(int contentID) {
        ContentID = contentID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public String getContentType() {
        return ContentType;
    }

    public void setContentType(String contentType) {
        ContentType = contentType;
    }

    public Boolean getHasViewer() {
        return HasViewer;
    }

    public void setHasViewer(Boolean hasViewer) {
        HasViewer = hasViewer;
    }

    public Boolean getDisableDownload() {
        return DisableDownload;
    }

    public void setDisableDownload(Boolean disableDownload) {
        DisableDownload = disableDownload;
    }

    public Boolean getHasNote() {
        return HasNote;
    }

    public void setHasNote(Boolean hasNote) {
        HasNote = hasNote;
    }

    public int getSummaryID() {
        return SummaryID;
    }

    public void setSummaryID(int summaryID) {
        SummaryID = summaryID;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public Boolean getFolderCanBeShown() {
        return FolderCanBeShown;
    }

    public void setFolderCanBeShown(Boolean folderCanBeShown) {
        FolderCanBeShown = folderCanBeShown;
    }

    public String getPDisplayName() {
        return PDisplayName;
    }

    public void setPDisplayName(String PDisplayName) {
        this.PDisplayName = PDisplayName;
    }

    public int getPId() {
        return PId;
    }

    public void setPId(int PId) {
        this.PId = PId;
    }

    public String getPcontentType() {
        return PcontentType;
    }

    public void setPcontentType(String pcontentType) {
        PcontentType = pcontentType;
    }

    public int getNumberOfOccurences() {
        return NumberOfOccurences;
    }

    public void setNumberOfOccurences(int numberOfOccurences) {
        NumberOfOccurences = numberOfOccurences;
    }

    public static String getWsName() {
        return wsName;
    }

    public static void setWsName(String wsName) {
        Transcript.wsName = wsName;
    }

    public static int getStartIndex() {
        return startIndex;
    }

    public static void setStartIndex(int startIndex) {
        Transcript.startIndex = startIndex;
    }

    public static int getEndIndex() {
        return endIndex;
    }

    public static void setEndIndex(int endIndex) {
        Transcript.endIndex = endIndex;
    }

    public static String getSearch() {
        return search;
    }

    public static void setSearch(String search) {
        Transcript.search = search;
    }

    public String getGeodiURL() {
        return geodiURL;
    }

    public void setGeodiURL(String geodiURL) {
        this.geodiURL = geodiURL;
    }
}
