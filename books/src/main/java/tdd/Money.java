package tdd;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Money) {
            Money money =  (Money) obj;
            return amount == money.amount;
        }
        return false;
    }
}
