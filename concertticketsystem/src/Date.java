import java.util.Objects;

public class Date {

    private String month;
    private int day, year;

    /**
     * Constructor
     * @param month
     * @param day
     * @param year
     */
    public Date(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day &&
                year == date.year &&
                Objects.equals(month, date.month);
    }

    @Override
    public String toString() {
        return "Date{" +
                "month='" + month + '\'' +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
