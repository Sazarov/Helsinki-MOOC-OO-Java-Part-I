public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public int differenceInYears(MyDate comparedDate) {
        int yearDifference = Math.abs(this.year - comparedDate.year);

        MyDate lesserDate = comparedDate.year - this.year > 0 ? this : comparedDate;
        MyDate greaterDate = comparedDate.year - this.year <= 0 ? this : comparedDate;

        int totalDaysInDifference = (30 - lesserDate.day) + (12 - lesserDate.month) * 30 + 360 * (yearDifference - 1) + (greaterDate.month - 1) * 30 + greaterDate.day;

        double accurateYearDifference = totalDaysInDifference / 360.0;

        return (accurateYearDifference >= 1.0) ? (int)(accurateYearDifference) : 0;
    }

}
