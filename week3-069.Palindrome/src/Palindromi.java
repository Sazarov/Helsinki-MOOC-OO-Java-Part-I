import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String reverseText = "";
        String lowerCase = text.toLowerCase();
        for (int i = 0; i < text.length() ; i++) {
            reverseText += lowerCase.charAt(lowerCase.length() - 1 - i);
        }
        return lowerCase.equals(reverseText);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
