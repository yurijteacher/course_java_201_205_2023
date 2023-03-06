package group202.practical1.realization_interface;

public class Main {

    public static void main(String[] args) {

        DbFactory factory = new DbFactory();

       DB db =  factory.getDB("mysql");
        System.out.println(db.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234"));
        db.request("select * form table");


        DB db2 = factory.getDB("postgres");
        System.out.println(db2.getConnection("jdbc:postgres://localhost:5432/mypostgres", "root", "1234"));
        db2.request("select * form table");
    }
}
