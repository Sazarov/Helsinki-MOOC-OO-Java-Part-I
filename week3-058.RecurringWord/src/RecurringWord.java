
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList

        ArrayList<String> list = new ArrayList<String>();

        while(true) {
            System.out.println("Type a word: ");
            String nextWord = reader.nextLine();
            if(list.contains(nextWord)) {
                System.out.println("You gave the word " + nextWord + " twice.");
                break;
            }

            list.add(nextWord);
        }
        
    }
}
