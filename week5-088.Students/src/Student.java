public class Student {
    private String name;
    private String studentNumber;

    public Student(String name, String number) {
        this.name = name;
        this.studentNumber = number;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public String toString() {
        return "" + this.name+ " (" + this.studentNumber + ")";
    }
}
