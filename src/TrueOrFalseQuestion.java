import java.util.List;

public class TrueOrFalseQuestion extends Question{
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
                && this.getPossibleAnswers().contains(answer);
    };
}
