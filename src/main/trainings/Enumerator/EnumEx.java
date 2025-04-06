package main.trainings.Enumerator;

import java.util.Arrays;

enum Dept{

    CS("Anbumani","A Block"),IT("Manivannan","B Block"),EEE("Sivakumar","C Block"),ECE("Mohanavel","D Block");

    String head;
    String location;
    private Dept (String head,String location){
        this.head = head;
        this.location = location;
    }
    public String getHead(){
        return head;
    }
    public String getLocation(){
        return location;
    }
}

public class EnumEx {
    public static void main(String[] args) {
        Dept dept = Dept.EEE;
        Dept [] arr = Dept.values();
        System.out.println(dept.getHead());
        System.out.println(dept.getLocation());
        System.out.println(Arrays.toString(arr));
    }
}
