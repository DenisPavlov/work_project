package tdd;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    public String currency() {
        return currency;
    }

    public static Money frank(int amount) {
        return new Money(amount, "CHF");
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Money money = (Money) obj;
        return currency.equals(money.currency) && amount == money.amount;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
