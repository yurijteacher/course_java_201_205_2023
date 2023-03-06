package groupe201.practical1.association.one_to_many;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Category category =new Category(1, "apple", "sad");

    Product product = new Product(1, "macbook air", "sad sad",20000.2,category);
    Product product1 = new Product(2, "macbook pro", "asd sad",24000.2,category);

    List<Product> products = new ArrayList<>();
    products.add(product1);
    products.add(product);

        for (Product r :
                products) {
            System.out.println(r);
        }

    }


}
