package com.demo.patterns.creational.abstractfactory2.products;

import com.demo.patterns.creational.abstractfactory2.Car;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car.");
    }
}
