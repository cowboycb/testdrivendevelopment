package com.codingfuture;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount*multiplier);
    }

    public int amount() {
        return amount;
    }
}
