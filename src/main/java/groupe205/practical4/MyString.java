package groupe205.practical4;

public class MyString {

    public static void main(String[] args) {

        /*
        byte
        boolean
        char
        double
        float
        long
        int
        short
         */


        int a = 5;

        /*
        JVM
        --------------
        S a = 5;
        --------------
        H -
         */

        String text = "abc";

        System.out.println(text.hashCode());
        /*
        JVM
        --------------
        S (link)
        --------------
        H ("abc"        ("abc 1234")
          - - - )        - - - -
         */

        System.out.println(text.concat(" 1234").hashCode());

        text = text.concat(" 1234");

        System.out.println(text);


        String text2 = new String("abc");


        String ab = "ab";
        String ab1 = "ab";

        System.out.println("ab == ab1: " + (ab==ab1));
        System.out.println("equals: " + ab.equals(ab1));

        StringBuffer sb = new StringBuffer("ab");

        System.out.println("ab == sb: " + (ab == sb.toString()));
        System.out.println("equals: " + ab.equals(sb.toString()));


        StringBuilder stringBuilder = new StringBuilder("abc");

        System.out.println(stringBuilder.hashCode());
        stringBuilder.append(" 1234");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.hashCode());

        /*
        JVM
        --------------
        S (link)
        --------------
        H ("abc" + " 1234" + " "
          - - - )
         */

        char[] chars = {'A','B','C','D','E','F'};

        String text3 = new String(chars);
        System.out.println(text3);

        char[] chars1 = text3.toCharArray();

        for (char el : chars1
             ) {
            System.out.println(el);
        }

        String text5 = "I study JAVA with my teacher!!!";

        System.out.println(text5.length());

        int a1 = text5.lastIndexOf("JAVA");
        System.out.println(a1);

        System.out.println(text5.replace("a", "**"));

        String[] strings = text5.split(" ");

        for (String el : strings
             ) {
            System.out.println("<<" + el);
        }

        String text6 = "I study,JAVA.with:my;teacher!!!";

        String[] strings1 = text5.split(",|:|\\.|,|;| ");

        for (String el : strings1
        ) {
            System.out.println(">>" + el);
        }


        String text7= "I study JAVA with my teacher!!!";

        System.out.println(text7.substring(8));
        System.out.println(text7.substring(8,12));

        System.out.println(text7.replace("a", "**"));

        System.out.println(text7.replaceFirst("A", "***"));

        System.out.println(text7.replaceAll("A", "***"));


        /*

            /t
            /n
            /f
            /r

         */


        String text8= "\t\t\n I study JAVA with my teacher!!!  \r\t\t\t";

        System.out.println(text8);

        System.out.println(text8.trim());
    }





}
