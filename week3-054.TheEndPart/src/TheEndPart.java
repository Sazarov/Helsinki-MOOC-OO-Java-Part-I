import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of first part: ");
        int length = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + chopper(word, length));
    }

    public static String chopper(String word, int length) {
        return word.substring(word.length()-length);
    }
}
