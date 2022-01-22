package com.codingfuture;

import java.util.Objects;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public int amount() {
        return amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
