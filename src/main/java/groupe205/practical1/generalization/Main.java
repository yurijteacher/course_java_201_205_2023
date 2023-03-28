package groupe205.practical1.generalization;

import groupe204.practical2.Clock;
import groupe204.practical2.ClockExt;
import groupe204.practical2.ClockExt2;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Clock c =new Clock(20,23);



        ClockExt2 clockExt2 = new ClockExt2(20,59,59,234);
        System.out.println(c);

        System.out.println(clockExt2);
        ClockExt clockExt = new ClockExt(20,20,20);

        Timer timer = new Timer();

        TimerTask timerTask =new TimerTask() {
            @Override
            public void run() {
                clockExt.nextSecond();
                System.out.println(clockExt);
            }
        };


        timer.schedule(timerTask,0,1000);


    }
}
