package com.demo.patterns.creational.abstractfactory2.factories;

import com.demo.patterns.creational.abstractfactory2.Car;
import com.demo.patterns.creational.abstractfactory2.CarFactory;
import com.demo.patterns.creational.abstractfactory2.CarSpecification;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return null;
    }

    @Override
    public CarSpecification carSpecification() {
        return null;
    }
}
