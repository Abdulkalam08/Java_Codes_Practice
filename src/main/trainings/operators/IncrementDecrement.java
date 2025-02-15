package main.trainings.operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5,z;
        int y = 4;
        z = 2*x++ + 3 * ++x;
        System.out.println(z);
    }
}
