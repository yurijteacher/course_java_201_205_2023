package groupe204.practical2;

import java.util.*;

public class MyClock {

    public static void main(String[] args) {



//        System.out.println(calendar);

   //     int year = calendar.get(Calendar.YEAR);
   //     int day = calendar.get(Calendar.DATE);



        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR);
                int minute = calendar.get(Calendar.MINUTE);
                int second = calendar.get(Calendar.SECOND);
                int millisecond = calendar.get(Calendar.MILLISECOND);

                // System.out.println(new Date());
                System.out.println(hour + ":" + minute + ":" + second + ":" + millisecond);
            }
        };

        timer.schedule(timerTask, 0, 1000);

    }
}
