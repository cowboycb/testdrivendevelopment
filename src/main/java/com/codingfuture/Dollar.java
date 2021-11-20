package com.codingfuture;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        this.amount = amount * multiplier;
    }

    public int amount() {
        return amount;
    }
}
