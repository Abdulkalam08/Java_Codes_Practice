package main.trainings.DailyPractice;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int vow = 0,cons=0;
        String vowels = "aeiou";
        for(char ch : str.toCharArray()){
            if(vowels.indexOf(ch)>=0){
                vow++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Vowels count : "+ vow + " & Consonants count : "+ cons);
    }
}
