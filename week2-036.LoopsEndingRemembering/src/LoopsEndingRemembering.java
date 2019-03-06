import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project einputercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int sum = 0;
        int numberOfNumbers = 0;
        int numberOfEven = 0;
        int numberOfOdd = 0;
        double average = 0;

        while(true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            }
            numberOfNumbers++;
            sum+=input;

            average = (double)(sum)/(double)(numberOfNumbers);
            
            if (input % 2 == 0 ) {
                numberOfEven++;
            } else {
                numberOfOdd++;
            }
        }

        System.out.println("Thank you and see you later");

        System.out.println("The sum is " + sum);

        System.out.println("How many numbers: " + numberOfNumbers);

        System.out.println("Average: " + average);

        System.out.println("Even numbers: " + numberOfEven);

        System.out.println("Odd numbers: " + numberOfOdd);
    }
}
