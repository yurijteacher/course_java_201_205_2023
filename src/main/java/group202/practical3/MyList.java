package group202.practical3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        // ArrayList

        List<Integer> list = List.of(1,2,3,4);
        // list.add(5);
        System.out.println(list);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        list1.add(4);


        list1.set(0, 5);
        list1.remove(2);



        int a = list1.get(0);
        System.out.println(a);

        list1.clear();

        System.out.println(list1);


        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.addFirst(0);
        linkedList.addLast(4);

        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();



    }


}
