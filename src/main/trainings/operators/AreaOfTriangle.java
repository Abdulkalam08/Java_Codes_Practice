package main.trainings.operators;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        float area = 0.5f * a * b;
        System.out.println("Area of triangle is " +area);
    }
}
