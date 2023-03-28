package groupe201.practical2;

import java.util.*;

public class MyList {


    public static void main(String[] args) {

        //
        int[] array = {1, 2, 3, 4, 5};

        int[] array1 = new int[5];
        array1[0] = 1;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 6;
        array1[1] = 7;

        // for
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ",");
        }

        System.out.println();
        int i = 0;
        // while
        while (i < array1.length) {
            System.out.print(array1[i] + ",");
            i++;
        }

        System.out.println();
        i = 0;
        // do-while
        do{
            System.out.print(array1[i] + ",");
            i++;
        } while (i < array1.length);


        System.out.println("\n" + Arrays.toString(array1));

        System.out.println(Arrays.stream(array1).sum());

        System.out.println(Arrays.stream(array1).max());

        System.out.println(Arrays.stream(array1).min());

        Arrays.stream(array1).forEach(e->{ System.out.println(e); });

        Arrays.stream(array1).forEach(System.out::println);


        int [][] arr = new int[5][5];

        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                arr[j][k] = new Random().nextInt(101);
            }
        }


        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                System.out.print(arr[j][k] + ",");
            }
            System.out.println();
        }


        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }

        arr[0][0] = 5;

        String[][][] arr2 = new String[3][4][5];

        // List

        List<Integer> stringList = List.of(1,2,3,4,5);
        // stringList.add(6);
        System.out.println(stringList);


        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(0, 10); // 10, 1, 2, 3

        list.set(1, 100);  // 10, 100, 2, 3

        list.remove(1); // 10, 2, 3

        // list.clear();

        System.out.println(list.get(0));


        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.get(0);
        linkedList.set(1,3);
        linkedList.remove(1);
        linkedList.addFirst(4);
        linkedList.addLast(4);


        Student s5 = new Student();


        System.out.println(linkedList);
    }
}
