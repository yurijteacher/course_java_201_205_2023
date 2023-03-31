package lecture_db.shop.main;

import lecture_db.shop.config.ConnectionToDB;
import lecture_db.shop.entity.Category;
import lecture_db.shop.entity.User;
import lecture_db.shop.repository.CategoryRepository;
import lecture_db.shop.repository.UserRepository;

import java.util.List;

public class Main extends ConnectionToDB {


    public void getConn(String url, String username, String password) {
        super.getConnection(url,username,password);
    }

    public static void main(String[] args) {
        // new Main().getConn("jdbc:mysql://localhost:3306/shop_201_205_2023", "root", "root1234");

        CategoryRepository categoryRepository = new CategoryRepository();

//        Category category = new Category();
//        category.setName("apple1");
//        category.setDescription("asd as dsad ");
//        category.setImage("/sad.jpg");
//
//        categoryRepository.save(category);


        List<Category> categories = categoryRepository.findAll();

        for (Category el : categories
             ) {
            System.out.println(el);
        }


        Category category = categoryRepository.findById(1L);

        System.out.println(">>" + category);

        List<Category> categories1 = categoryRepository.findAll();

        for (Category el : categories1) {
            System.out.println(">>" + el);
        }


        UserRepository userRepository = new UserRepository();

//        User user = new User("Ivanka", "1111");


//        userRepository.save(user);

        User user = new User(1, "Ivanka", "1111");

        user.setUsername("Iva");

//        userRepository.update(user);

        List<User> users = userRepository.findAll();


        for (User el : users
             ) {
            System.out.println(el);
        }


        User user1 = userRepository.findById(1L);
        System.out.println(">>" + user1);
    }


}
