package com.demo.patterns.creational.abstractfactory.products;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Monitor");
    }


    @Override
    public void enableMonitor() {
        System.out.println("Enabling MSI Monitor");
    }
}
