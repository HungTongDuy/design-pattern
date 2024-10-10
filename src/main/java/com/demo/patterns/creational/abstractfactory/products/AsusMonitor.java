package com.demo.patterns.creational.abstractfactory.products;

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling ASUS Monitor");
    }

    @Override
    public void enableMonitor() {
        System.out.println("Enabling ASUS Monitor");
    }
}
