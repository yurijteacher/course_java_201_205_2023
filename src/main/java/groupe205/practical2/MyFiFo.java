package groupe205.practical2;

import java.util.LinkedList;
import java.util.Queue;

public class MyFiFo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        // отримання першого елементу з колекції
        System.out.println(queue.peek());

        System.out.println(queue);

        // прибрати перший елемент з колекції
        System.out.println(queue.poll());

        System.out.println(queue);

    }
}
