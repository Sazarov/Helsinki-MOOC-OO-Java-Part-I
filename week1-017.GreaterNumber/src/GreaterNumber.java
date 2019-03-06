import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("number A: ");
        int A = Integer.parseInt(reader.nextLine());

        System.out.println("number B: ");
        int B = Integer.parseInt(reader.nextLine());

        if (A > B) {
            System.out.println("Greater number: " + A);
        } else if (A < B) {
            System.out.println("Greater number: "  + B);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
