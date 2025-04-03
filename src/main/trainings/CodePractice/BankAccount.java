package main.trainings.CodePractice;
class BankOperations{
    private int accountNumber;
    private int balance;

    public BankOperations(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        int depositedAmount = getBalance() + amount;
        setBalance(depositedAmount);
    }
    public void withdraw(int amount){
        if(amount<=getBalance()){
            int withdrawAmount = getBalance() - amount;
            System.out.println("Amount : " + withdrawAmount + " withdrew from the Account");
            setBalance(getBalance()-amount);
        }
    }
}
public class BankAccount {
    public static void main(String[] args) {
        BankOperations bankOperations = new BankOperations(9892829,10000);
        bankOperations.withdraw(5000);
        System.out.println(bankOperations.getBalance());
    }
}
