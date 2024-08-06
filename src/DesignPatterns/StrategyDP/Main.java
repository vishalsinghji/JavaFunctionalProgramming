package DesignPatterns.StrategyDP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortContext context = new SortContext();

        int[] numbers = {5, 3, 8, 2, 1, 4};

        context.setStrategy(new BubbleSortStrategy());
        context.sort(numbers);
        System.out.println("Bubble Sorted: " + Arrays.toString(numbers));

        numbers = new int[]{5, 3, 8, 2, 1, 4};
        context.setStrategy(new QuickSortStrategy());
        context.sort(numbers);
        System.out.println("Quick Sorted: " + Arrays.toString(numbers));
    }
}
