package groupe204.practical1.realization_interface.my_jdbc;

public class DbFactory {

    MyDB db = null;
    public MyDB getDB(String name){

        switch (name){
            case ("mysql"):
                db = new JdbcMySQL();
                break;
            case ("postgres"):
                db = new JdbcPostgres();
                break;
        }

        return db;
    }

}
