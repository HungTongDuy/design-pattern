package com.demo.patterns.creational.abstractfactory.factories;

import com.demo.patterns.creational.abstractfactory.products.Gpu;
import com.demo.patterns.creational.abstractfactory.products.Monitor;
import com.demo.patterns.creational.abstractfactory.products.MsiGpu;
import com.demo.patterns.creational.abstractfactory.products.MsiMonitor;

public class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
