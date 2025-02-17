package main.trainings.conditionalStatements;

public class ConditionalStatementsExamples {
    public static void main(String[] args) {
        int a=10,b=15,c=20;
        if(a>b){
            System.out.println("b less than a");
        }
        else if(c>a){
            if(b>a){
                System.out.println("inside nested if");
            } else if (a>c) {
                System.out.println("Inside nested Else if");
            }
        }
    }
}
