import csvReader.CSVMapper;
import csvReader.GetQuotePriceReader;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import model.QuestionSetPropertyFields;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.io.IOException;
import java.util.List;

import static api.PostMapping.addUser;
import static api.rest_assured.GetAllUserWithRestAssured.fetchAllUsers;
import static api.rest_assured.GetUserByNameRestAssured.fetchUserByName;

@Execution(ExecutionMode.CONCURRENT)
public class RadarAssert extends CSVMapper {
    @BeforeEach
    public void beforeMethod() {
        // Enable logging for all requests and responses
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        System.out.println("Before method");
    }

    @Test
    public void getCSVData() throws IOException {
        List<QuestionSetPropertyFields> mapper = GetQuotePriceReader.read();
        System.out.println("mapper:" + mapper);
        mapper.forEach(fields -> {
            CSVMapper.setQuestionSetPropertyFields(fields.toBuilder().build());
            if (fields.getRun().equalsIgnoreCase("Yes")) {
//                postUser(getQuestionSetPropertyFields());
                try {
//                    addUser(getQuestionSetPropertyFields());
//                    fetchAllUsers(fields.getName());
                    fetchAllUsers();
                    fetchUserByName(41L);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
//        System.out.println("mapper:" + new ObjectMapper().writeValueAsString(mapper));
    }

    @AfterEach
    public void afterMethod() {
        System.out.println("after method");
    }
}
