package main.trainings.ExceptionalHandling;

import java.util.Stack;

class StackOverFlowException extends Exception{

    public String toString() {
        return "Stack is Full";
    }
}
class StackUnderFlowException extends Exception{

    public String toString() {
        return "Stack is Empty";
    }
}

public class ExampleForStackException {
    int size = 5;
    int top = 0;

    public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(10);
    }
}
