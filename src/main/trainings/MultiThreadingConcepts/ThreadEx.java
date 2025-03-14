package main.trainings.MultiThreadingConcepts;

class ThreadExample extends Thread{
    public void run(){
        System.out.println("Run Method in ThreadExample class");
    }
}

class RunnableExample implements Runnable{

    public void run() {
        System.out.println("Run method in RunnableExample Class");
    }
}
public class ThreadEx {
    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        threadExample.start();
        RunnableExample runnableExample = new RunnableExample();
        Thread thread = new Thread(runnableExample);
        thread.start();
    }
}
