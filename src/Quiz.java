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
            question.showQuestion();
            question.showAllPossibleAnswers();
            quizMap.put(question, getInputAnswer(question));
        }
        scanner.close();
    }

    private boolean askForNewInput(Question question){
        System.out.println("Your input was not valid.");
        System.out.println("Please. " + question.getInputInstructions());
        return true;
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

    private String getInputAnswer(Question question){
        String input;
        do {
            input = scanner.nextLine();
        } while(!question.validateAnswer(input) && askForNewInput(question));
        return input;
    }
}
