package main.trainings.DailyPractice;

import java.util.Scanner;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        boolean isPrime = false;
        if(num<=1){isPrime=false;}
        if(num==2 || num==3){isPrime=true;}
        else{
            for(int i=2;i<num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
                isPrime=true;
            }
        }
        if(isPrime) System.out.println("The number : "+ num + " is prime number");
        else System.out.println("The number : "+ num + " is not a prime number");
    }
}
