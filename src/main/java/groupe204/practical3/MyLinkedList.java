package groupe204.practical3;

import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.add(1);

        System.out.println(list1);

        list1.addFirst(10);
        list1.addLast(0);

        System.out.println(list1);

        list1.removeFirst();
        list1.removeLast();

    }
}
