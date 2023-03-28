package group202.practical2;

public class ClockExt2 extends ClockExt {

    private int millisecond;

    public ClockExt2(int second) {
        super(second);
    }

    public ClockExt2(int second, int millisecond) {
        super(second);
        this.millisecond = millisecond;
    }

    public ClockExt2(int hour, int minute, int second, int millisecond) {
        super(hour, minute, second);
        this.millisecond = millisecond;
    }

    @Override
    public String toString() {
        return "ClockExt2{" +
                "hour=" + getHour() +
                ", minute=" + getMinute() +
                ", second=" + getSecond() +
                ", millisecond=" + millisecond +
                '}';
    }


    public void nextMillisecond(){

        millisecond+=50;

        if(millisecond==1000){
            super.nextSecond();
            millisecond=0;
        }
    }
}
