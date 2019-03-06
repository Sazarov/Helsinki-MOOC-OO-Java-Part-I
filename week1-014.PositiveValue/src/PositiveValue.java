
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:

        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());

        System.out.println( (a > 0) ? "The number is positive." : "The number is not positive.");
    }
}
