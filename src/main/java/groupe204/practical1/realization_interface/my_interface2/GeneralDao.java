package groupe204.practical1.realization_interface.my_interface2;

import java.util.List;

public interface GeneralDao {
    void save(Object ob);
    void update(Object ob);
    List<Object> findAll();
    Object findById();
    void delete(Object ob);
}
