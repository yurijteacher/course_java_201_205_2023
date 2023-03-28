package groupe201.practical3;

public class MyString {

    public static void main(String[] args) {

        /*
        double
        float
        char
        byte
        boolean
        short
        long
        int
         */


        /*

        JVM
        ---------------------------
        S  +
        ---------------------------
        H  -
        ---------------------------
         */


        /*
        JVM (String)
                ---------------------------
                S  (link)             (link)
                ---------------------------
                H   (obj + obj)      (obj)
                   - - - -            -  -  -  -
                   - - - -            -  -  -  -
                ---------------------------
         */


        String text = "Hello ";
        text.concat("World!");

        text = text.concat("World!!");
        System.out.println(text);
        System.out.println(text.hashCode());

        text = text + "1234";
        System.out.println(text);
        System.out.println(text.hashCode());


        String abc = "abc";
        String abc1 = "abc";

        System.out.println("abc == abc1: " + (abc==abc1));  // true

        String abc2 = new String("abc");
        System.out.println("abc == abc2: " + (abc==abc2));  // false


                /*
        JVM (StringBuffer)
                ---------------------------
                S  (link)             (link)
                ---------------------------
                H   (obj + obj)      (obj)
                   - - - -            -  -  -  -
                   - - - -            -  -  -  -
                ---------------------------
         */

        StringBuffer stringBuffer = new StringBuffer("abc");
        StringBuilder stringBuilder = new StringBuilder("abc");

        System.out.println(stringBuilder.hashCode());
        stringBuilder.append(" 1234");
        System.out.println(stringBuilder.hashCode());


        char[] chars ={'A','B','C','D','E','F'};
        String text3 = new String(chars);
        System.out.println(text3);

        char[] chars1  = text3.toCharArray();

        for (char el : chars1
             ) {
            System.out.print(el);
        }


        String text4 = "I study JAVA with my teacher!!!";

        System.out.println(text4.length());

        System.out.println(text4.substring(8,13));
        System.out.println(text4.substring(8));
        System.out.println(text4.lastIndexOf("JAVA"));

        System.out.println(text4.toUpperCase());
        System.out.println(text4.toLowerCase());

        System.out.println(text4.replace("a", "***"));

        System.out.println(text4);

        String text5 = "\t\t I study JAVA with my teacher!!!   \t\n";
        System.out.println(text5.trim());

        System.out.println(text5.replaceFirst("A", "***"));

        System.out.println(text5.replaceAll("A", "***"));

        // ==
        String ab = "ab";
        String ab1 = new String("ab");

        System.out.println("ab.hashCode() == ab1.hashCode(): " + (ab.hashCode() == ab1.hashCode()));  // true
        System.out.println(ab == ab1);  // false

        // Equals

        System.out.println(ab.equals(ab1));  // true
        System.out.println(ab.equalsIgnoreCase(ab1));  //true



        text5.replace("a", "**");
        String[] arr = text5.split(" ");

        for (String el : arr
             ) {
            System.out.println(el);
        }


        String text6 = "I study,JAVA:with;my teacher";


        String[] arr2 = text6.split(",|\\.|:|;| ");
        for (String el : arr2
        ) {
            System.out.print(el + " ");
        }


    }
}
