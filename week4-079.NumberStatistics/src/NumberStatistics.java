import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private ArrayList<Integer> numberList;


    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.numberList = new ArrayList<Integer>();
    }

    public void addNumber(int number) {
        // code here
        this.numberList.add(number);
    }

    public int amountOfNumbers() {
        // code here
        return this.numberList.size();
    }

    public int sum() {
        // code here
        int sum = 0;
        if (this.numberList.size() > 0) {
            for (int number :
                    numberList) {
                sum += number;
            }
        }
        return sum;
    }

    public double average() {
        // code here
        if (this.numberList.size() > 0)
            return (double) (sum()) / (double)(this.numberList.size());
        else
            return 0d;
    }
}
