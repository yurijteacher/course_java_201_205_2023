package group202.practical2;

public class ClockExt extends Clock {
    private int second;

    public int getSecond() {
        return second;
    }

    public void setSecond() {}

    public ClockExt(int second) {
        this.second = second;
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    @Override
    public String toString() {
        return "ClockExt{" +
                "hour=" + getHour() +
                ", minute=" + getMinute() +
                ", second=" + second +
                '}';
    }


    public void nextSecond(){

        second++;

        if(second==60){
            super.nextMinute();
            second=0;
        }


    }
}
