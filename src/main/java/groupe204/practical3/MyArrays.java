package groupe204.practical3;

import java.util.Arrays;
import java.util.Random;

public class MyArrays {

    public static void main(String[] args) {

        String[] array = new String[5];
        array[0] = "Ivan";
        array[1] = "Vasya";
        array[2] = "Ivanka";
        array[3] = "Iva";
        array[4] = "Qwe";

        // array[5] = "asd";
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

        // do{}while()
        i = 0;
        do{
            System.out.println(array[i]);
            i++;
        }while (i < array.length);

        System.out.println(array[3]);

        int[] array2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array2));

        array2[0] = 10;


        //

        int[][] arr = {{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int[][] arr2 = new int[4][4];

        for (int j = 0; j < arr2.length; j++) {
            for (int k = 0; k < arr2[j].length; k++) {
                arr2[j][k]=new Random().nextInt(101);
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            for (int k = 0; k < arr2[j].length; k++) {
                System.out.print(arr2[j][k] + ", ");
            }
            System.out.println();
        }


        for (int j = 0; j < arr2.length; j++) {
            System.out.println(">>" + Arrays.toString(arr2[j]));
        }


        int[][][] arr3 = new int[4][4][4];

    }

}
