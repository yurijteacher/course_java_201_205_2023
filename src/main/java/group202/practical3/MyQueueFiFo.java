package group202.practical3;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueueFiFo {

    public static void main(String[] args) {

        // FiFo
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        int a =  queue.poll();
        System.out.println(queue);

        int b = queue.peek();

        System.out.println("b=" + b +"," + queue);

        queue.remove(1);
        queue.clear();

    }



}
