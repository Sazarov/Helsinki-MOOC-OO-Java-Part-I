

public class Main {

    public static void main(String[] args) {
        // write testcode here

    }

    public static int[] copy(int[] array) {
        int[] clone = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            clone[i] = array[i];
        }
        return clone;
    }

    public static int[] reverseCopy(int[] array) {
        int[] clone = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            clone[i] = array[array.length-1-i];
        }
        return clone;
    }
}
