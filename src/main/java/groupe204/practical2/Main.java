package groupe204.practical2;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Clock clock = new Clock(1,32);
        System.out.println(clock);

        ClockExt clockExt = new ClockExt(23,25,59);
        System.out.println(clockExt);

        ClockExt2 clockExt2 = new ClockExt2(23,45,34,0);
        clockExt2.setHour(14);
        clockExt2.setMinute(59);
        clockExt2.setSecond(59);
        System.out.println(clockExt2);


        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                clockExt2.nextMillisecond();
                System.out.println(clockExt2);
            }
        };

        timer.schedule(timerTask, 0, 100);


    }



}
