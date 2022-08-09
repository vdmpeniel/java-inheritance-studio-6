import java.util.ArrayList;
import java.util.List;

public class RunQuiz {

    public static void main(String[] args) {
        List question1Answers = new ArrayList<>(){{
            add("Java");
            add("Boxer");
            add("JavaScript");
        }};

        Question question1 = new MultipleChoiceQuestion(
                "Which one is not a real programming language?",
                15,
                question1Answers,
                "Boxer"
        );





        List question2Answers = new ArrayList<>(){{
            add("False");
            add("True");
        }};
        Question question2 = new TrueOrFalseQuestion(
                "Is Java the easiest language ever?",
                5,
                question2Answers,
                false
        );



        List question3Answers = new ArrayList<>(){{
            add("Ubuntu");
            add("Kali");
            add("Fedora");
            add("Mac Os");
        }};

        List question3CorrectAnswers = new ArrayList<>(){{
            add("Ubuntu");
            add("Kali");
            add("Fedora");
        }};


        Question question3 = new CheckboxQuestion(
                "Which of the following are linux distributions",
                10,
                question3Answers,
                question3CorrectAnswers
        );




        String question4CorrectAnswer = "Hola!";
        Question question4 = new ShortAnswerQuestion(
                "How you say Hello! in Spanish",
                10,
                question4CorrectAnswer
        );



        List questionList = new ArrayList(){{
            //add(question1);
            //add(question2);
            //add(question3);
            add(question4);
        }};
        Quiz myQuiz = new Quiz(questionList);
        myQuiz.runQuiz();

        System.out.println("---------------------------------");
        System.out.println("Quiz Grade: " + myQuiz.gradeQuiz());


    }
}
