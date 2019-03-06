
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String username = reader.nextLine();
        System.out.println("Type your password: ");
        String password = reader.nextLine();
        String validLogin = "You are now logged into the system!";

        if (username.equals("alex") && password.equals("mightyducks")) {
            System.out.println(validLogin);
        } else if (username.equals("emily") && password.equals("cat")) {
            System.out.println(validLogin);
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
