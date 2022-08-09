import java.util.List;

public abstract class Question {
    private String question;
    private String questionType;
    private Integer questionValue;
    private String inputInstructions;
    private List<String> possibleAnswers;
    private Object correctAnswer;


    public Question(String question, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        this.question = question;
        this.questionValue = questionValue;
        this.inputInstructions = "N/A";
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public Integer getQuestionValue() { return questionValue; }

    public void setQuestionValue(Integer questionValue) { this.questionValue = questionValue; }

    public String getInputInstructions() {
        return inputInstructions;
    }

    public void setInputInstructions(String inputInstructions) {
        this.inputInstructions = inputInstructions;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public Object getCorrectAnswer(){
        return correctAnswer;
    }

    public void setCorrectAnswer(Object correctAnswer){
        this.correctAnswer = correctAnswer;
    };

    public void showQuestion(){
        System.out.println("............................................");
        System.out.println(questionType);
        System.out.println("Question: " + question);
        System.out.println("-> " + inputInstructions + ":");
    }

    public void showAllPossibleAnswers(){
        possibleAnswers.forEach((answer) -> System.out.println(answer));
    }

    public abstract boolean checkIfAnswerIsCorrect(Object answer);

    public boolean validateAnswer(Object answer){
        return (answer instanceof String) && !((String) answer).isEmpty();
    };




}
