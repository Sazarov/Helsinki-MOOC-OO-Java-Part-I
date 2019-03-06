
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int curr :
                array) {
            if(curr < smallest) {
                smallest = curr;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int smallestIndex = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // code goes here
        int smallestIndex = index;
        int smallest = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int val1 = array[index1];
        int val2 = array[index2];

        array[index1] = val2;
        array[index2] = val1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentSmallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, currentSmallestIndex);
        }
    }

}
