package groupe204.practical1.realization_interface.my_jdbc;

public class JdbcMySQL implements MyDB {
    @Override
    public Object getConnection(String url, String username, Object pass) {

        if ((url instanceof String) && (username instanceof String) && (pass instanceof String)) {
            return "connection to MySQl";
        } else {
            return "no connection to MySQl";
        }
    }

    @Override
    public Object executeQuery(String sql) {
        return "List Db from MySQL";
    }

    @Override
    public boolean executeUpdate(Object obj) {
        return true;
    }

    @Override
    public boolean execute(Object obj) {
        return false;
    }
}
