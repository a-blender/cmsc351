import java.util.ArrayList;
import java.util.HashMap;

public class ConcertCalendar {

    // calendar of dates mapped to lists of concerts
    private static HashMap<String, ArrayList<Concert>> calendar;

    /**
     * Constructor
     */
    public ConcertCalendar() {
        calendar = new HashMap<>();
    }

    /**
     * Add a concert to the calendar
     * @param band
     * @param location
     * @param date
     * @param time
     * @param price
     * @param ticketsAvailable
     * @return
     */
    public boolean addConcert(String band, String location, Date date, Time time, Double price, int ticketsAvailable) {

        if (calendar.containsKey(location)) {

            for (Concert concert : calendar.get(location)) {
                if (concert.getDate().equals(date) && concert.getTime().equals(time)) {
                    return false;
                }
                calendar.get(location).add(new Concert(band, location, date, time, price, ticketsAvailable));
            }
        }
        else {
            ArrayList<Concert> list = new ArrayList<>();
            list.add(new Concert(band, location, date, time, price, ticketsAvailable));
            calendar.put(location, list);
        }
        return true;
    }

    /**
     * remove a concert from the calendar
     * @param location
     * @param date
     * @return
     */
    public boolean removeConcert(String location, Date date) {
        return false;
    }

    /**
     * buy a ticket to a concert on the calendar
     * @param location
     * @param date
     * @return
     */
    public boolean buyTicket(Date date, Time time, String location) {

        if ( calendar.containsKey(location)) {

            for (Concert concert : calendar.get(location)) {
                if (concert.getDate().equals(date) && concert.getTime().equals(time)) {

                    if (!concert.isSoldOut()) {
                        concert.buyTicket();
                        System.out.println("Congrats! You are attending this concert: \n" + concert.toString());
                        return true;
                    }
                }
            }
        }
        System.out.println("I'm sorry. Your order could not be processed.");
        return false;
    }

    /**
     * Prints out the concert calendar
     */
    public void printCalendar() {

        System.out.println("CONCERT CALENDAR");
        for (String location : calendar.keySet()) {
            System.out.println(location);

            for (Concert concert : calendar.get(location)) {
                System.out.println(concert.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "ConcertCalendar{" +
                "calendar=" + calendar +
                '}';
    }
}