package api;

import com.example.generated.user.UserReponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import csvReader.CSVMapper;
import model.QuestionSetPropertyFields;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class GetMapping {
    public static void fetchAllUsersOld(String name) throws URISyntaxException, IOException, InterruptedException {
        QuestionSetPropertyFields fields = CSVMapper.getQuestionSetPropertyFields();
        // Get users from the API
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI("http://localhost:8080/getAllUsers")).build();
        // Print the details of the request
        System.out.println("Request Details:");
        System.out.println("URI: " + getRequest.uri());
        System.out.println("Method: " + getRequest.method());
        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
        String responseBody = getResponse.body();
        System.out.println("res:" + responseBody);

        // Convert the JSON response to a list of UserResponse objects
        ObjectMapper objectMapper = new ObjectMapper();
        List<UserReponse> userList = objectMapper.readValue(responseBody, new TypeReference<List<UserReponse>>() {
        });

        // Filter the list based on the given name
        List<UserReponse> filteredList = userList.stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

        // Convert the filtered list to XML with pretty formatting
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String xmlString = xmlMapper.writeValueAsString(filteredList);

        // Define the file path where you want to save the XML
        Path filePath = Paths.get("C:\\Users\\soman\\Workbench\\Serenit\\Pojo\\src\\main\\resources\\xml\\" + fields.getScenarioId() + ".xml");

        // Write the XML string to the file
        try (FileWriter writer = new FileWriter(filePath.toFile())) {
            writer.write(xmlString);
        }
        System.out.println("Filtered XML saved to: " + filePath);
    }
}
