package main.trainings.CodePractice;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int vowels = 0,consonants = 0;
        char[] cr = str.toCharArray();
        for(char ch : cr){
            if(ch!= ' '){
                if("aeiou".indexOf(ch)!=-1){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Given String contains : "+ vowels +" vowels and : " + consonants + " consonants");
    }
}
