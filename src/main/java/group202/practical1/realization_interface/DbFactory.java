package group202.practical1.realization_interface;

public class DbFactory {
    DB db = null;
    public DB getDB(String name){

    switch (name){
        case ("mysql"):
            db = new MySQLServer();
            break;
        case ("postgres"):
            db = new PostgresServer();
            break;
    }

    return db;
}
}
