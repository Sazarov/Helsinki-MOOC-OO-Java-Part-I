
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        while (true) {
            System.out.println("Name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            String number = reader.nextLine();
            Student student = new Student(name, number);
            students.add(student);
        }

        System.out.println(students);

        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();

        for (Student student :
                students) {
            if (student.getName().contains(searchTerm)) {
                System.out.println("Result: ");
                System.out.println(student);
            }
        }
    }
}
