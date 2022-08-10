import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrueOrFalseQuestion extends PredeterminedAnswersQuestion{
    public TrueOrFalseQuestion(String question, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        super(question, questionValue, possibleAnswers, correctAnswer);
        this.setQuestionType("True or False");
        this.setInputInstructions("Type true or false");
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {
        return ((String) answer).toLowerCase().equals("true") == ((Boolean) this.getCorrectAnswer());
    }

    @Override
    public boolean validateAnswer(Object answer){
        return super.validateAnswer(answer)
                && Arrays.asList("true", "false").contains(answer.toString().toLowerCase());
    };
}
