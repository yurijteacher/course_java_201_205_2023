package groupe203.practical2;

public class ClockExt2 extends ClockExt {
    private int millisecond;

    public ClockExt2() {
    }

    public ClockExt2(int millisecond) {
        this.millisecond = millisecond;
    }

    public ClockExt2(int hour, int minute, int second, int millisecond) {
        super(hour, minute, second);
        this.millisecond = millisecond;
    }

    @Override
    public String toString() {
        return "ClockExt2{" +
                "hour=" + getHour()+
                ", minute=" + getMinute() +
                ", second=" + getSecond() +
                "millisecond=" + millisecond +
                '}';
    }
}
