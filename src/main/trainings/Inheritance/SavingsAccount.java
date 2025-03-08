package main.trainings.Inheritance;

public class SavingsAccount extends Account{

    public SavingsAccount(int accNumber, String name, String address, String dob, String number, int balance) {
        super(accNumber, name, address, dob, number, balance);
    }
    public void deposit(int amount){
        setBalance(amount+getBalance());
        System.out.println("Amount added to the account "+ amount);
    }
    public void withdraw(int amount){
        if(amount <= getBalance()){
            setBalance(amount-getBalance());
        }
        else{
            System.out.println("insufficient Balance");
        }
    }
}
