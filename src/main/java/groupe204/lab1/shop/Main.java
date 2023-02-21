package groupe204.lab1.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    // psvm
    public static void main(String[] args) {

        Category macbook;
        macbook = new Category();

        macbook.setId(1L);
        macbook.setName("apple macbook");
        macbook.setDescription("sadsa asd asd ");
        macbook.setImage("/image/categories/apple.jpg");

        Category car = new Category(2L, "car", "asds asd as", "/image/categories/car.jpg");

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(macbook);
        categoryList.add(car);

        for (Category item : categoryList) {
            System.out.println(item);
        }

        //
        Product air =new Product(1L, "air", "wq w", new BigDecimal(2000.00), "/image/product/air.jpg", true, macbook);
        air.setStatus(false);

        //
        Product seat2000 = new Product();
        seat2000.setId(2L);
        seat2000.setName("seat");
        seat2000.setDescription("asd sad sad sad");
        seat2000.setName("/image/caca/sad.jpg");
        seat2000.setStatus(false);
        seat2000.setCategory(car);

        Product seat200 = new Product();
        seat200.setId(3L);
        seat200.setName("seat1");
        seat200.setDescription("asd sad sad sad");
        seat200.setName("/image/caca/sad2.jpg");
        seat200.setStatus(true);
        seat200.setCategory(car);
        seat200.setPrice(new BigDecimal(30000));

        List<Product> productList = new ArrayList<>();
        productList.add(air);
        productList.add(seat200);
        productList.add(seat2000);

        productList
                .stream()
                .forEach(item -> System.out.println(item));



        User user = new User(1L,"Vasya", "1234");

        Client client = new Client();
        client.setId(1L);
        client.setFirstName("Vasya");
        client.setLastName("Pypkin");
        client.setEmail("1@ukr.net");
        client.setAge(20);
        client.setPhone(05051323);
        client.setUser(user);

        Roles role1 = new Roles(1L, "user");
        Roles role2 = new Roles(2L, "admin");
        Roles role3 = new Roles(3L, "manager");

        RolesHasUser rolesHasUser = new RolesHasUser();
        rolesHasUser.setId(1L);
        rolesHasUser.setRoles(role1);
        rolesHasUser.setUser(user);

        Order order = new Order();
        order.setId(1L);
        order.setDateCreated(new Date());
        order.setDelivery("deliverer");
        order.setPayment("cash");
        order.setStatusOrder(false);
        order.setClient(client);

        System.out.println(order);

        ProductHasOrder productHasOrder1 = new ProductHasOrder();
        productHasOrder1.setId(1L);
        productHasOrder1.setOrder(order);
        productHasOrder1.setProduct(seat200);

        ProductHasOrder productHasOrder2 = new ProductHasOrder();
        productHasOrder2.setId(2L);
        productHasOrder2.setProduct(seat2000);
        productHasOrder2.setOrder(order);

        List<ProductHasOrder> productHasOrders = new ArrayList<>();
        productHasOrders.add(productHasOrder1);
        productHasOrders.add(productHasOrder2);

        for (ProductHasOrder el : productHasOrders
             ) {
            System.out.println(el);
        }


    }


}
