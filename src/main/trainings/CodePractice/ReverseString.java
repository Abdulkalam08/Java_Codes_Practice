package main.trainings.CodePractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        System.out.println("Reversed String of : " + str + " is : " + rev);
    }
}
