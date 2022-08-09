import java.util.List;
import java.util.Locale;

public class MultipleChoiceQuestion extends Question{
    public MultipleChoiceQuestion(String question, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        super(question, "Multiple Choice", questionValue, possibleAnswers, correctAnswer);
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {
        return ((String) answer).toLowerCase().equals(this.getCorrectAnswer().toString().toLowerCase());
    }
}
