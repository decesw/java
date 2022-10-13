
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


/*
 * JSON Object created with GSON
 * each class has http-Methods as POST and GET
 */

public class Query {

    static Transcript transcript = new Transcript();
    static Gson gson = new Gson();
    static HttpClient client = HttpClient.newHttpClient();
    static String jsonRequest = gson.toJson(transcript);
    static Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
    static String bodyResponse;


    //Query
    public static String postRequest(String geodiUrl, String wsName, String token, String query,
                                     String startIndex, String endIndex) throws IOException, InterruptedException {
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create(geodiUrl + "/QueryHandler?op=Query&wsName=" + wsName + "&q=" +
                        query + "&startIndex=" + startIndex + "&endIndex="
                        + endIndex))
                .header("Authorization", "Bearer " + token)
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                .build();

        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        JsonElement je = JsonParser.parseString(postResponse.body());
        bodyResponse = gsonBuilder.toJson(je);

        return bodyResponse;
    }

    public static String getRequest(String geodiUrl, String wsName, String token, String query,
                                    String startIndex, String endIndex) throws IOException, InterruptedException, URISyntaxException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI(geodiUrl + "/QueryHandler?op=Query&wsName=" + wsName + "&q=" +
                        query + "&startIndex=" + startIndex + "&endIndex="
                        + endIndex))
                .header("Authorization", "Bearer " + token)
                .header("accept", "application/json")
                .GET()
                .build();

        HttpResponse <String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        JsonElement je = JsonParser.parseString(getResponse.body());
        bodyResponse = gsonBuilder.toJson(je);

        return bodyResponse;
    }


    //Get Summary
    public static String postSummary(String geodiUrl, String wsName, String token, String query,
                                     String startIndex, String endIndex) throws IOException, InterruptedException {
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create(geodiUrl + "/QueryHandler?op=GetSummaries&wsName=" + wsName + "&q=" +
                        query + "&startIndex=" + startIndex + "&endIndex=" + endIndex))
                .header("Authorization", "Bearer " + token)
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                .build();

        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        JsonElement je = JsonParser.parseString(postResponse.body());
        bodyResponse = gsonBuilder.toJson(je);

        return bodyResponse;
    }

    public static String getSummary(String geodiUrl, String wsName, String token, String query,
                                    String startIndex, String endIndex) throws IOException, InterruptedException, URISyntaxException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI(geodiUrl + "/QueryHandler?op=GetSummaries&wsName=" + wsName + "&q=" +
                        query + "&startIndex=" + startIndex + "&endIndex=" + endIndex))
                .header("Authorization", "Bearer " + token)
                .header("accept", "application/json")
                .GET()
                .build();

        HttpResponse <String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        JsonElement je = JsonParser.parseString(getResponse.body());
        bodyResponse = gsonBuilder.toJson(je);

        return bodyResponse;
    }

    //Get Facet
    public static String postFacet(String geodiUrl, String wsName, String token, String query) throws IOException, InterruptedException {
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create(geodiUrl + "/QueryHandler?op=GetFacet&wsName=" + wsName + "&q=" + query))
                .header("Authorization", "Bearer " + token)
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                .build();

        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        JsonElement je = JsonParser.parseString(postResponse.body());
        bodyResponse = gsonBuilder.toJson(je);

        return bodyResponse;
    }

    public static String getFacet(String geodiUrl, String wsName, String token, String query) throws IOException, InterruptedException, URISyntaxException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI(geodiUrl + "/QueryHandler?op=GetFacet&wsName=" + wsName + "&q=" + query))
                .header("Authorization", "Bearer " + token)
                .header("accept", "application/json")
                .GET()
                .build();

        HttpResponse <String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        JsonElement je = JsonParser.parseString(getResponse.body());
        bodyResponse = gsonBuilder.toJson(je);

        return bodyResponse;
    }

    //Get Keywords
    public static String postKeywords(String geodiUrl, String wsName, String token, String query,
                                      String startIndex, String endIndex) throws IOException, InterruptedException {
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create(geodiUrl + "/QueryHandler?op=GetKeywords&wsName=" + wsName + "&q=" +
                        query + "&startIndex=" + startIndex + "&endIndex="
                        + endIndex))
                .header("Authorization", "Bearer " + token)
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                .build();

        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        JsonElement je = JsonParser.parseString(postResponse.body());
        bodyResponse = gsonBuilder.toJson(je);

        return bodyResponse;
    }

    public static String getKeywords(String geodiUrl, String wsName, String token, String query,
                                     String startIndex, String endIndex) throws IOException, InterruptedException, URISyntaxException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI(geodiUrl + "/QueryHandler?op=GetKeywords&wsName=" + wsName + "&q=" +
                        query + "&startIndex=" + startIndex + "&endIndex="
                        + endIndex))
                .header("Authorization", "Bearer " + token)
                .header("accept", "application/json")
                .GET()
                .build();

        HttpResponse <String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        JsonElement je = JsonParser.parseString(getResponse.body());
        bodyResponse = gsonBuilder.toJson(je);

        return bodyResponse;
    }
}
