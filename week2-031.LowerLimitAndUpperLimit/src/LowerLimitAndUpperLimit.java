
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int start = Integer.parseInt(reader.nextLine());

        System.out.println("Last: ");
        int end = Integer.parseInt(reader.nextLine());

        if(start < end || start == end) {
            for(int s = start; s<=end; s++) {
                System.out.println(s);
            }
        }
    }
}
