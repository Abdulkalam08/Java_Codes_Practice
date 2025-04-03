package main.trainings.CodePractice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int total=0;
        while(num>0){
            int l = num%10;
            total += (int) Math.pow(l,3);
            num/=10;
        }
        if(total==num1) {
            System.out.println("Given number : " + num1 +" is an armstrong number");
        }
        else{
            System.out.println("Given number : " + num1 +" is not an armstrong number");
        }
    }
}
