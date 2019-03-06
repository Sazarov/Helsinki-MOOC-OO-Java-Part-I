import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.random = new Random();
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password="";
        for (int i = 0; i < this.length ; i++) {
            Character c = (char)(this.random.nextInt(25)+97);
            String ready = c.toString();
            password += ready;
        }
        return password;
    }
}
