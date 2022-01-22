package com.codingfuture;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.dollar(amount*multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }

    public int amount() {
        return amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
