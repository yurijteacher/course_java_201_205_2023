package lecture2.patterns.creational_patterns.singleton;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {


        Singleton test1 = Singleton.getInstance();
        Singleton test2 = Singleton.getInstance();


        test1.print();
        test2.print();

        System.out.println(test1 == test2);


        Calendar calendar = Calendar.getInstance();


        calendar.get(Calendar.DATE);
        calendar.get(Calendar.YEAR);
        calendar.get(Calendar.MONTH);

    }


}
