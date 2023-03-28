package groupe204.practical4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {

        String pattern = "[\\t JIa-z]+";
        String text = "\t I study Java with my teacher";

        Pattern p1 = Pattern.compile(pattern);
        Matcher m1 = p1.matcher(text);

        if(m1.matches()){
            System.out.println("Ok");
        } else {
            System.out.println("False");
        }

        m1.reset();

        while (m1.find()){
            System.out.print(text.substring(m1.start(), m1.end())+"*");
        }

        /*
        "I study Java.. "
        "[abc]" a або b або с
        "[^abc]"
        "[a-zA-Z]"
        "[a-zA-Z0-9]"
        "[^a-zA-Z0-9]"
        "[abc|cbd]"
        "[]{n}" - n - раз
        "[]{n,}" - n - раз >
        "[]{n,d}" від n до d
        "\w"  [a-zA-Z0-9] + "_"
        "^\w" ^[a-zA-Z0-9] + "_"
        "\t"
        "\n"
        "\p"
        "\b"
         */

    }
}
