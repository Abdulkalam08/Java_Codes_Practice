package main.trainings.SingleTonExample;

class CoffeeMachine{
    private final float milkQuantity;
    private final String flavour;
    private static CoffeeMachine cm = null;

    private CoffeeMachine(){
        milkQuantity=1;
        flavour="Cappucino";
    }

    public void getCoffee(){
        System.out.println("Coffee flavour is : " +flavour+ " and the milk quantity available is : "+milkQuantity);
    }

    public static CoffeeMachine getInstance(){
        if(cm==null){
            cm = new CoffeeMachine();
        }
        return cm;
    }
}

public class SingletonEx {
    public static void main(String[] args) {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();
        if(m1==m2 && m1==m3){
            System.out.println("Objects are same reference");
        }
        System.out.println(m1);
        m1.getCoffee();
    }
}
