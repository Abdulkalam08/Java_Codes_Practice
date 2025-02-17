package main.trainings.Loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LoopsExamples {
    public static void main(String[] args) {
//        List<Object> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add("Abk");
//        for(Object val : list){
//            System.out.print(val + " ");
//        }
//        Random random = new Random();
//        int num = random.nextInt(100);
//        int count = 0;
//        while(num!=98){
//            System.out.println(num);
//            count+=1;
//            num = random.nextInt(100);
//        }
//        System.out.println("Random number is :" + num + " and iteration took is : " + count);

//        int num = 10;
//        for(int i=num;i>=0;i--){
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
//        int num = sc.nextInt();
//        int sum = 0;
////        for(int i=0;i<=10;i++){
////            System.out.println(num+"x"+i+" = " + (num*i));
////        }
//        for(int i=0;i<=num;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
//        for(int i=1;i<=num;i++){
//            sum = sum*i;
//        }
//        System.out.println("Factorial of "+num + " is : " +sum);
//        while(num>0){
//            int numb = num%10;
//            num = num/10;
//            System.out.println(numb);
//        }
//        int number = sc.nextInt();
//        int sumOfNumber = 0;
//        while(number>0){
//            int number1 = number%10;
//            sumOfNumber+=number1;
//            number=number/10;
//        }
//        System.out.println(sumOfNumber);
//        int number = sc.nextInt();
//        int product = 1,count=0;
//        int m=number;
//        while(number>0){
//            int number1 = number%10;
//            product= (int) Math.pow(number1,3);
//            count = count+product;
//            number=number/10;
//        }
//        if(count==m){
//            System.out.println("The given number : "+m+ " is armstrong number");
//        }
//        else {
//            System.out.println("This is not an armstrong number");
//        }
        int a = 0, b = 1 ,c;
        int num = sc.nextInt();
        System.out.print(a + " " + b);
        for(int i=0;i<num-2;i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}