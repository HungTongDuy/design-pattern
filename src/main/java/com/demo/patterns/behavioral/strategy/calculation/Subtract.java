package com.demo.patterns.behavioral.strategy.calculation;

public class Subtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println(String.format("Subtract: %d - %d", a, b));
        return a - b;
    }
}
