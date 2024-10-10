package com.demo.patterns.behavioral.strategy.calculation;

public class Addition implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println(String.format("Addition: %d - %d", a, b));
        return a + b;
    }
}
