package lecture2.patterns.creational_patterns.factory.jdbc_factory;

public interface InterfaceJdbc {

    Object getConnectionToDB(String url, String username, String password);
    void executeSQL(String sql);
    void executeUpdate(String sql);







}
