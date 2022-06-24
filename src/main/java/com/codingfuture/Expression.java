package com.codingfuture;

public interface Expression {
    Money reduce(Bank bank, String to);
}
