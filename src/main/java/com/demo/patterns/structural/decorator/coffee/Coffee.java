package com.demo.patterns.structural.decorator.coffee;

public abstract class Coffee {
    String description = "Unknown coffee";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
