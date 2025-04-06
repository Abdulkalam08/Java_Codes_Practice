package main.trainings.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FIndFirstFindAnyEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack");

        Optional<String> any = names.stream().findAny();

        //any.ifPresent(System.out::println);

        List<String> names2 = Arrays.asList("John", "Jane", "Jack");

        Optional<String> any2 = names2.stream().findFirst();

        //any2.ifPresent(System.out::println);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Using findFirst with a parallel stream
        Optional<Integer> firstParallel = numbers.parallelStream().findFirst();
        firstParallel.ifPresent(System.out::println); // Output: 1 (always the first element)

// Using findAny with a parallel stream
        Optional<Integer> anyParallel = numbers.parallelStream().findAny();
        anyParallel.ifPresent(System.out::println); // Output: Can be any element, e.g., 1, 2, 3, etc.

    }
}
