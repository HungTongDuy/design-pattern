package com.demo.patterns.creational.abstractfactory.products;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
