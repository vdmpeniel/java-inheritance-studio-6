import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CheckboxQuestion extends Question{
    public CheckboxQuestion(String question, Integer questionValue, List<String> possibleAnswers, Object correctAnswer){
        super(question, "Checkbox", questionValue, possibleAnswers, correctAnswer);
    }

    @Override
    public void showQuestion(){
        super.showQuestion();
        System.out.println("-> Enter multiple answers separated by commas.");
    }

    @Override
    public boolean checkIfAnswerIsCorrect(Object answer) {

        ArrayList<String> castedAnswers = new ArrayList<>(Arrays.asList(((String) answer).split(","))
            .stream().map(ans -> ans.toLowerCase().trim()).collect(Collectors.toList()));
        ArrayList<String> castedCorrectAnswers = (ArrayList<String>) ((ArrayList<String>) this.getCorrectAnswer());

        if(castedAnswers.size() != castedCorrectAnswers.size()) return false;

        for(String ans : castedCorrectAnswers){
            if(!castedAnswers.contains(ans.toLowerCase())){ return false;}
        }
        return true;
    }


}
