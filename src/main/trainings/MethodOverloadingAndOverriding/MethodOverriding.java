package main.trainings.MethodOverloadingAndOverriding;

class Parent{
    public Parent(){
        System.out.println("Parent Constructor called");
    }
    public void display(){
        System.out.println("Display method in Parent");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor called");
    }
    public void display(int x){
        System.out.println("Display method in Child");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Parent parent1 = new Child(); //Dynamic method dispatch
        parent1.display();
    }
}
