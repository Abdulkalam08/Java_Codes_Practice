package main.trainings.operators;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double root1 = (-b + Math.sqrt(b*b -4*a*c))/(2*a);
        double root2 = (-b - Math.sqrt(b*b -4*a*c))/(2*a);
        System.out.println(root1 + " " + root2);
    }
}
