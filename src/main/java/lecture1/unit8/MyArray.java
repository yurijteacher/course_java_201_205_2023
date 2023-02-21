package lecture1.unit8;

import java.util.ArrayList;
import java.util.List;

public class MyArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ivanka");
        list.add("Vasya");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int i = 0;
        for (; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        i = 0;
        for (; i < list.size(); ) {
            System.out.println(list.get(i));
            i++;
        }

        i=0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        i=0;
        do {
            System.out.println(list.get(i));
            i++;
        } while (i < list.size());


        // Set

        // Map

    }


}
