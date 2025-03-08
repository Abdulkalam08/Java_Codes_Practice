package main.trainings.Inheritance;

public class Account {
    private final int accNumber;
    private String name;
    private String address;
    private String dob;
    private String number;
    private int balance;

    public int getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(int accNumber, String name, String address, String dob, String number, int balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.number = number;
        this.balance = balance;
    }
}
