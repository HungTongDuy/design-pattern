package com.demo.patterns.structural.decorator.coffee;

public class CoffeeMainApp {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
//        printCoffee(espresso);

        espresso = new WithMilk(espresso);
        printCoffee(espresso);

        espresso = new WithSugar(espresso);
        printCoffee(espresso);
    }

    private static void printCoffee(Coffee c) {
        System.out.println("Cost: " + c.cost() + ", Description: " + c.getDescription());
    }
}
