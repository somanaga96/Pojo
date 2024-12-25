//package runner.demo;
//
//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import org.junit.Assert;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Solution {
//    public static void main(String[] args) {
//        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Book?ISBN=9781449325862";
//        RequestSpecification httpRequest = RestAssured.given().pa
//
//        // First get the JsonPath object instance from the Response interface
//        JsonPath jsonPathEvaluator = response.jsonPath();
//
//        // Then simply query the JsonPath object to get a String value of the node
//        // specified by JsonPath: City (Note: You should not put $. in the Java code)
//        String city = jsonPathEvaluator.get("City");
//
//        // Let us print the city variable to see what we got
//        System.out.println("City received from Response " + city);
//
//        // Validate the response
//        Assert.assertEquals(city, "Hyderabad", "Correct city name received in the Response");
//
//    }
//}