
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String firstWord = reader.nextLine();

        System.out.println("Type the second word: " );
        String secondWord = reader.nextLine();

        System.out.println("The word '" + secondWord + "' is" + (wordChecker(firstWord, secondWord) ? " " : " not " ) + "found in the word '" + firstWord + "'");
    }

    public static boolean wordChecker(String wordOne, String wordTwo) {
        return wordOne.indexOf(wordTwo) != -1;
    }
}
