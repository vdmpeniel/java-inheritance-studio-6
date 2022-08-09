import java.util.*;

public class Quiz {
    Scanner scanner = new Scanner(System.in);

    List<Question> quizQuestions = new ArrayList<>();
    Map<Question, String> quizMap = new HashMap<>();

    public Quiz(List<Question> quizQuestion){
        this.quizQuestions = quizQuestion;
    }

    public void runQuiz(){
        for(Question question : quizQuestions){
            System.out.println(".................................");
            question.showQuestion();
            question.showAllPossibleAnswers();
            quizMap.put(question, getInputAnswer());
        }
        scanner.close();
    }

    public int gradeQuiz(){
        int grade = 0;
        for(Question question : quizQuestions){
            if(question.checkIfAnswerIsCorrect(quizMap.get(question))){
                grade += question.getQuestionValue();
            }
        }
        return grade;
    }

    private String getInputAnswer(){
        String input = scanner.nextLine();
        return input;
    }
}
