package api;

import com.google.gson.Gson;
import model.QuestionSetPropertyFields;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PostMapping {
    public static String addUser(QuestionSetPropertyFields userRequest) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(userRequest);
        System.out.println("json request:" + jsonRequest);
        HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI("http://localhost:8080/saveUser"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest)).build();
        // Print the details of the GET request
        System.out.println("Request Details:");
        System.out.println("URI: " + postRequest.uri());
        System.out.println("Method: " + postRequest.method());

        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("Post response :" + postResponse.body());
//UserRes
        return jsonRequest;
    }
}
