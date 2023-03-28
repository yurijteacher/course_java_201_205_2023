package groupe204.practical3;

import java.util.LinkedList;
import java.util.Queue;

public class MyFiFo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);  // 1
        queue.add(2);
        queue.add(3);

        int b = queue.poll();
        System.out.println(b);
        System.out.println(queue);

        int a = queue.peek();
        System.out.println(a);
        System.out.println(queue);












    }

}
