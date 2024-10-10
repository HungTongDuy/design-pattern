package com.demo.patterns.behavioral.strategy.sorting;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Quick sort algorithm");
    }
}
