package groupe205.practical2;

import groupe203.practical1.realization_interface.Information;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyList {

    public static void main(String[] args) {

        String[] arr = new String[5];
        arr[0] = "Ivan";
       // arr[5] = "Vanya";

        String[] arr1 = {"Ivanna","Iva","Ivan"};

        arr1[0]="Vasya";
        arr1[1]="Ivan";
        arr1[2]="Iva";

        // while
        // for
        // do-while

        // for
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // while
        int i = 0;
        while (i < arr1.length) {
            System.out.println(arr1[i]);
            i++;
        }

        // do-while
        i = 0;
        do {
            System.out.println(arr1[i]);
            i++;
        } while (i < arr1.length);

        // Stream - forEach
        Arrays.stream(arr1).forEach(e->{
            System.out.println(e);
        });

        // Arrays.toString(arr1);
        System.out.println("Arrays.toString(arr):" + Arrays.toString(arr1));


        int[][] arr2 = new int[5][5];

        for (i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j]= new Random().nextInt(101);
            }
        }

        for (i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        int[][][] arr3 =new int[5][5][5];


        double[] arr4 = {2.2, 2.34, 4.2};

        System.out.println(
                Arrays.toString(arr4)
        );


        for (i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

        // while
        // do-while


        List<Integer> list = List.of(1,2,3,4,5); // static el
        // list.add(6);

        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        // .add - додавання нового елемента в колекцію
        list1.add(1); // 0
        list1.add(2); // 1
        list1.add(3); // 2
        list1.add(1); // 3

        list1.add(4); // 4

        int sizeList = list1.size();

        for (int j = 0; j < list1.size(); j++) {
            System.out.println(list1.get(j));
        }

        System.out.println(list1.get(1)); // 0..2 el

        int index = list1.indexOf(1);
        System.out.println("index=" + index);

        System.out.println("print:" + list1);


        // v.7 -
        for (Integer el : list1) {
            System.out.println(el);
        }

        list1.stream().forEach(System.out::println);

        list1.stream().forEach(el->{ System.out.println(el); });

        // заміна
        list1.set(1,100);

        // додавання за індексом
        list1.add(1,200);
        System.out.println(list1);

        System.out.println(list1.get(0));
        System.out.println(list1.get(list1.size()-1));

        // видалення ел за індексом
        list1.remove(1);
        System.out.println(list1);

        // очистка
        list1.clear();

        System.out.println("clear" + list1);
    }

}
