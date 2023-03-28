package groupe201.practical2;

import java.util.Stack;

public class MyStackLiFo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int a = stack.pop();
        System.out.println("el1 = " + a);
        System.out.println(stack);


        int b = stack.peek();
        System.out.println("el2 = " + b);

        System.out.println(stack);

    }
}
