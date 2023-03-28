package groupe201.practical3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {
    public static void main(String[] args) {


        /*
        A valid username in an email must start with a letter and end with a letter or number, may contain Latin letters, numbers and a dot.
        [A-Za-z0-9\\._]

        There must be at least two domain levels after the @ symbol.
        i => 2

        The top-level domain must be at least two letters long. (>=2)
        .com
        .ua
         */

        String text = "vasya_py.p.kin@kneu.edu.ua";

         String pattern = "[\\w]+[\\.\\w]+[\\w]@(([A-Za-z0-9]+\\.)+[A-Za-z0-9]{2,})";  //\\w{2,}";
         Matcher matcher = Pattern.compile(pattern).matcher(text);
         boolean logic = (matcher.matches ()) ? true : false;

        System.out.println(logic);
        }
    }

