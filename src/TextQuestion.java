import java.util.List;

public class TextQuestion extends Question{
    private Integer maxLength = 0;

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public TextQuestion(String question, Integer questionValue, Object correctAnswer){
        super(question, questionValue, correctAnswer);
        this.setQuestionType("Text question");
        this.setInputInstructions("Type your response");
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {
        return String.valueOf(answer).replace(" ", "").toLowerCase()
            .equals(
                    String.valueOf(getCorrectAnswer()).replace(" ", "").toLowerCase()
            );
    }

    @Override
    public boolean validateAnswer(Object answer){
        return super.validateAnswer(answer)
            && (maxLength == 0)? true : String.valueOf(answer).length() <= maxLength
            && !String.valueOf(answer).isBlank();
    };

}
