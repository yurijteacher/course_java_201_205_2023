package groupe203.practical3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class MyArrays {

    public static void main(String[] args) {


        int[] array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        // array[5] = 6;

        System.out.println(array);

        System.out.println(Arrays.toString(array));

        // for
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // while
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }

        // do-while
        i = 0;
        do {
            System.out.println(array[i]);
            i++;
         } while (i < array.length);

        int[] array1 = {1,2,3,4,5,6,7};

        array1[0] = 1000; // 1000,2,3,4,5,6,7

        System.out.println(Arrays.toString(array1));


        int[][] arr = new int[5][5];

        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                arr[j][k] = new Random().nextInt(100);
            }
        }

        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                System.out.print(arr[j][k] + ", ");
            }
            System.out.println();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }

        arr[0][0] = 100;
        arr[4][4] = 100;


        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }


        Long[][][] array2 = new Long[5][5][5];


        Objects[] array3 = new Objects[3];


    }

}
