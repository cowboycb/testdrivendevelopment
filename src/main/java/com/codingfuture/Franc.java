package com.codingfuture;

import java.util.Objects;

public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount*multiplier);
    }

    public int amount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franc franc = (Franc) o;
        return amount == franc.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}