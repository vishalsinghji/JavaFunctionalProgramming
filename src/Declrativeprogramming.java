import java.util.stream.IntStream;

public class Declrativeprogramming {
    public static void main(String[] args) {
        int sumOfEvens=0;
        sumOfEvens= IntStream.rangeClosed(0,100)
                .filter(i -> i%2==0)
                .reduce((x,y)->x+y)
                .getAsInt();
        System.out.println(sumOfEvens);
    }
}
