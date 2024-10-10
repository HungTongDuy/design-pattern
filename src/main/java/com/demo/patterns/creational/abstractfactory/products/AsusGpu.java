package com.demo.patterns.creational.abstractfactory.products;

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling ASUS GPU");
    }
}
