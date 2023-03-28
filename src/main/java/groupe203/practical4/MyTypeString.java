package groupe203.practical4;

public class MyTypeString {

    public static void main(String[] args) {

        /*
        JVM
        _____________
        s (obj)
        _____________
        h
         */

        /*
        short
        int
        long
        byte
        float
        double
        char
        boolean
         */

       /* String

        JVM
        _____________
        s  (link)
        _____________
        h        (obj)           (obj2)
            "abc abc abc"       "abc abc abc 123"
            - - - - - -         - - - - - -
            - - - - - -         - - - - - -

         */

        int a = 5;
        System.out.println(a);

        String text = "abc abc abc";

       text = text.concat(" 123");

       System.out.println(text);

       String a0 = "ab";
       String a1 = "ab";

        System.out.println(a0.hashCode());
        System.out.println(a1.hashCode());

      String a2 = new String("ab");
        System.out.println(a2.hashCode());

      // ==
        System.out.println("a0==a1: " + (a0==a1));
        System.out.println("a1==a2: " + (a1==a2));

        System.out.println(a0.equals(a1));
        System.out.println(a0.equals(a2));

      StringBuilder sb = new StringBuilder("abc abc1");
      StringBuffer stringBuffer = new StringBuffer("abcb bcbc");
      System.out.println(sb.hashCode());
        /*
        JVM
        _____________
        sb  (link)
        _____________
        h        (obj)
            "abc abc abc"  "" ""
            - - - - - -
            - - - - - -

         */
        sb.append("sad as dsa dsa d sad ");
        System.out.println(sb + ":" + sb.hashCode());


        char[] chars = {'A','B','C','D','E','F'};
        String text2 = new String(chars);
        System.out.println(text2);

        char[] chars1 = text2.toCharArray();
        for (char el : chars1
             ) {
            System.out.println(el);
        }

        String str1 = text2.substring(3);
        System.out.println(str1);

        String str2 = text2.substring(2,5);
        System.out.println(str2);

        String str3 = text2.toLowerCase();
        System.out.println(str3);

        String str4 = text2.toUpperCase();
        System.out.println(str4);

        String text3 = " \t\t I study Java with my teacher! \t";
        System.out.println(text3);

        String text4 = text3.trim();
        System.out.println(text4);

        text4 = text4.replace("a", "***");
        System.out.println(text4);

        String text5 = " \t\t I study Java with my teacher! \t";

        String text6 = text5.replaceFirst("a", "*");
        System.out.println(text6);

        String text7 = text5.trim();

        String[] arrayText = text7.split(" ");
        for (String el : arrayText
             ) {
            System.out.println(el);
        }


        String text8 = "I,study.Java:with;my teacher!";

        String[] arrayText2 = text8.split(",|;|:|\\.| ");
        for (String el : arrayText2
        ) {
            System.out.print(el + " ");
        }


    }

}
