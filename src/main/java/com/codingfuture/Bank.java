package com.codingfuture;

public class Bank {
    public Money reduced(Expression source, String to) {
        return source.reduce(to);
    }
}
