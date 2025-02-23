package main.trainings.Methods;

public class MethodOverloading {
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static float add(float a , float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10.1f,10.2f));
        System.out.println(add(3,5,8));
    }
}
