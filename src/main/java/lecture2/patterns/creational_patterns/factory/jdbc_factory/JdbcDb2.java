package lecture2.patterns.creational_patterns.factory.jdbc_factory;

public class JdbcDb2 implements InterfaceJdbc{
    @Override
    public Object getConnectionToDB(String url, String username, String password) {
        return "connection to db2";
    }

    @Override
    public void executeSQL(String sql) {

    }

    @Override
    public void executeUpdate(String sql) {

    }
}
