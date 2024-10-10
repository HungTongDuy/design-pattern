package com.demo.patterns.creational.abstractfactory2.products;

import com.demo.patterns.creational.abstractfactory2.Car;

public class Hatchback implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car.");
    }
}
