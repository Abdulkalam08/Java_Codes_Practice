package main.trainings.InterfaceExamples;

@FunctionalInterface
interface A{
    void show();
}
public class LambdaEx {
    public static void main(String[] args) {
        A obj = () -> System.out.println("In Lambda expression");

        obj.show();
    }
}
