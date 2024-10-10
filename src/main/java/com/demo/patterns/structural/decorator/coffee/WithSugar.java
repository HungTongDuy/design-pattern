package com.demo.patterns.structural.decorator.coffee;

public class WithSugar extends CoffeeDecorator {
    Coffee coffee;
    public WithSugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }

    @Override
    public String getDescription() {
        return coffee.description + ", Sugar";
    }
}
