package Streams.Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterOperation {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        list.stream().filter(e->e%2==0)
                        .forEach(System.out::println);

        Stream.of(34,678,89,4,52,31,325,6)
                .filter(e -> e%2 == 0)
                .forEach(System.out::println);


    }
}