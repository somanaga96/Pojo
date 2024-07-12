package api.rest_assured;

import com.example.generated.user.UserReponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

public class GetAllUserWithRestAssured {

    public static void fetchAllUsers() throws JsonProcessingException {
        RestAssured.baseURI = "http://localhost:8080/";
        Response response = RestAssured.get("getAllUsers");
        String responseBody = response.getBody().asString();

        // Assuming UserResponse is a class that can handle the response JSON structure
        ObjectMapper objectMapper = new ObjectMapper();
        List<UserReponse> userList = objectMapper.readValue(responseBody, new TypeReference<List<UserReponse>>() {
        });

        System.out.println(objectMapper.writeValueAsString(userList));

    }
}
