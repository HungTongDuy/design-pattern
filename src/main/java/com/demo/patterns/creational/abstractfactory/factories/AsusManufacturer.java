package com.demo.patterns.creational.abstractfactory.factories;

import com.demo.patterns.creational.abstractfactory.products.AsusGpu;
import com.demo.patterns.creational.abstractfactory.products.AsusMonitor;
import com.demo.patterns.creational.abstractfactory.products.Gpu;
import com.demo.patterns.creational.abstractfactory.products.Monitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
