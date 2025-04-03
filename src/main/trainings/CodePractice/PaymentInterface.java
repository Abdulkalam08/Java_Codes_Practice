package main.trainings.CodePractice;

import main.trainings.Loops.PatternExample;

public interface PaymentInterface {
    void pay();
}
class DebitCardPayment implements PaymentInterface{

    @Override
    public void pay(){
        System.out.println("Payment successful through debit card");
    }
}
class CreditCardPayment implements PaymentInterface{

    @Override
    public void pay(){
        System.out.println("Payment successful through credit card");
    }
}
class Main{
    public static void main(String[] args) {
        PaymentInterface paymentInterface1 = new DebitCardPayment();
        PaymentInterface paymentInterface2 = new CreditCardPayment();
        paymentInterface1.pay();
        paymentInterface2.pay();
    }
}
