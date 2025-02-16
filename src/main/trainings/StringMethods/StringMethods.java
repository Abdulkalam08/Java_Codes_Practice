package main.trainings.StringMethods;

public class StringMethods {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        byte[] arr2 = {65,66,67,68,69};
        String s = "Java";
        String d = new String(s);
        //System.out.println(s==d);
        //String str = new String(arr);
        //String str2 = new String(arr2);
        //System.out.println(str);
        //System.out.println(str2);
        /*
        String methods
        */
        String str = "Java Program";
        String str1 = new String(str);
        //System.out.println(str.toUpperCase());
        //System.out.println(str.toLowerCase());
        //System.out.println(str.startsWith("Java"));
        //System.out.println(str.lastIndexOf("gram"));
        System.out.println(str.equals(str1));
        System.out.println(str == str1);
    }
}
