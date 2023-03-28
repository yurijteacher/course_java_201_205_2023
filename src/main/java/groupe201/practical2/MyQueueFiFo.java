package groupe201.practical2;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueueFiFo {

    public static void main(String[] args) {

       // el1 - el2 - el3
       // el1
       // el2

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);

        int a = queue.poll();
        System.out.println("el1 = " + a);
        System.out.println(queue);


        int b = queue.peek();
        System.out.println("el2 = " + b);

        System.out.println(queue);








    }



}
