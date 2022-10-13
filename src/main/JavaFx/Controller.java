
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label GeodiUrlText;

    @FXML
    private Label JsonBodyText;

    @FXML
    private TextArea jsonSummary;

    @FXML
    private TextArea jsonFacet;

    @FXML
    private TextArea jsonKeywords;

    @FXML
    private TextArea jsonQuery;

    @FXML
    private Label httpMethodText;

    @FXML
    private AnchorPane QueryService;

    @FXML
    private Label QueryText;

    @FXML
    private Label TokenText;

    @FXML
    private Label WorkSpaceText;

    @FXML
    private Label endIndexText;

    @FXML
    private Label startIndexText;

    @FXML
    private Tab getFacet;

    @FXML
    private Tab getKeywords;

    @FXML
    private Tab getQuery;

    @FXML
    private Tab getSummaries;

    @FXML
    private TextField geodiUrl;

    @FXML
    private TextField endIndex;

    @FXML
    private TextField startIndex;

    @FXML
    private TextField query;

    @FXML
    private TextField token;

    @FXML
    private TextField wsName;

    @FXML
    private Button run;

    @FXML
    private ChoiceBox<String> selectMethod;

    private String[] httpMethods = {"POST", "GET"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectMethod.getItems().addAll(httpMethods);
    }


    @FXML
    void request(ActionEvent event) throws IOException, InterruptedException, URISyntaxException {
        String geodiUrl = getGeodiUrl();
        String wsName = getWsName().replaceAll("\\s","+");
        String query = getQuery().replaceAll("\\s","+");
        String token = getToken();
        String startIndex = getStartIndex();
        String endIndex = getEndIndex();
        String responseBody;

        String requestMethod = selectMethod.getValue();

            if (getQuery.isSelected()) {
                if (requestMethod == "POST") {
                    responseBody = Query.postRequest(geodiUrl, wsName, token, query, startIndex, endIndex);
                } else {
                    responseBody = Query.getRequest(geodiUrl, wsName, token, query, startIndex, endIndex);
                }
                jsonQuery.setText(responseBody);
            } else if (getFacet.isSelected()) {
                if (requestMethod == "POST") {
                    responseBody = Query.postFacet(geodiUrl, wsName, token, query);
                } else {
                    responseBody = Query.getFacet(geodiUrl, wsName, token, query);
                }
                jsonFacet.setText(responseBody);
            } else if (getSummaries.isSelected()) {
                if (requestMethod == "POST") {
                    responseBody = Query.postSummary(geodiUrl, wsName, token, query, startIndex, endIndex);
                } else {
                    responseBody = Query.getSummary(geodiUrl, wsName, token, query, startIndex, endIndex);
                }
                jsonSummary.setText(responseBody);
            } else {
                if (requestMethod == "POST") {
                    responseBody = Query.postKeywords(geodiUrl, wsName, token, query, startIndex, endIndex);
                } else {
                    responseBody = Query.getKeywords(geodiUrl, wsName, token, query, startIndex, endIndex);
                }
                jsonKeywords.setText(responseBody);
            }
    }

    public String getGeodiUrl() {
        return geodiUrl.getText();
    }


    public String getQuery() {
        return query.getText();
    }


    public String getToken() {
        return token.getText();
    }


    public String getWsName() {
        return wsName.getText();
    }

    public String getEndIndex() {
        return endIndex.getText();
    }

    public String getStartIndex() {
        return startIndex.getText();
    }
}
