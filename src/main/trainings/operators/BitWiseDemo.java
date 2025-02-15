package main.trainings.operators;

public class BitWiseDemo {
    public static void main(String[] args) {
        int a = 0b1010;
        int b = 0b0110;
        int c = a&b;
        int d = a|b;
        int e = a^b;
        int f = a<<2;
        int g = a>>2;
        int h = ~a;
        System.out.println("a&b = "+ c + " \na|b = "
                + d + " \na^b = " + e + " \na<<2 = " +
                f + " \na>>2 = " + g + " \n~a = " + h);
        System.out.println("Hello");
    }
}
