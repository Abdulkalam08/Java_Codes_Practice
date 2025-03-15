package main.trainings.MultiThreadingConcepts;

class Consumer extends Thread{
    MyData myData;
    Consumer(MyData myData){
        this.myData = myData;
    }
    public void run(){
        int value;
        while (true){
            value = myData.getCount();
            System.out.println("Consumer : "+value);
        }
    }
}
class Producer extends Thread{
    MyData myData;
    Producer(MyData myData){
        this.myData = myData;
    }
    public void run(){
        int value=1;
        while (true){
            myData.setCount(value);
            System.out.println("Producer : "+ value);
            value++;
        }

    }
}
class MyData{

    int count;
    boolean flag = true;
    synchronized void setCount(int count){
        while(flag!=true){
            try{wait();}catch (Exception e){System.out.println(e);};
        }
        this.count = count;
        flag=false;
        notify();
    }
    synchronized int getCount(){
        while(flag!=false){
            try{wait();}catch (Exception e){System.out.println(e);};
        }
        flag=true;
        notify();
        return count;
    }
}
public class InterThreadCommunicationEx {
    public static void main(String[] args) {
        MyData myData = new MyData();

        Producer producer = new Producer(myData);
        Consumer consumer = new Consumer(myData);

        producer.start();
        consumer.start();
    }
}
