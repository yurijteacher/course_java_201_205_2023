package group202.practical2;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Clock clock = new Clock(11,13);
        System.out.println(clock);

        ClockExt clockExt = new ClockExt(23,59,50);
        System.out.println(clockExt);

        ClockExt2 clockExt2 = new ClockExt2(23,59,59,0);
        System.out.println(clockExt2);


        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                // clockExt.nextSecond();
                // System.out.println(clockExt);

                clockExt2.nextMillisecond();
                System.out.println(clockExt2);
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask, 0 , 50);  // 1

    }
}
