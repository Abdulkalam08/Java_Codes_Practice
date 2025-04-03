package main.trainings.CodePractice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibonacci = sc.nextInt();
        int a=0,b=1, fibo;
        if(fibonacci == 0){
            System.out.println("Fibonacci series of : + " +fibonacci + "is 0");
        }
        if(fibonacci ==1){
            System.out.println("Fibonacci series of : + " +fibonacci + "is 1");
        }
        else{
            System.out.print("Fibonacci series of : " +fibonacci + " is : ");
            System.out.print(a + " ");
            System.out.print(b + " ");
            for(int i=2; i<fibonacci; i++){
                fibo = a+b;
                System.out.print(fibo + " ");
                a = b;
                b= fibo;
            }
        }
    }
}
