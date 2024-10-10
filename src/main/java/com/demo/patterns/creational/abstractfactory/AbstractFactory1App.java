package com.demo.patterns.creational.abstractfactory;

import com.demo.patterns.creational.abstractfactory.factories.AsusManufacturer;
import com.demo.patterns.creational.abstractfactory.factories.MsiManufacturer;

public class AbstractFactory1App {
    public static void main(String[] args) {
        AsusManufacturer asusManufacturer = new AsusManufacturer();
        asusManufacturer.createGpu().assemble();
        asusManufacturer.createMonitor().assemble();

        MsiManufacturer msiManufacturer = new MsiManufacturer();
        msiManufacturer.createGpu().assemble();
        msiManufacturer.createMonitor().assemble();
        msiManufacturer.createMonitor().enableMonitor();
    }
}
