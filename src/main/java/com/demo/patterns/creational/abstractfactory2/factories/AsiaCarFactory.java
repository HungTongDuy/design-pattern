package com.demo.patterns.creational.abstractfactory2.factories;

import com.demo.patterns.creational.abstractfactory2.Car;
import com.demo.patterns.creational.abstractfactory2.CarFactory;
import com.demo.patterns.creational.abstractfactory2.CarSpecification;
import com.demo.patterns.creational.abstractfactory2.products.Sedan;

public class AsiaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification carSpecification() {
        return null;
    }
}
