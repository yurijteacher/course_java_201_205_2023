package groupe205.practical4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression {

    public static void main(String[] args) {

        String text = "I study JAVA with my teacher!!";

        // Pattern pattern =  Pattern.compile("I study JAVA with my teacher!!");

        // Pattern pattern =  Pattern.compile("[ a-zIJAV!]+");

        Pattern pattern =  Pattern.compile("[ a-zA-Z!]+");

        /*
        [abc] // a|b|c
        [^abc] // ^a|^b|^c
        [a-z]
        [a-zA-Z]
        [a-zA-Z0-9]
        [\\w]  - [a-zA-Z0-9_]
        [\\s]  - спеціальні символи
        \t
        \n
        \f
        \r
        [\\^w]
        F+
        F{2}
        F{2,}  2> - true  1- false
        F{n,m}
         */


        Matcher matcher = pattern.matcher(text);

//        if (matcher.matches()){
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        System.out.println( (matcher.matches() ? true : false));





    }


}
