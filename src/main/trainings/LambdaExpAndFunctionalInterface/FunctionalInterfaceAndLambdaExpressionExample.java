package main.trainings.LambdaExpAndFunctionalInterface;

@FunctionalInterface
interface RunnableInterface{
    void run();
}

@FunctionalInterface
interface ReturnType{
    public int add(int a,int b);
}

public class FunctionalInterfaceAndLambdaExpressionExample {
    public static void main(String[] args) {
        RunnableInterface runnableInterface = () -> {System.out.println("Run method called");};
        runnableInterface.run();

        ReturnType returnType = (a,b) -> a+b;
        System.out.println(returnType.add(10,20));
    }
}
