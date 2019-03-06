import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics statistics = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();

        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        System.out.println("Type numbers: ");

        while(true) {
            int number = Integer.parseInt(reader.nextLine());

            if (number == -1) break;
            if (number % 2 == 0) evenStats.addNumber(number);
            if (number % 2 != 0) oddStats.addNumber(number);

            statistics.addNumber(number);
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even: " + evenStats.sum());
        System.out.println("Sum of odd: " + oddStats.sum());
    }
}
