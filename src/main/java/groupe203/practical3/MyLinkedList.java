package groupe203.practical3;

import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();

        list.add(1); // 0
        list.add(2); // 1
        list.add(3); // 2

        list.addFirst(4);
        list.addLast(5);

        list.removeLast();
        list.removeFirst();

        System.out.println(list);

    }

}
