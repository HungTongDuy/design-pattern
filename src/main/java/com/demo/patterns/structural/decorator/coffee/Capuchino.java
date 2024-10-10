package com.demo.patterns.structural.decorator.coffee;

public class Capuchino extends Coffee {
    public Capuchino() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
