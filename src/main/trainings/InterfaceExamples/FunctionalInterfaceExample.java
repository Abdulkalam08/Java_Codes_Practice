package main.trainings.InterfaceExamples;

@FunctionalInterface
interface FunctionalInterfaceEx {
    void show();
}

public class FunctionalInterfaceExample{
    public static void main(String[] args) {
        FunctionalInterfaceEx obj = new FunctionalInterfaceEx() {
            public void show() {
                System.out.println("Yes");
            }
        };
        obj.show();
    }
}

