package group202.lab1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    // psvm
    public static void main(String[] args) {

        Category category;
        //        System.out.println(category);

        Category category1 = new Category();
        System.out.println(category1);
        category1.setId(1);
        category1.setName("apple");
        category1.setDescription("asd sad sad asd");
        category1.setImage("/category/apple.jpg");

        System.out.println(category1.toString());


        Category category2 = new Category(2, "car", "asdsa","/category/car.jpg");
        Category category3 = new Category(3, "wine", "asd sad sad ","/category/wine.jpg");

        List<Category> categoryList = new ArrayList<>();

        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);

        for (Category item : categoryList) {
            System.out.println(item);
        }

        Product product = new Product();
        product.setId(1);
        product.setName("macbook air");
        product.setDescription("asd asd sad sa");
        product.setImage("product/image.jpg");
        product.setCategory(category1);
        product.setPrice(new BigDecimal(40000));

        System.out.println(product);

        Product product1 = new Product(2, "macbook pro", "wqe qwe qwe","/image/pro.jp",new BigDecimal(50000),category1);
        Product product2 = new Product(3, "macbook pro M1", "ert qwe qwe","/image/prom1.jp",new BigDecimal(60000),category1);

        List<Product> productList = new ArrayList<>();

        productList.add(product);
        productList.add(product1);
        productList.add(product2);

        for (Product prod : productList) {
            System.out.println(prod);
        }

        User user = new User(1, "Vasyz", "12345");

        Client client = new Client();
        client.setId(user.getId());
        client.setFirstName("Vasya");
        client.setLastName("Pypkin");
        client.setAge(23);
        client.setPhone(5123423);
        client.setEmail("v@kneu.edu.ua");
        client.setUser(user);

        System.out.println(client);


        Role role1 = new Role(1, "admin");
        Role role2 = new Role(2, "user");
        Role role3 = new Role(3, "manager");

        RoleInUser roleInUser1 = new RoleInUser(1, role3, user);
        RoleInUser roleInUser2 = new RoleInUser(1, role1, user);

        System.out.println(roleInUser1);

        Order order = new Order();
        order.setId(1);
        order.setClient(client);
        order.setDateCreated(new Date());
        order.setStatus(false);

        System.out.println(order);

        ProductHasOrder productHasOrder = new ProductHasOrder();
        productHasOrder.setOrder(order);
        productHasOrder.setProduct(product1);
        productHasOrder.setQuantity(1);

        ProductHasOrder productHasOrder1 = new ProductHasOrder();
        productHasOrder1.setOrder(order);
        productHasOrder1.setProduct(product2);
        productHasOrder1.setQuantity(2);

        System.out.println(productHasOrder);


    }

}
