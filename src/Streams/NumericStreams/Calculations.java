package Streams.NumericStreams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Calculations {
    public static void main(String[] args) {

//        IntStream
//        DoubleStream
//        LongStream

//        Sum
        int sum = IntStream.of(1,2,3).sum();
        System.out.println(sum);

//        max() Optional : primitive

        OptionalInt maxOptional = IntStream.of().max();
        System.out.println(maxOptional);

//        min() Optional : primitive

        OptionalInt minOptional = IntStream.of(1,5,6).max();
        System.out.println(minOptional.getAsInt());

//        average() OptionalDouble

        OptionalDouble averageOptional = IntStream.of(1,5,6).average();
        System.out.println(averageOptional.getAsDouble());

//        summaryStatistics()

         IntSummaryStatistics summaryStatistics  = IntStream.of(1,2,3,4)
                .summaryStatistics();
        System.out.println(summaryStatistics);

    }
}
