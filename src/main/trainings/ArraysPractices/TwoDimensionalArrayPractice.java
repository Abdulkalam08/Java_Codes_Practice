package main.trainings.ArraysPractices;

import java.util.Arrays;

public class TwoDimensionalArrayPractice {
    public static void main(String[] args) {
       // int arr1[][];
        //arr1 = new int[][]{{1,2,4},{5,8,20},{9,10,12}};
        //int arr2[][];
        //arr2 = new int[][]{{1,2,4},{5,8,20},{9,10,12}};
//        int[][] arr3 = new int[3][3];
//        for(int i=0;i< arr1.length;i++){
//            for(int j=0;j<arr1[i].length;j++){
//                arr3[i][j] = arr1[i][j]+arr2[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(arr3));
        //int[][] arr3 = new int[3][3];
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};

        int C[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {

                for(int k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }

        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }

    }
}
