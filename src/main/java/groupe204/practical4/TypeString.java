package groupe204.practical4;

public class TypeString {

    public static void main(String[] args) {

        /*
        short a = 1;
        int
        long
        float
        double
        byte
        char
        boolean
         */

        /*
        JVM
        --------
        S    (obj)
        --------
        H
         */


        String text = "abc abc" ;

        /*
        String

        JVM
        --------
        S   link
        -------------------------------------
        H   (obj)               (obj2)
              "abc abc"         "abc abc " + "123
              - - - - -         - - - - -
              - - - - -         - - - - -
         */

        text = "abc abc " + "123";


        String text1 = "abc abc";

        text.concat(" 567");

        text = text.concat(" 567");

        System.out.println(text);


        String ab = "ab";
        String ba = "ab";
        String BA = new String("ab");

                /*
        String

        JVM
        --------
        S   link
        -------------------------------------
        H   (obj)               (obj2)
              "ab"         "abc abc " + "123
              - - - - -         - - - - -
              - - - - -         - - - - -
         */

        StringBuffer AB = new StringBuffer("ab");
        StringBuilder SB = new StringBuilder("ab");

        SB.append("ab");

                /*
        String

        JVM
        --------
        SB   link
        -------------------------------------
        H   (obj)
              "ab" + "bc" + "dc"
              - - - - -
              - - - - -
         */

        System.out.println(SB);

        System.out.println(ab.hashCode());
        System.out.println(ba.hashCode());
        System.out.println(AB.hashCode());

                      // 0   1   2   3   4   5
        char[] chars = {'A','B','C','D','E','F'};

        String text2 = new String(chars);

        System.out.println(text2);

        char[] charsArray = text2.toCharArray();

        for (char el : charsArray
             ) {
            System.out.println(el);
        }


        String str = text2.substring(1,3);
        System.out.println(str);

        String str1 = text2.substring(2);
        System.out.println(str1);


        // Відображення великих літер
        String str2 = text2.toLowerCase();
        System.out.println(str2);
        // Відображення маленьких літер
        String str3 = text2.toUpperCase();
        System.out.println(str3);

        String str4 = "\t\t I study Java with my teacher  \t\t\n";

        int logic = str4.lastIndexOf("study");
        System.out.println(logic);

        String str5 = str4.trim();
        System.out.println(str5);

        String str6 = str5.replace("a", "**");
        System.out.println(str6);

        String[] str7 = str6.split(" ");


        for (String el : str7
             ) {
            System.out.println(el);
        }

        String str8 = str5.replaceFirst("a", "***");
        System.out.println(str8);

        //
        String a0 = "abc";
        String a1 = "Abc";
        String a2 = "abc";

        // ==
        System.out.println("0 == a2" + a0 == a2);
        System.out.println("0 == a1" + a0 == a1);

        System.out.println(a0.equals(a1));           // false
        System.out.println(a0.equalsIgnoreCase(a1)); // true Ignore Case
        System.out.println(a0.equals(a2));           // true

        StringBuilder stringBuilder = new StringBuilder("abc");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append(" dfe");
        System.out.println(stringBuilder.hashCode());

        System.out.println(stringBuilder);

        String str9 = "I.study,Java:with;my teacher";

        String[] str10 = str9.split("\\.|,|:|;| ");
        for (String el : str10
             ) {
            System.out.print(el+" ");
        }

    }

}
