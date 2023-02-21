package groupe201;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    // psvm + tab
    public static void main(String[] args) {


        Category category = new Category();
        category.setId(1L);
        category.setName("macbook air");
        category.setDescription("aDS ASD ASD ");
        category.setImage("/category/macbook.jpg");

        Category category1 = new Category(2L, "macbook pro","asd asd asd","/category/1.jpg");
        category1.setDescription("asd asd asd sad as");

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        categoryList.add(category);

        System.out.println(category);


        for (Category el : categoryList
             ) {
            System.out.println(el);
        }


        Product product = new Product();
        product.setId(1L);
        product.setName("air");
        product.setDescription("asd sad asd");
        product.setPrice(new BigDecimal(20000));
        product.setImage("/product/air.jpg");
        product.setCategory(category);

        Product product1 = new Product(2L, "pro", "sad asd as","/product/2.jpg",new BigDecimal(30000),category1);


        System.out.println(product);
        System.out.println(product1);


        User user = new User();
        user.setId(1L);
        user.setUsername("Vasya");
        user.setPassword("1234");

        Client client = new Client();
        client.setId(1L);
        client.setFirstName("Vasya");
        client.setLastName("Pypkin");
        client.setAge(24);
        client.setPhone(51323);
        client.setEmail("1@ukr.net");
        client.setUser(user);

        System.out.println(client);

        Order order = new Order();
        order.setId(1L);
        order.setDateCreated(new Date());
        order.setStatusOrder(false);
        order.setClient(client);

        System.out.println(order);

        ProductsHasOrder productsHasOrder = new ProductsHasOrder();
        productsHasOrder.setId(1L);
        productsHasOrder.setOrder(order);
        productsHasOrder.setProduct(product1);

        ProductsHasOrder productsHasOrder2 = new ProductsHasOrder();
        productsHasOrder2.setId(2L);
        productsHasOrder2.setOrder(order);
        productsHasOrder2.setProduct(product);

        System.out.println(productsHasOrder);
        System.out.println(productsHasOrder2);

    }

}
