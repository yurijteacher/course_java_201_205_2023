package groupe204.practical1.realization_interface.my_jdbc;

public class JdbcPostgres implements MyDB{


    @Override
    public Object getConnection(String url, String username, Object pass) {

        if ((url instanceof String) && (username instanceof String) && (pass instanceof String)) {
            return "connection to Postgres";
        } else {
            return "no connection to Postgres";
        }
    }

    @Override
    public Object executeQuery(String sql) {
        return "List Db from Postgres";
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
