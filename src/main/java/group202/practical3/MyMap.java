package group202.practical3;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

       // Map<Key, Value> map = new HashMap<>();
        Map<String, String> map = new HashMap<>();

        map.put("point", "1,2");
        map.put("square", "1,2,5");
        map.put("circle", "1,2,3");

        for (Map.Entry<String, String> el : map.entrySet()) {
            System.out.println(el.getKey() + ":" + el.getValue());
        }

        String name = map.get("point");
        System.out.println(name);
    }
}
