package com.demo.patterns.behavioral.strategy.sorting;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Bubble sort algorithm");
    }
}
