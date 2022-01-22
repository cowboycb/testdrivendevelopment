package com.codingfuture;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public Money times(int multiplier){
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Money money = (Money) o;
        return amount == money.amount && currency().equals(money.currency());
    }

    public String currency(){
        return currency;
    }

    public String toString() {
        return amount + " " + currency;
    }
}
