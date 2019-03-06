public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return ("The card has " + this.balance + " euros");
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        }
    }

    public void loadMoney(double amount) {
        if (!negativeAmount(amount)) {
            if ((this.balance + amount) > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }

    private boolean negativeAmount(double amount) {
        return amount < 0;
    }
}
