import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private int[] gradeStatistics = new int[6];

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    private void evaluateGradeStatistics() {
        for (int grade :
                this.grades) {
            if (grade >= 0 && grade <= 29) {
                this.gradeStatistics[0]++;
            } else if (grade > 29 && grade <= 34) {
                this.gradeStatistics[1]++;
            } else if (grade > 34 && grade <= 39) {
                this.gradeStatistics[2]++;
            } else if (grade > 39 && grade <= 44) {
                this.gradeStatistics[3]++;
            } else if (grade > 44 && grade <= 49) {
                this.gradeStatistics[4]++;
            } else if (grade > 49 && grade <= 60) {
                this.gradeStatistics[5]++;
            }
        }
    }

    public void printGradeStatistics() {
        evaluateGradeStatistics();
        int sumAccepted = 0;
        System.out.println("Grade distribution");
        for (int i = this.gradeStatistics.length-1; i >= 0; i--) {
            String stars = "";
            if (i >= 1) {
                sumAccepted+= this.gradeStatistics[i];
            }
            for (int j = 0; j < this.gradeStatistics[i]; j++) {
                stars+="*";
            }
            System.out.println(i + ": " + stars);
        }

        System.out.println("Acceptance percentage: " + (100.0*sumAccepted/this.grades.size()));
    }


}
