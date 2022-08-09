public class ShortAnswerQuestion extends TextQuestion{
    public ShortAnswerQuestion(String question, Integer questionValue, Object correctAnswer) {
        super(question, questionValue, correctAnswer);
        this.setQuestionType("Short Answer Question");
        this.setMaxLength(80);
        this.setInputInstructions("Type a short response ("  + this.getMaxLength() + " characters or less)");

    }
}
