package Streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

    public static void main(String[] args) {

        Stream.iterate(0, i -> i+1);

//		IntStream.iterate(5, i -> i -1 )
//		.limit(15)
//		.forEach(System.out::println);

        Stream.generate(new Random() :: nextInt)
                .limit(5)
                .forEach(System.out::println);
        IntStream.iterate(5,i -> i+2)
                .forEach(System.out::println);

    }

}
