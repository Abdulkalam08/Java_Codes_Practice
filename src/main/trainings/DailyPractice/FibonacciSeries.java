package main.trainings.DailyPractice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0, b=1,sum;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<num;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }
    }
}
