package main.trainings.MultiThreadingConcepts;

class Customer extends Thread{
    Atm atm;
    int amount;
    String name;

    public Customer(Atm atm, int amount,String name){
        this.amount = amount;
        this.name = name;
        this.atm=atm;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.withdrawAmount(name,amount);
    }
    public void run(){
        useATM();
    }
}
class Atm{
    synchronized void checkBalance(String name){
        System.out.println("Checking Balance : "+ name);
    }
    synchronized void withdrawAmount(String name, int amount){
        System.out.println(name + " Withdrawing amount : "+ amount);
    }
}
public class SynchronizedEx {
    public static void main(String[] args) {
        Atm atm = new Atm();
        Customer customer1 = new Customer(atm,1000,"Abdul");
        Customer customer2 = new Customer(atm,10000,"Kalam");

        customer1.start();
        customer2.start();
    }
}
