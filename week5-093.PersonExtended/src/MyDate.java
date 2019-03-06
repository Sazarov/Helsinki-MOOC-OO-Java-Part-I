
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate comparedDate) {
        int yearDifference = Math.abs(this.year - comparedDate.year);

        MyDate lesserDate = comparedDate.year - this.year > 0 ? this : comparedDate;
        MyDate greaterDate = comparedDate.year - this.year <= 0 ? this : comparedDate;

        int totalDaysInDifference = (31 - lesserDate.day) + (12 - lesserDate.month) * 31 + 372 * (yearDifference - 1) + (greaterDate.month - 1) * 31 + greaterDate.day;

        double accurateYearDifference = totalDaysInDifference / 372.0;

        return (accurateYearDifference >= 1.0) ? (int)(accurateYearDifference) : 0;
    }

  
}
