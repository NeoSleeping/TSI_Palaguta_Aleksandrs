package lv.tsi.practice2.exercise1_2_3_4;

import java.util.Arrays;
import java.util.List;

public class ListProcessingWithStreams {

    public static void main(String[] args) {
        final List<String> list = Arrays.asList("a1", "c3", "a2",
                                                "a3", "b3", "b2",
                                                "c1", "c2", "b1");

        System.out.println("=========Exercise1=========");
        list.stream()
                .findFirst()
                .ifPresent(System.out::print);

        System.out.println("\n=========Exercise2=========");
        list.stream()
                .map(String::toUpperCase)
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\n=========Exercise3=========");
        list.stream()
                .filter(e -> e.startsWith("b"))
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\n=========Exercise4=========");
        list.stream()
                .filter(e -> e.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(e -> System.out.print(e + " "));
    }
}


