package main.trainings.DailyPractice;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is Even number");
        }
        else {
            System.out.println(num + " is Odd number");
        }
    }
}
