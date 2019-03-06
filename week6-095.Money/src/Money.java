
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money referenceMoney) {
        int centsSum = this.cents + referenceMoney.cents;
        int euroSum = this.euros + referenceMoney.euros;

        return new Money(euroSum, centsSum);
    }

    public boolean less(Money compared) {
        if(this.euros < compared.euros) {
            return true;
        } else if (this.euros > compared.euros) {
            return false;
        } else {
            if( this.cents > compared.cents) {
                return false;
            } else {
                return true;
            }
        }
    }

    public Money minus(Money decremented) {
        int finalEuro = 0;
        int finalCents = 0;

        finalEuro = this.euros - decremented.euros;
        finalCents = this.cents - decremented.cents;

        if (finalCents < 0) {
            finalCents += 100;
            finalEuro--;
        }

        if (finalEuro < 0) {
            finalEuro = 0;
            finalCents = 0;
        }

        return new Money(finalEuro, finalCents);
    }
}
