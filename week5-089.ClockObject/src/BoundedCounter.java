public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if(this.value < this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        String val = ""+this.value;
        if (this.value < 10) {
            val="0"+this.value;
        }
        return val;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int val) {
        if(val > 0 && val <= this.upperLimit) {
            this.value=val;
        }
    }
}
