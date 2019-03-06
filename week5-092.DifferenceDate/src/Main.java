
public class Main {

    public static void main(String[] args) {
        // write testcode here
        MyDate first = new MyDate(1, 5, 1995);
        MyDate second = new MyDate(10, 5, 1992);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println( second + " and " + first + " difference in years: " + second.differenceInYears(first) );

        System.out.println( third + " and " + first + " difference in years: " + third.differenceInYears(first) );

        System.out.println( second + " and " + third + " difference in years: " + second.differenceInYears(third) );
    }
}
