package groupe204.practical1.realization_interface.my_jdbc;

public interface MyDB {

    Object getConnection(String url, String username, Object pass);
    Object executeQuery(String sql); // ResultSet -> el
    boolean executeUpdate(Object obj); // update, delete
    boolean execute(Object obj); // insert

}
