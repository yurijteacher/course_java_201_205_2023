package groupe205.practical1.my_interface.db;

import java.util.List;

public interface MyDB {

    String getConnection();
    void save();
    void update();
    List<Object> findAll();
    Object findById(int id);
    void deleteById(int id);
}
