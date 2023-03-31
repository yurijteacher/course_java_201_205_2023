package lecture_db.shop.repository;

import lecture_db.shop.config.ConnectionToDB;
import lecture_db.shop.dao.ProductDao;
import lecture_db.shop.entity.Category;
import lecture_db.shop.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static lecture_db.shop.repository.CategoryRepository.*;

public class ProductRepository extends ConnectionToDB implements ProductDao {

    // PreparedStatement
    private Connection connection;

    public ProductRepository() {
        this.connection = super.getConnection(url, username, password);
    }

    @Override
    public void save(Product obj) {    // Insert

        String sql= "INSERT INTO `product` (`name`, `description`, `price`, `image`, `category_id`) VALUES (?, ?, ?, ?, ?);";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.setString(2, obj.getDescription());
            ps.setBigDecimal(3, obj.getPrice());
            ps.setString(4, obj.getImage());
            ps.setLong(5, obj.getCategory().getId());

            ps.execute();

            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Product obj) {

        String sql= "UPDATE `product` SET `name` = ?, `description` = ?, `price` = ?, `image` = ?, `category_id` = ? WHERE `id` = ?;";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.setString(2, obj.getDescription());
            ps.setBigDecimal(3, obj.getPrice());
            ps.setString(4, obj.getImage());
            ps.setLong(5, obj.getCategory().getId());
            ps.setLong(6, obj.getId());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Product obj) {
        String sql= "DELETE FROM `product` WHERE `id` = ?;";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, obj.getId());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAll() {
        String sql= "DELETE FROM `product`";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> findAll() {

        List<Product> products = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM `product`");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Product product = new Product();

                product.setId(rs.getLong("id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getBigDecimal("price"));

                Long categoryId = rs.getLong("category_id");
                Category category = new CategoryRepository().findById(categoryId);
                product.setImage(rs.getString("image"));

                product.setCategory(category);

                products.add(product);
            }


            rs.close();
            ps.close();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return products;
    }

    @Override
    public Product findById(Long id) {

        Product product = new Product();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM `product` WHERE id=?");
            ps.setLong(1,id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                product.setId(rs.getLong("id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getBigDecimal("price"));

                Long categoryId = rs.getLong("category_id");
                Category category = new CategoryRepository().findById(categoryId);
                product.setImage(rs.getString("image"));

                product.setCategory(category);

            }


            rs.close();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return product;
    }
}
