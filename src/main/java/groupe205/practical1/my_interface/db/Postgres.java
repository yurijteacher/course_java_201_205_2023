package groupe205.practical1.my_interface.db;

import groupe205.practical1.my_interface.db.MyDB;

import java.util.List;

public class Postgres implements MyDB {
    @Override
    public String getConnection() {
        return "connection to PostgresServer";
    }

    @Override
    public void save() {
        System.out.println("save el to table from Postgres");
    }

    @Override
    public void update() {
        System.out.println("update el table from Postgres");
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
