package groupe203.practical3;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {

        // LiFo

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        int a = stack.pop();
        System.out.println(a);
        System.out.println(stack);

        int b = stack.peek();
        System.out.println(b);
        System.out.println(stack);


    }
}
