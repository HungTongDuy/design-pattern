package com.demo.patterns.behavioral.strategy.sorting;

import com.demo.patterns.DemoApplication;
import org.springframework.boot.SpringApplication;

public class SortingStrategyExample {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);

        int[] arr = {1, 2, 3, 4, 5, 6};

        SortingContext context1 = new SortingContext(new BubbleSortStrategy());
        context1.performSort(arr);

        SortingContext context2 = new SortingContext(new MergeSortStrategy());
        context2.performSort(arr);

        SortingContext context3 = new SortingContext(new QuickSortStrategy());
        context3.performSort(arr);
    }
}
