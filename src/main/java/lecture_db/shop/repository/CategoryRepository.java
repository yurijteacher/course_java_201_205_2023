package lecture_db.shop.repository;


import lecture_db.shop.config.ConnectionToDB;
import lecture_db.shop.dao.CategoryDao;
import lecture_db.shop.entity.Category;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CategoryRepository extends ConnectionToDB implements CategoryDao{

    private final Connection connection;

    public CategoryRepository() {
        this.connection = getConnection("jdbc:mysql://localhost:3306/shop_201_205_2023", "root", "root1234");
    }


    @Override
    public void save(Category obj) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO `shop_201_205_2023`.`category` (`name`, `description`, `image`) VALUES ('"+obj.getName()+"', '"+obj.getDescription()+" ', '"+obj.getImage()+"');");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Category obj) {

    }

    @Override
    public void delete(Category obj) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findById(Long id) {
        return null;
    }
}
