package com.demo.patterns.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankEnum.HD);
        System.out.println(bank.getName());
    }
}
