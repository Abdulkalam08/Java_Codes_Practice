package main.trainings.ExceptionalHandling;
class ZeroException extends Exception{
    public String toString(){
        return "Number 0 must not be divided";
    }
}
public class ThrowEx {
    public static int meth1(int a, int b) throws ZeroException{
        if(b==0){
            throw new ZeroException();
        }
        return a/b;
    }
    public static void main(String[] args) throws ZeroException {
        meth1(10,0);
    }
}
