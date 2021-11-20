package com.codingfuture.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codingfuture.Dollar;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount());
        product = five.times(3);
        assertEquals(15, product.amount());
    }
}
