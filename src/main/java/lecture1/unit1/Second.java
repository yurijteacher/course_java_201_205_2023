package lecture1.unit1;

public class Second {

    public static void main(String[] args) {

        /*
        v.1
        author:
        Type val
         */

        // Short-Int-Long
        short a1 = 1;
        int a2 = 2;
        long a3 = 3L;
        byte b = 1;
        char a4 = 'a';
        boolean logic = true;
        float a6 = 5.5f;
        double a7 = 7;


        String a5 ="text";
        // a5 = a5 + " 1234";
        String a8 ="text";
        String a9 ="Text";

        // a5 == a8
        System.out.println(a5.equals(a8));
        System.out.println(a5.equals(a9));

        System.out.println(a5.equals(a8.toLowerCase()));


        System.out.println(a1 + ", " + a2 + ", " + a5+", "+ logic );

    }



}
