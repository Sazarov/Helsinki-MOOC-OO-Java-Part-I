public class Counter {
    private int value;
    private boolean preventSubZero;

    public Counter(int startingValue, boolean check) {
        this.preventSubZero = check;
        this.value = startingValue;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        if (!this.preventSubZero || (this.preventSubZero && this.value > 0)) {
            this.value--;
        }
    }

    public void increase(int amount) {
        if (amount >= 0) {
            this.value += amount;
        }
    }

    public void decrease(int amount) {
        if (amount >= 0) {
            int tempVal = this.value - amount;
            if (!this.preventSubZero) {
                this.value -= amount;
            } else if (this.preventSubZero && (tempVal >= 0)) {
                this.value -= amount;
            } else if (this.preventSubZero && (tempVal < 0)) {
                this.value = 0;
            }
        }
    }
}
