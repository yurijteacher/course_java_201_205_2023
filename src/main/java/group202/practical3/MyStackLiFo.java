package group202.practical3;

import java.util.Stack;

public class MyStackLiFo {


    public static void main(String[] args) {

        // LiFo

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //
        int a =  stack.pop();
        System.out.println(stack);

        int b = stack.peek();

        System.out.println("b=" + b +"," + stack);

        stack.remove(1);
        stack.clear();

    }


}
