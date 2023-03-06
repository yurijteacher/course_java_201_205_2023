package group202.practical1.association.one_to_many;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Category category = new Category();
        category.setId(1);
        category.setName("macbook pro");

        Product proIntel = new Product();
        proIntel.setId(1);
        proIntel.setName("macbook pro intel");
        proIntel.setPrice(25000);
        proIntel.setCategory(category);

        Product proApple = new Product();
        proApple .setId(2);
        proApple .setName("macbook pro apple");
        proApple .setPrice(35000);
        proApple .setCategory(category);


        List<Product> productList = new ArrayList<>();
        productList.add(proIntel);
        productList.add(proApple);

        for (Product el : productList
             ) {
            System.out.println(el);
        }

    }
}
