package groupe205.practical1.my_interface.db;

import java.util.List;

public class MySQL implements MyDB{
    @Override
    public String getConnection() {
        return "connection to mysqlServer";
    }

    @Override
    public void save() {
        System.out.println("save to MySQL");
    }

    @Override
    public void update() {
        System.out.println("update to MySQL");
    }

    @Override
    public List<Object> findAll() {
        return null;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
