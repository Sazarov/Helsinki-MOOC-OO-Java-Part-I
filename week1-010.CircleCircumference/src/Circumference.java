
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here

        System.out.println("Circle radius: ");
        double radius = Double.parseDouble(reader.nextLine());

        System.out.println("Circumference of the circle: " + ((double)2*Math.PI*radius));
    }
}
