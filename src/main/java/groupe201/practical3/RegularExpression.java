package groupe201.practical3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {


        String text = "I study C with my teacher";


        //

        // String pattern = "I study C# with my teacher";
        String pattern = "[ CIa-z#]+";

        /*

        [abc]  - або а, або b, або с
        [^abc] - будь-які символи, окрім  abc
        [a-z] - будь-які маленькі символи від a до z
        [a-zA-Z] -
        [a-zA-Z0-9] -
        [^a-zA-Z0-9] -
        [abc|xyz] -
        [\\w] - [a-zA-Z0-9_]
        \^w - ^[a-zA-Z0-9_]
        X+ - будь-яка кількість повторів
        Х{1,3} 1-3
        Х{2,}  2>
        X{2}
        \t - табуляція
        \n - перехід на новий рядок
        \r - повернення каретки
        \b - границя слова
        \f - перехід на нову сторінки
        \d - будь-які цифри
        \^d
        \s [ \t\n\f\t..]
        \^s [ \t\n\f\t..]
         */


        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.matches()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("\tHello \nWorld!!!\r");
    }

}
