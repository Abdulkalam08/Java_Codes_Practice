package main.trainings.MultiThreadingConcepts;

class MyThread1 extends Thread{
    public void run(){
        Test test1 = new Test();
        test1.display("Hello World");
    }
}
class MyThread2 extends Thread{
    public void run(){
        Test test2 = new Test();
        test2.display("Welcome");
    }
}
class Test{
    synchronized void display(String name){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread2.start();
        myThread1.start();
    }
}
