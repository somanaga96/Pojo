package csvReader;

import model.QuestionSetPropertyFields;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class GetQuotePriceReader {
    public static List<QuestionSetPropertyFields> read() throws IOException {
        List<QuestionSetPropertyFields> fields = new LinkedList<>();
        for (CSVRecord csvRecord : GetQuoteCSVData.recordIterable("./csv/QuestionSet.csv")) {
            fields.add(QuestionSetPropertyFields.builder()
                    .scenarioId(csvRecord.get("ScenarioId"))
                    .run(csvRecord.get("Run"))
                    .name(csvRecord.get("name"))
                    .admin(csvRecord.get("admin"))
                    .number(csvRecord.get("number"))
                    .build());
        }
        return fields;
    }
}
