package lecture2.patterns.creational_patterns.factory.jdbc_factory;

public class Main {

    public static void main(String[] args) {


        FactoryJDBC factoryJDBC = new FactoryJDBC();
        InterfaceJdbc driverManager = factoryJDBC.getDriver("postgres");

        Object obj = driverManager.getConnectionToDB("jdbc:postgres://localhost:5432/mydb","root","root");

        System.out.println(obj);




    }



}
