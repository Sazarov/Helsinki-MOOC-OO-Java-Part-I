
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> list = new ArrayList<String>();

        while(true) {
            System.out.println("Type a word: ");
            String nextWord = reader.nextLine();

            if(nextWord.isEmpty()) {
                System.out.println("You typed the following words: ");
                Collections.sort(list);
                for (String word :
                        list) {
                    System.out.println(word);
                }
                break;
            }

            list.add(nextWord);
        }
    }
}
