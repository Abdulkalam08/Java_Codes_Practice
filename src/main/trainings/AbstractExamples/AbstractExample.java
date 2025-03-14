package main.trainings.AbstractExamples;

abstract class SuperClass{

    SuperClass(){
        System.out.println("Super Class constructor");
    }

    abstract public void meth2();

    public void meth(){
        System.out.println("In Abstract Method");
    }
}

class SubClass extends SuperClass{

    @Override
    public void meth2(){
        System.out.println("In Subclass Meth 2");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        superClass.meth();
        superClass.meth2();
    }
}
