import java.util.List;

public abstract class PredeterminedAnswersQuestion extends Question{
    private List<String> possibleAnswers;

    public PredeterminedAnswersQuestion(String question, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        super(question, questionValue, correctAnswer);
        this.possibleAnswers = possibleAnswers;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public void showAllPossibleAnswers(){
        possibleAnswers.forEach((answer) -> System.out.println(answer));
    }
}
