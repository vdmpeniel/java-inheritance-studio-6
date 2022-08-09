import java.util.List;

public class TextQuestion extends Question{
    private Integer maxLength = 0;

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    // to avoid doing this we can remove this property from Question
    // Avoid the use of this constructor
    private TextQuestion(String question, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        super(question, questionValue, possibleAnswers, correctAnswer);
    }

    public TextQuestion(String question, Integer questionValue, Object correctAnswer){
        super(question, questionValue, null, correctAnswer);
        this.setQuestionType("Text question");
        this.setInputInstructions("Type your response");
    }

    // to avoid doing this we can remove this property from Question
    @Override
    public List<String> getPossibleAnswers() {
        return null;
    }

    // to avoid doing this we can remove this property from Question
    @Override
    public void setPossibleAnswers(List<String> possibleAnswers) {
        System.out.println("Can't set this property");
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {
        return String.valueOf(answer).replace(" ", "").toLowerCase()
                .equals(
                        String.valueOf(getCorrectAnswer()).replace(" ", "").toLowerCase()
                );
    }

    @Override
    public void showAllPossibleAnswers(){
    }

    @Override
    public boolean validateAnswer(Object answer){
        return super.validateAnswer(answer)
                && (maxLength == 0)? true : String.valueOf(answer).length() <= maxLength
                && !String.valueOf(answer).isBlank();
    };

}
