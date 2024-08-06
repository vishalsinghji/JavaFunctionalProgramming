import java.util.HashMap;
import java.util.Arrays;

public class DiceCombinations {
    public static int countDiceCombinations(int n) {
        HashMap<String, Integer> memo = new HashMap<>();
        return helper(n, 0, memo);
    }

    private static int helper(int diceLeft, int currentSum, HashMap<String, Integer> memo) {
        if (diceLeft == 0) {
            return 1;
        }

        String key = diceLeft + "_" + currentSum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int total = 0;
        for (int i = 1; i <= 6; i++) {
            total += helper(diceLeft - 1, currentSum + i, memo);
        }

        memo.put(key, total);
        return total;
    }

    public static void main(String[] args) {
        int n = 2; // Change this to test with different number of dice
        int distinctCombinations = countDiceCombinations(n) / factorial(n); // To account for permutations
        System.out.println("Total distinct combinations: " + distinctCombinations);
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
