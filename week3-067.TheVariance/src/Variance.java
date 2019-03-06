import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int i :
                list) {
            sum += i;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg = (double)(sum(list))/list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here

        double variance = -1d;
        double avg = average(list);

        if (list.size() > 1) {
            double tempSum = 0d;
            for (int i :
                    list) {
                tempSum += Math.pow((avg - i), 2);
            }
            variance = tempSum/(list.size() -1);
        }
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
