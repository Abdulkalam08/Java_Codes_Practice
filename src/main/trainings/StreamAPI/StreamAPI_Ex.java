package main.trainings.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI_Ex {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10,3,1,0,15,19,2);

        Stream<Integer> stream = nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .sorted();

        stream.forEach(n -> System.out.println(n));


    }
}
