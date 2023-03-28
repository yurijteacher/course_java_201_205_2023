package groupe201.practical2;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        // Map<Key, Value>

        Map<String, String> map = new HashMap<>();

        map.put("name1", "Ivanna");
        map.put("name2", "Iva");
        map.put("name3", "Ivan");

        map.remove("name1");

        System.out.println(map.get("name1"));

        for (Map.Entry<String, String> el :
                map.entrySet()) {
            System.out.println(el.getKey() + ":" + el.getValue());
        }

        map.clear();


    }
}
