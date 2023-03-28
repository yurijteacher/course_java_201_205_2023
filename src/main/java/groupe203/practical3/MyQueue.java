package groupe203.practical3;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {

        // FiFo

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);

        //
        int a = queue.peek();
        System.out.println(a);
        System.out.println(queue);

        //
        int b = queue.poll();
        System.out.println(b);
        System.out.println(queue);

    }
}
