package main.trainings.CodePractice;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();
        if(isPrime(prime)){
            System.out.println("Given number : " + prime + " is not a Prime number");
        }else{
            System.out.println("Given number : " + prime + " is a Prime number");
        }
    }
    public static boolean isPrime(int prime){
        boolean flag = false;
        for(int i=2; i<prime/2;i++){
            if(prime%i==0){
                flag = true;
            }
        }
        return flag;
    }
}
