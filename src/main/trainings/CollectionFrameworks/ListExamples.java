package main.trainings.CollectionFrameworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al1 = new ArrayList<>(10);
        ArrayList <Integer> al2 = new ArrayList<>(List.of(30,40,50,60));
        al1.add(10);
        al1.add(1,100);
        al1.addAll(al2);
        al1.set(1,20);
//        System.out.println("ArrayList 1 : " + al1);
//        System.out.println("ArrayList 2 : " + al2);

        LinkedList <Integer> al3 = new LinkedList<>();
        LinkedList <Integer> al4 = new LinkedList<>(List.of(30,40,50,60));
        al3.add(10);
        al3.add(1,100);
        al3.addAll(al4);
        al3.set(1,20);
        System.out.println("Peek : " + al3.peek());
        System.out.println("Pop : " + al3.pop());

        System.out.println("LinkedList 1 : " + al3);
        System.out.println("LinkedList 2 : " + al4);

    }
}
