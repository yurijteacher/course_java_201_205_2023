package groupe205.practical2;

import java.util.Stack;

public class MyLiFo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);


        int i = stack.pop();
        System.out.println(i);
       //  System.out.println(stack.pop());
        System.out.println(stack);


        System.out.println(stack.peek());
        System.out.println(stack);



    }
}
