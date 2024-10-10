package com.demo.patterns.behavioral.strategy.sorting;

public class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] arr) {
        sortingStrategy.sort(arr);
    }
    
}
