package groupe203.lab1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    // psvm + Enter (tab)
    public static void main(String[] args) {
        Category category;
        // System.out.println(category);

        Category category1 = new Category();

        System.out.println(category1);
        category1.setId(1);
        category1.setName("apple");
        category1.setDescription("asd sad asd as");
        category1.setImage("/category/apple.jpg");

        Category category2 = new Category(2, "car", "asd asd asd", "/category/car.jpg");
        category2.setDescription("das asd asd asd sa");

        // Alt(option) + Enter
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        categoryList.add(category2);

        for (Category el : categoryList) {
            System.out.println(el);
        }

        User user = new User(1, "Vasya", "1234");

        Client client = new Client();
        client.setId(user.getId());
        client.setUser(user);
        client.setFirstName("Vasya");
        client.setLastName("Pypkin");
        client.setAge(23);
        client.setPhone(51323);
        client.setEmail("v@kneu.edu.ua");


        // client.sout (enter(tab))
        // sout
        System.out.println(client);

        Order order = new Order();
        order.setId(1);
        order.setDateCreatedOrder(new Date());
        order.setStatusOrder(false);
        order.setDelivery("deliverer");
        order.setPayment("cash");
        order.setClient(client);

        System.out.println(order);

        Order order1 = new Order(2, new Date(), false, "asd","asd",client);

        System.out.println(order1);

        Product product = new Product();
        product.setId(1);
        product.setName("macbook pro");
        product.setCategory(category1);
        product.setImage("/sad.jpg");
        product.setPrice(new BigDecimal(20000));

        ProductHasOrder productHasOrder = new ProductHasOrder();

        productHasOrder.setProduct(product);
        productHasOrder.setQuantity(1);
        productHasOrder.setOrder(order);

        System.out.println(productHasOrder);
    }

}
