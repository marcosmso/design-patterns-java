import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage {
    
    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments(){
        System.out.println("Adding sugar and Milk");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar with coffee (y/n) ?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();

        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return null;
        }
        return answer;
    }

}
