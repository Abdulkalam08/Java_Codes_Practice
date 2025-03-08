package main.trainings.Inheritance.This;
class SuperClass{
    public SuperClass(){
        System.out.println("Super Class");
    }
}
class SubClass extends SuperClass{
    private String message;

    public SubClass(){
        this("This message is coming from Parameterized constructor from default constructor");
        System.out.println("Sub Class");
    }
    public SubClass(String message){
        System.out.println(message);
    }
}
public class ThisExample {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
    }
}
