package main.trainings.Methods;

public class VariableArgs {

    public static void example(int num, String ...str){
        for(String x : str){
            System.out.println(num+ " "+ x);
        }
    }
    public static void main(String[] args) {
        example(1,"Abdul","Kalam","Working", "Deloitte");
    }
}
