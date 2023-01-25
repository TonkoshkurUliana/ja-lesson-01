public class Time implements Comparable<Time> {
    int hour;
    int min;


    public Time(int hour, int min) {
        if (hour<=24 & hour>=0)
            this.hour = hour;
        if (min>=0 & min<=60)
            this.min = min;
        else{
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException exception){
                System.out.println("Hour in diapason 0-24 Min in 0-60 only! ");
            }
        }
    }

    public Time() {
    }

    public int getMin() {
        return min;
    }

    public Time setMin(int min) {
        this.min = min;
        return this;
    }

    public int getHour() {
        return hour;
    }

    public Time setHour(int hour) {
        this.hour = hour;
        return this;
    }

    @Override
    public String toString() {
        return  hour +
                ":" + min;
    }

    @Override
    public int compareTo(Time o) {
        return 0;
    }


}
