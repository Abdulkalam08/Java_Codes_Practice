package main.trainings.Inheritance;

public class Runner{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(123456,"Abdul",
                "Madurai","08-07-2002","8056734990",100000);
        savingsAccount.deposit(10000);
        savingsAccount.withdraw(10000000);
    }
}
