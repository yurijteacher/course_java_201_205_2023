package group202.practical2;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MyClock {

    public static void main(String[] args) {



        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Calendar calendar = Calendar.getInstance();

                int hour = calendar.get(Calendar.HOUR);
                int minute = calendar.get(Calendar.MINUTE);
                int second = calendar.get(Calendar.SECOND);

                System.out.println(hour +":" + minute+":" + second);
            }
        };


        timer.schedule(timerTask, 0,1000);

    }

}
