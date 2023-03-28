package groupe203.practical2;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Clock clock = new Clock(22,59);
        System.out.println(clock);

        ClockExt clockExt = new ClockExt(22,59,59);
        System.out.println(clockExt);

        ClockExt2 clockExt2 = new ClockExt2(22,22,22,22);
        System.out.println(clockExt2);

        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                clockExt.nextSecond();
                System.out.println(clockExt);
            }
        };

        timer.schedule(timerTask, 0, 1000);


    }



}
