package com.demo.patterns.creational.factory;

public class BankFactory {
    private BankFactory() {
    }

    public static final Bank getBank(BankEnum bank) {
        switch (bank) {
            case HD: return new HDBank();
            case TECHCOM: return new TechcomBank();
            default: throw new IllegalArgumentException("Bank invalid");
        }
    }
}
