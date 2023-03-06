package group202.practical1.realization_interface;

public class PostgresServer implements DB{
    @Override
    public Object getConnection(String url, String username, String password) {
        String connection =  "connection to PostgresServer";
        return connection;
    }

    @Override
    public void request(Object obj) {
        System.out.println("GRUD Postgres");
    }

}
