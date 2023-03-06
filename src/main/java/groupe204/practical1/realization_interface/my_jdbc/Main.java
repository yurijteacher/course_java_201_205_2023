package groupe204.practical1.realization_interface.my_jdbc;

public class Main {

    public static void main(String[] args) {

        DbFactory factory = new DbFactory();

        MyDB db = factory.getDB("mysql");

        System.out.println(db.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234"));

        System.out.println(db.executeQuery("select * from table"));

        MyDB db1 = factory.getDB("postgres");

        System.out.println(db1.getConnection("url", "root", 1234));


    }

}
