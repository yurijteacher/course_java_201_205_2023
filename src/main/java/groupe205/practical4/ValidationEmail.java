package groupe205.practical4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {

    public static void main(String[] args) {

        String text = "vasyaPypkin.kneu1234@edu.ua";  // 2>

        Pattern pattern =  Pattern.compile("[a-zA-Z]+[\\.\\w]+[a-zA-Z0-9]+@[\\w]+[\\.\\w]+[\\w]{2,}");

        Matcher matcher = pattern.matcher(text);
        System.out.println( (matcher.matches() ? true : false));

    }
}
