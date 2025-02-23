package main.trainings.Recursion;

public class RecursiveExample {
    static void rec1(int n){
        if(n>0){
            System.out.println(n);
            rec1(n-1);
        }
    }
    static void rec2(int n){
        if(n>0){
            rec2(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        rec1(5);
        rec2(5);
    }
}
