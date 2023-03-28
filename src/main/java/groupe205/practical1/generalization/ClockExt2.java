package groupe205.practical1.generalization;

public class ClockExt2 extends ClockExt{

    private int millisecond;

    public ClockExt2() {
    }

    public ClockExt2(int hour, int minute, int second, int millisecond) {
        super(hour, minute, second);
        this.millisecond = millisecond;
    }

    public int getMillisecond() {
        return millisecond;
    }

    public void setMillisecond(int millisecond) {
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
        millisecond+=100;
        if(millisecond==1000){
            super.nextSecond();
            millisecond=0;
        }
    }
}
