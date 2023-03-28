package groupe205.practical3;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //  Map<Key, Object>
        Map<Long, Category> map = new HashMap<>();

        Category category = new Category();
        category.setId(1L);
        category.setName("Apple");
        category.setDesc("sa sad asd ");
        category.setImage("/image/apple.jpg");

        Category category1 = new Category();
        category1.setId(2L);
        category1.setName("Sony");
        category1.setDesc("wsa sad asd ");
        category1.setImage("/image/sony.jpg");

        map.put(1L, category);
        map.put(2L, category1);

        Category category2 = map.get(2L);

        for (Map.Entry<Long, Category> el :
                map.entrySet()) {
            System.out.println(el);
        }

        for (Map.Entry<Long, Category> el :
                map.entrySet()) {
            System.out.println(el.getKey() + ":" + el.getValue().getId() + ":" + el.getValue().getName());
        }
    }


}
