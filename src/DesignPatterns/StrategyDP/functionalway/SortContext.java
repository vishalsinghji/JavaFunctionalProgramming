package DesignPatterns.StrategyDP.functionalway;

public class SortContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] numbers) {
        if (strategy != null) {
            strategy.sort(numbers);
        } else {
            throw new IllegalStateException("Sorting strategy not set.");
        }
    }
}
