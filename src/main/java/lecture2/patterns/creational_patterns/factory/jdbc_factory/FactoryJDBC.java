package lecture2.patterns.creational_patterns.factory.jdbc_factory;

public class FactoryJDBC {

    private InterfaceJdbc driver;
    public InterfaceJdbc getDriver(String nameDB){

        switch (nameDB){


            case("mysql"):
                driver = new JdbcMysql();
                break;
            case("postgres"):
                driver = new JdbcPostgresql();
                break;
            case("db2"):
                driver = new JdbcDb2();
                break;
        }

        return driver;
    }

}
