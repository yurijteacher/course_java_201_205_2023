package lecture_db.shop.repository;


import lecture_db.shop.config.ConnectionToDB;
import lecture_db.shop.dao.CategoryDao;
import lecture_db.shop.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDB implements CategoryDao{

    public final static String url = "jdbc:mysql://localhost:3306/shop_201_205_2023";
    public final static String username = "root";
    public final static String password = "root1234";

    private final Connection connection;

    public CategoryRepository() {
        this.connection = super.getConnection(url, username, password);
    }

    // Statement - QSL - 1,2,3,4
    // PreparedStatement - SQL - 1...2...3...4
    // CallableStatement SQL -Server MySQL (call procedure 1...2...3...4)

    @Override
    public void save(Category obj) {

        Statement statement = null;

        try {

            statement = connection.createStatement();
            statement.execute("INSERT INTO `category` (`name`, `description`, `image`) VALUES ('"+obj.getName()+"', '"+obj.getDescription()+" ', '"+obj.getImage()+"');");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void update(Category obj) {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE `category` SET `name` = '"+obj.getName()+"', `description` = '"+obj.getDescription()+
                    "', `image` = '"+obj.getImage()+"' WHERE (`id` = '"+obj.getId()+"');");

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void delete(Category obj) {
        Statement statement = null;
        try {
            statement = connection.createStatement();

            statement.executeUpdate("delete FROM `category` WHERE `id` = '"+obj.getId()+"';");

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void deleteAll() {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("delete FROM `category`");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        try {
          Statement  statement = connection.createStatement();

          ResultSet resultSet = statement.executeQuery("SELECT * FROM `category`");

            while (resultSet.next()){

                categories.add(new Category(resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getString("image")
                        ));
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return categories;
    }

    @Override
    public Category findById(Long id1) {

        Category category = null;

        try {
            Statement  statement = connection.createStatement();
            ResultSet  resultSet = statement.executeQuery("SELECT * FROM `category` where id="+id1);

            while (resultSet.next()){

                category = new Category(resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getString("image")
                );
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return category;
    }
}
