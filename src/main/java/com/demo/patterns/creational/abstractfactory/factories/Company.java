package com.demo.patterns.creational.abstractfactory.factories;

import com.demo.patterns.creational.abstractfactory.products.Gpu;
import com.demo.patterns.creational.abstractfactory.products.Monitor;

public abstract class Company {
    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
