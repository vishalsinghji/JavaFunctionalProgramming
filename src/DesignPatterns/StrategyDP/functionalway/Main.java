package DesignPatterns.StrategyDP.functionalway;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortContext context = new SortContext();

        int[] numbers = {5, 3, 8, 2, 1, 4};

        context.setStrategy(SortingStrategies.BUBBLE_SORT);
        context.sort(numbers);
        System.out.println("Bubble Sorted: " + Arrays.toString(numbers));

        numbers = new int[]{5, 3, 8, 2, 1, 4};
        context.setStrategy(SortingStrategies.QUICK_SORT);
        context.sort(numbers);
        System.out.println("Quick Sorted: " + Arrays.toString(numbers));
    }
}
