package com.demo.patterns.behavioral.strategy.sorting;

public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Merge sort algorithm");
    }
}
