package groupe201.practical2;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {


        Set<String> set = new HashSet<>();

        set.add("Iva");
        set.add("Inanna");
        set.add("Ivan");

        set.size();

        System.out.println(set);

        set.add("Iva");

        System.out.println(set);
    }

}
