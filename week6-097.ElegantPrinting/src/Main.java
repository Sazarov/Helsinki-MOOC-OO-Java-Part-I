
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        for (int i = 0; i < array.length; i++) {
            System.out.print((array.length - 1 == i) ? array[i] : array[i] + " ,");
        }
    }
}
