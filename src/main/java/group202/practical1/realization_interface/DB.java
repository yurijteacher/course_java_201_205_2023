package group202.practical1.realization_interface;

public interface DB {
   Object getConnection(String url, String username, String password);
   void request(Object obj);
}
