package lecture_db.shop.main;

import lecture_db.shop.config.ConnectionToDB;
import lecture_db.shop.entity.Category;
import lecture_db.shop.repository.CategoryRepository;

public class Main extends ConnectionToDB {


    public void getConn(String url, String username, String password) {
        super.getConnection(url,username,password);
    }

    public static void main(String[] args) {
        // new Main().getConn("jdbc:mysql://localhost:3306/shop_201_205_2023", "root", "root1234");

        CategoryRepository categoryRepository = new CategoryRepository();

        Category category = new Category();
        category.setName("apple");
        category.setDescription("asd as dsad ");
        category.setImage("/sad.jpg");

        categoryRepository.save(category);

    }


}
