package main.trainings.Methods;

public class MaxNumberWithVarArgs {
    public static int maxOfNumber(int ...numbers){
        int maxi = 0;
        for(int i : numbers){
            if(i>maxi){
                maxi=i;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        System.out.println(maxOfNumber(10,20,3,100,45));
    }
}
