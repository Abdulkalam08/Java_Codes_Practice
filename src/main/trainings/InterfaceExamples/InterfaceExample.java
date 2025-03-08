package main.trainings.InterfaceExamples;

public interface InterfaceExample {

    void run();
    void play();

}

class Action implements InterfaceExample{

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }
}
class Main{
    public static void main(String[] args) {
        InterfaceExample interfaceExample = new Action();
        interfaceExample.play();
        interfaceExample.run();
    }
}

