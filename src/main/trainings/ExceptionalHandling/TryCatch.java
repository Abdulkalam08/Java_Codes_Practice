package main.trainings.ExceptionalHandling;

public class TryCatch {
    public static void main(String[] args) {
        int a=10,b=0,c;
        try{
            c=a/b;
        } catch (Exception e) {
            System.out.println("Error is : "+e.getMessage());
        }
        finally {
            System.out.println("Final Statement before closing the class");
        }
    }
}
