package main.trainings.StringMethods;

public class RegularExpression {
    public static void main(String[] args) {
        //String str = "f";
        //System.out.println(str.matches(".")); //It must be anything from keyboard but 1 character
        //String str = "a";
        //System.out.println(str.matches("[abc]")); //it must be any one of the characters inside this pattern
        //String str = "f";
        //System.out.println(str.matches("[^abc]")); //Opposite to above scenario
        //String str = "a";
        //System.out.println(str.matches("[a-z0-9]"));
        //String str = "aB9";
        //System.out.println(str.matches("[a-zA-Z][A-Z][0-9]"));
        String str = "abkalam@deloitte.com";
        System.out.println(str.matches("[a-zA-Z0-9]*[@]"));
    }
}
