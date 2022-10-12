public class Time {

    int hour, minutes;
    boolean isPM;

    /**
     * Constructor
     * @param hour
     * @param minutes
     * @param isPM
     */
    public Time(int hour, int minutes, boolean isPM) {
        this.hour = hour;
        this.minutes = minutes;
        this.isPM = isPM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour &&
                minutes == time.minutes &&
                isPM == time.isPM;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minutes=" + minutes +
                ", isPM=" + isPM +
                '}';
    }
}
