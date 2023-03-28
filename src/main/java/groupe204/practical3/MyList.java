package groupe204.practical3;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {


        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list);

        //list.add(5);

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        list1.set(0,10); //10,2,3

        list1.remove(2); // 10,2

        System.out.println(list1);

        list1.add(0,100); // 100,10,2

        System.out.println(list1);

        list1.clear();

        ArrayList<Integer> arrayList = new ArrayList<>();

    }

}
