import java.util.List;

public class ShortAnswerQuestion extends Question{
    // Avoid the use of this constructor
    private ShortAnswerQuestion(String question, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        super(question, questionValue, possibleAnswers, correctAnswer);
    }

    public ShortAnswerQuestion(String question, Integer questionValue, Object correctAnswer){
        super(question, questionValue, null, correctAnswer);
        this.setQuestionType("Short Answer Question");
        this.setInputInstructions("Type a short response (less than 80 characters)");
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {
        return String.valueOf(answer).replace(" ", "").toLowerCase()
                .equals(
                        String.valueOf(getCorrectAnswer()).replace(" ", "").toLowerCase()
                );
    }

    public void showAllPossibleAnswers(){
        System.out.println("Type your own response.");
    }

    @Override
    public boolean validateAnswer(Object answer){
        return super.validateAnswer(answer)
                && String.valueOf(answer).length() <= 80
                && !String.valueOf(answer).isBlank();
    };

}
