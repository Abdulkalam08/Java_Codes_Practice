package main.trainings.CollectionFrameworks;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        //hs.add(20);
        hs.remove(10);
        var name = hs.stream().spliterator();
        //System.out.println(name.getExactSizeIfKnown());

        //System.out.println("HashSet : " + hs);

        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,2,3));

        System.out.println("TreeSet : " + ts);
    }
}
