import java.util.List;

public class TrueOrFalseQuestion extends Question{
    public TrueOrFalseQuestion(String question, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        super(question, "True or False", questionValue, possibleAnswers, correctAnswer);
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {
        return ((String) answer).toLowerCase().equals("true") == ((Boolean) this.getCorrectAnswer());
    }
}
