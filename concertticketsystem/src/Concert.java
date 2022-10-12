// represents a concert object
// band, location, date, time, price, number of tickets available, sold out status
public class Concert {

    String band, location;
    Date date;
    Time time;
    Double price;
    int ticketsAvailable;
    boolean soldOut;

    /**
     * Constructor
     * @param band
     * @param location
     * @param date
     * @param time
     * @param price
     * @param ticketsAvailable
     */
    public Concert(String band, String location, Date date, Time time, Double price, int ticketsAvailable) {
        this.band = band;
        this.location = location;
        this.date = date;
        this.time = time;
        this.price = price;
        this.ticketsAvailable = ticketsAvailable;
        soldOut = false;
    }

    /**
     * Returns the date of the concert
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * Returns the time of the concert
     * @return
     */
    public Time getTime() {
        return time;
    }

    /**
     * Buys a ticket for this concert
     */
    public void buyTicket() {
        ticketsAvailable--;
        if(ticketsAvailable == 0) {
            soldOut = true;
        }
    }

    /**
     * Returns whether this concert is sold out or not
     * @return
     */
    public boolean isSoldOut() {
        return soldOut;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "band='" + band + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", price=" + price +
                '}';
    }
}
