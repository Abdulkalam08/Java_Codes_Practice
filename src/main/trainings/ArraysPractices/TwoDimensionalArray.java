package main.trainings.ArraysPractices;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int arr[][];
        arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8,20}, {9, 10, 12}};
        for(int x[]: arr){
            for(int y : x){
                System.out.print(y +" ");
            }
            System.out.println(" ");
        }
//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("\n");
//        }
    }
}
