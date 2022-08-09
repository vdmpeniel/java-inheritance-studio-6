import java.util.List;

public abstract class Question {
    private String question;
    private String questionType;
    private Integer questionValue;
    private List<String> possibleAnswers;
    private Object correctAnswer;


    public Question(String question, String questionType, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        this.question = question;
        this.questionType = questionType;
        this.questionValue = questionValue;
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
        System.out.println(questionType);
        System.out.println("Question: " + question);
    }

    public void showAllPossibleAnswers(){
        possibleAnswers.forEach((answer) -> System.out.println(answer));
    }

    public abstract boolean checkIfAnswerIsCorrect(Object answer);




}
