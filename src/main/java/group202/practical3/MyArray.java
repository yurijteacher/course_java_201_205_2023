package group202.practical3;

import java.util.Arrays;
import java.util.Random;

public class MyArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int[] array1 = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;


        // array1[5] = 5;


        // for
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] +", ");
        }

        System.out.println();
        // while
        int i = 0;
        while (i < array1.length) {
            System.out.print(array1[i] + ", ");
            i++;
        }

        System.out.println();
        // do-while
        i = 0;
        do{
            System.out.print(array1[i] + ", ");
            i++;
        } while (i < array1.length);


        System.out.println("\n" + Arrays.toString(array1));

        Arrays.stream(array1).forEach(System.out::println);

        Arrays.stream(array1).forEach(e->{ System.out.println(e); });

        int[][] array2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},};

        int[][] array3 = new int[5][5];

        for (int j = 0; j < array3.length; j++) {
            for (int k = 0; k < array3[j].length; k++) {
                array3[j][k] = new Random().nextInt(101);
            }
        }

        for (int j = 0; j < array3.length; j++) {
            for (int k = 0; k < array3[j].length; k++) {
                System.out.print(array3[j][k] + ", ");
            }
            System.out.println();
        }

        for (int j = 0; j < array3.length; j++) {
            System.out.println(Arrays.toString(array3[j]));
        }

        array3[3][2] = 25;

        System.out.println(array3[0][0]);

        String[][][] array4 = new String [10][10][10];

    }
}
