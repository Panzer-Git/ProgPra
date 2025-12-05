import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teilnehmer {
    List<Integer> answers = new ArrayList<>();
    Scanner myScanner = new Scanner(System.in);
    public void answerQuestion(String answer)
    {
         if(answer.equalsIgnoreCase("j")){
             answers.add(1);
         }else{
             answers.add(0);
         }

    }

    public int getAnswer(int i)
    {
        return answers.get(i);
    }

    public void printAll(){
        for(int i=0;i<answers.size();i++){
            System.out.println(answers.get(i));
        }
    }
}
