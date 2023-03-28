package groupe204.practical3;

import java.util.Stack;

public class MyLiFo {


    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // stack.peek();
        int a = stack.peek();
        System.out.println(a);
        System.out.println(stack);

        int b = stack.pop();
        System.out.println(b);
        System.out.println(stack);

    }

}
