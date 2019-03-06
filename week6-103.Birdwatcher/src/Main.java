import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        Scanner reader = new Scanner(System.in);
        BirdCatalog catalog = new BirdCatalog();

        while (true) {
            System.out.println("?");
            String command = reader.nextLine();

            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = reader.nextLine();

                System.out.println("Latin");
                String latinName = reader.nextLine();

                catalog.addBird(new Bird(name, latinName));
            } else if (command.equals("Observation")) {
                System.out.println("What was observed?");
                String observedBird = reader.nextLine();

                catalog.observe(observedBird);

            } else if (command.equals("Statistics")) {
                catalog.printCatalog();
            } else if (command.equals("Show")) {
                System.out.println("What?");
                String birdName = reader.nextLine();

                catalog.showBird(birdName);
            } else if (command.equals("Quit")) {
                break;
            }
        }
    }

}
