import resources.Utils;

public class LinearScaleQuestion extends Question{
    private int minimum;
    private int maximum;

    public LinearScaleQuestion(String question, int minimum, int maximum, Integer questionValue, Object correctAnswer) {
        super(question, questionValue, correctAnswer);
        this.setQuestionType("Line Scale Question");
        this.minimum = minimum;
        this.maximum = maximum;
        this.setInputInstructions(String.format("Type an integer value between %d and %d", minimum, maximum));
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {
        return Integer.parseInt(answer.toString()) == (Integer) this.getCorrectAnswer();
    }

    @Override
    public boolean validateAnswer(Object answer){
        return Utils.isInteger(answer.toString())
           && Integer.parseInt(answer.toString()) >= minimum
           && Integer.parseInt(answer.toString()) <= maximum;
    };


}
