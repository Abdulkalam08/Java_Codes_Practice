package main.trainings.ArraysPractices;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        //int arr [] = {3,9,7,10,20,4,1,8,3,2};
        int array[] = new int[6];
        array[0]=1;array[1]=1;array[2]=1;array[3]=1;array[4]=1;array[5]=1;
        int index = 2;
        int n = 6;
        int number = 17;
        for(int i=n;i<index;i--){
            array[i] = array[i-1];
        }
        array[index] = number;
        System.out.println(Arrays.toString(array));
//        int temp = arr[arr.length-1];
//        for(int i=arr.length-2;i>=0;i--) {
//            arr[i+1] = arr[i];
//        }
//        arr[0]=temp;
        //System.out.println(Arrays.toString(array));
//        for(int i=1;i<arr.length;i++){
//            arr[i-1] = arr[i];
//        }
//        arr[arr.length-1] = temp;
//        System.out.println(Arrays.toString(arr));
//        int max1 = arr[0];
//        int max2 = arr[0];
//        for(int x : arr){
//            if(x>max1){
//                max2=max1;
//                max1=x;
//            } else if (x>max2) {
//                max2=x;
//            }
//        }
//        System.out.println("First Max number is : " + max1);
//        System.out.println("Second Max number is : " + max2);
//        int max = 0;
//        for(int x : arr){
//            if(x>max){
//                max = x;
//            }
//        }
//        System.out.println("Max element in array is : " + max);
//        for(int x : arr){
//            if(x == num){
//                System.out.println("Element " + num +" is found in array");
//                System.exit(0);
//            }
//        }
//        System.out.println("Not found");
//        for(int x : arr){
//            sum+=x;
//        }
//        System.out.println("Sum of array is : " + sum);
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(arr);
    }
}
