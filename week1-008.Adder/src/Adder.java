
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Number A: ");
        int A = Integer.parseInt(reader.nextLine());
        System.out.println("Number B: ");
        int B = Integer.parseInt(reader.nextLine());

        System.out.println("Sum of the numbers:" + (A+B));
    }
}
