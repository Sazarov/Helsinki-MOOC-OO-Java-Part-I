import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook = new ArrayList<Person>();
    public void add(String name, String number) {
        phonebook.add(new Person(name, number));
    }

    public void printAll() {
        for (Person p :
                phonebook) {
            System.out.println(p);
        }
    }

    public String searchNumber(String name) {
        String number = "number not known";
        for (Person dude :
                phonebook) {
            if(dude.getName().contains(name)) {
                number = dude.getNumber();
            }
        }
        return number;
    }

}
