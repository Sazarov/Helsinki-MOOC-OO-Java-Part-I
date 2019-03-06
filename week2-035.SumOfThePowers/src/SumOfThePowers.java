
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        int x = 0;
        int sum = 0;
        while(x<=power) {
            int product = (int)Math.pow(2,x);
            sum += product;
            x++;
        }

        System.out.println("The result is " + sum);
    }
}
