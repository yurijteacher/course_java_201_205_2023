package groupe203.practical2;

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
                calendar.get(Calendar.MILLISECOND);

                System.out.println("hour=" + hour + ", minute=" + minute + ", second=" + second);


            }
        };

        timer.schedule(timerTask, 0, 1000); // 1c
    }
}
