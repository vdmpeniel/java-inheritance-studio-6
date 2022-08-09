public class ParagraphQuestion extends TextQuestion{
    public ParagraphQuestion(String question, Integer questionValue, Object correctAnswer) {
        super(question, questionValue, correctAnswer);
        this.setQuestionType("Paragraph Question");
        this.setMaxLength(500);
        this.setInputInstructions("Type a short response ("  + this.getMaxLength() + " characters or less)");
    }
}
