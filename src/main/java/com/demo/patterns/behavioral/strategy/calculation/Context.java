package com.demo.patterns.behavioral.strategy.calculation;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
