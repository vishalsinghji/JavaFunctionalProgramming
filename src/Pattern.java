import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int n = scanner.nextInt();

        printPattern(3);

        scanner.close();
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int distance = Math.max(Math.abs(i - n), Math.abs(j - n));

                if (distance == 0 || distance == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(n - distance);
                }
            }
            System.out.println();
        }
    }
}
