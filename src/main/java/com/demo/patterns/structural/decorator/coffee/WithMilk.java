package com.demo.patterns.structural.decorator.coffee;

public class WithMilk extends CoffeeDecorator {
    private Coffee coffee;

    public WithMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }

    @Override
    public String getDescription() {
        return coffee.description + ", Milk";
    }
}
