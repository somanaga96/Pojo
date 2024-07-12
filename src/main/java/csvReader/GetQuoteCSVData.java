package csvReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GetQuoteCSVData {
    public static Iterable<CSVRecord> recordIterable(String filePath) throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath);
        if (inputStream == null) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
        return CSVFormat.DEFAULT.withFirstRecordAsHeader().withAllowMissingColumnNames(true).parse(new InputStreamReader(inputStream));
    }

}
