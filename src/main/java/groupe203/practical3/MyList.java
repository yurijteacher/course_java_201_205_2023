package groupe203.practical3;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4);

        System.out.println(list);

       // list.add(5);

       // System.out.println(list);


        List<Integer> list1 = new ArrayList<>();

        list1.add(1); // 0
        list1.add(2); // 1 index
        list1.add(3); // 2

        list1.set(1, 11);

        list1.add(0, 1000);
        System.out.println(list1);  //1000,1,11,3

        list1.remove(2);
        System.out.println(list1);

        list1.clear();
        System.out.println(list1);

        list1.add(1); // 0
        list1.add(2); // 1 index
        list1.add(3); // 2
        list1.add(1); // 3
        list1.add(2); // 4
        list1.add(3); // 5

        System.out.println(list1);

    }
}
