import java.util.List;
import java.util.Locale;

public class MultipleChoiceQuestion extends Question{
    public MultipleChoiceQuestion(String question, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        super(question, questionValue, possibleAnswers, correctAnswer);
        this.setQuestionType("Multiple Choice");
        this.setInputInstructions("Type only the correct answer");
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {
        return ((String) answer).toLowerCase().equals(this.getCorrectAnswer().toString().toLowerCase());
    }

    @Override
    public boolean validateAnswer(Object answer){
        return super.validateAnswer(answer)
                && this.getPossibleAnswers().stream().map(ans -> ans.toLowerCase()).toList().contains(answer.toString().toLowerCase());
    };
}
