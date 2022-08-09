import java.util.List;

public abstract class Question {
    private String question;
    private String questionType;
    private List<String> possibleAnswers;
    private Object correctAnswer;

    public Question(String question, String questionType, List<String> possibleAnswers, Object correctAnswer){
        this.question = question;
        this.questionType = questionType;
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
