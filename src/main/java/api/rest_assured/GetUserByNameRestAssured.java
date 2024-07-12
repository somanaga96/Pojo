package api.rest_assured;

import com.example.generated.user.UserReponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import csvReader.CSVMapper;
import io.restassured.RestAssured;

import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.response.Response;
import maker.GetCSVDataMaker;
import model.QuestionSetPropertyFields;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GetUserByNameRestAssured extends GetCSVDataMaker {
    public static void fetchUserByName(Long name) throws IOException {
        QuestionSetPropertyFields fields = CSVMapper.getQuestionSetPropertyFields();
        RestAssured.baseURI = "http://localhost:8080/";
        String response = RestAssured.get("getUser/" + name).asString();
        ObjectMapper objectMapper = new ObjectMapper();
        UserReponse userList = objectMapper.readValue(response, new TypeReference<UserReponse>() {
        });

        System.out.println(objectMapper.writeValueAsString(userList));
        setUserReponse(userList);

        // Convert the filtered list to XML with pretty formatting
//        XmlMapper xmlMapper = new XmlMapper();
//        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
//        String xmlString = xmlMapper.writeValueAsString(userList);
//
//        // Define the file path where you want to save the XML
//        Path filePath = Paths.get("C:\\Users\\soman\\Workbench\\Serenit\\Pojo\\src\\main\\resources\\xml\\" + fields.getScenarioId() + ".xml");
//
//        // Write the XML string to the file
//        try (FileWriter writer = new FileWriter(filePath.toFile())) {
//            writer.write(xmlString);
//        }
//        System.out.println("Filtered XML saved to: " + filePath);
    }
}
