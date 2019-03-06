
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.

        System.out.print("Number A: ");
        int A = Integer.parseInt(reader.nextLine());

        System.out.print("Number B: ");
        int B = Integer.parseInt(reader.nextLine());

        System.out.println("Division:" + A + " / " + B + " = " + (1.0*A/B));
    }
}
