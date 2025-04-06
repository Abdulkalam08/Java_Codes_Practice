package main.trainings.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReferenceEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");

        List<String> stringStream = names.stream()
                        .map(String::toUpperCase) //It will call the toUppercase method with method reference
                                .toList();

        //names.forEach(String::toUpperCase);
        stringStream.forEach(System.out::println); //It will print all the values
    }
}
