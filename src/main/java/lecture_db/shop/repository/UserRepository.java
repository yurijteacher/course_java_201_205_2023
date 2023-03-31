package lecture_db.shop.repository;

import lecture_db.shop.config.ConnectionToDB;
import lecture_db.shop.dao.UserDao;
import lecture_db.shop.entity.Category;
import lecture_db.shop.entity.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static lecture_db.shop.repository.CategoryRepository.*;

public class UserRepository extends ConnectionToDB implements UserDao {

    private Connection connection;

    public UserRepository() {
        this.connection = getConnection(url, username, password);
    }

    @Override
    public void save(User obj) {

        CallableStatement cs = null;

        String sql = "{call insert_user(?,?)}";
        try {
            cs = connection.prepareCall(sql);
            cs.setString(1, obj.getUsername());
            cs.setString(2, obj.getPassword());

            cs.execute();

            cs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(User obj) {
        CallableStatement cs = null;

        String sql = "{call update_user(?,?,?)}";
        try {
            cs = connection.prepareCall(sql);
            cs.setInt(1, obj.getId());
            cs.setString(2, obj.getUsername());
            cs.setString(3, obj.getPassword());

            cs.executeUpdate();

            cs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(User obj) {
        CallableStatement cs = null;

        String sql = "{call delete_user(?)}";
        try {
            cs = connection.prepareCall(sql);
            cs.setInt(1, obj.getId());

            cs.executeUpdate();

            cs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAll() {
        CallableStatement cs = null;

        String sql = "{call deleteAll_users(?)}";
        try {
            cs = connection.prepareCall(sql);

            cs.executeUpdate();

            cs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> findAll() {

        List<User> users = new ArrayList<>();

        String sql = "{call findAll()}";

        try {
            CallableStatement cs = connection.prepareCall(sql);
            ResultSet rs = cs.executeQuery();

            while (rs.next()){

                users.add(new User(rs.getInt("id"), rs.getString("username"), rs.getString("password")));
            }


            rs.close();
            cs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    @Override
    public User findById(Long id1) {
        User user = new User();

        String sql = "{call findById(?)}";

        try {
            CallableStatement cs = connection.prepareCall(sql);
            cs.setLong(1, id1);

            ResultSet rs = cs.executeQuery();

            while (rs.next()){

               user =  new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
            }


            rs.close();
            cs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return user;
    }
}
