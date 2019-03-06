public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String stars = "";
        for (int i = 0; i < amount; i++) {
            stars += "*";
        }

        System.out.println(stars);
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for (int i = 0; i < amount ; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int stars = 1;
        for (int i = 1; i <= height; i++) {
            printWhitespaces(height - i);
            printStars(stars);
            stars+=2;
        }
        int baseWhitespace = Math.round((float)((height*2-1)/2));
        for (int i = 0; i < 2; i++) {
            printWhitespaces(baseWhitespace-1);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(3);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
