package com.demo.patterns.behavioral.strategy.calculation;

import com.demo.patterns.DemoApplication;
import org.springframework.boot.SpringApplication;

public class StrategyExample {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Context context1 = new Context(new Addition());
        System.out.println(context1.executeStrategy(3, 4));

        Context context2 = new Context(new Subtract());
        System.out.println(context2.executeStrategy(7, 1));

        Context context3 = new Context(new Multiply());
        System.out.println(context3.executeStrategy(2, 3));
    }
}
