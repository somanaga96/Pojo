package api.rest_assured;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.QuestionSetPropertyFields;

import static io.restassured.RestAssured.given;

public class PostUserWithRestAssured {
    public static void postUser(QuestionSetPropertyFields userRequest) {
        RestAssured.baseURI = "http://localhost:8080/";
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(userRequest);
        System.out.println("Json request" + jsonRequest);
        Response response = given()
                .header("Content-Type", "application/json")
                .body(jsonRequest).when()
                .log().all().post("saveUser");
        System.out.println("Response body: " + response.getBody().asString());
    }
}
