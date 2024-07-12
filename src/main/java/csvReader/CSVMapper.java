package csvReader;

import model.QuestionSetPropertyFields;
public class CSVMapper {
    public static QuestionSetPropertyFields questionSetPropertyFields;


    public static void setQuestionSetPropertyFields(QuestionSetPropertyFields questionSetPropertyFields) {
        CSVMapper.questionSetPropertyFields = questionSetPropertyFields;
    }

    public static QuestionSetPropertyFields getQuestionSetPropertyFields() {
        return questionSetPropertyFields;
    }
}
