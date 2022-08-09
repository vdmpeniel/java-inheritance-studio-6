import java.util.List;
import java.util.Locale;

public class MultipleChoiceQuestion extends Question{
    public MultipleChoiceQuestion(String question, List<String> possibleAnswers, Object correctAnswer){
        super(question, "Multiple Choice", possibleAnswers, correctAnswer);
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {
        return ((String) answer).toLowerCase().equals(this.getCorrectAnswer().toString().toLowerCase());
    }
}
