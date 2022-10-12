import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // create a concert calendar
        ConcertCalendar calendar = new ConcertCalendar();

        // add concerts
        calendar.addConcert("Flor", "9:30 Club", new Date("October",12,2019),new Time(7,30,true),20.00, 200);
        calendar.addConcert("Tiny Moving Parts", "Rams Head Live", new Date("November",5,2019),new Time(8,30,true),25.00, 200);
        calendar.addConcert("Daniel Cesar", "The Anthem", new Date("December",20,2019),new Time(8,0,true),65.00, 200);

        // initialize ticket system
        System.out.println("Initializing Ticket System....\n");

        // print concert list for user
        calendar.printCalendar();
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        boolean buyAnotherTicket;

        // ask the user for input
        do {

            System.out.print("\nEnter ticket details below.\nMonth: ");
            String month = scan.nextLine();
            System.out.print("Day: ");
            int day = Integer.parseInt(scan.nextLine());
            System.out.print("Year: ");
            int year = Integer.parseInt(scan.nextLine());
            System.out.print("Time: ");
            String[] timeArr = scan.nextLine().split(":");
            int hour = Integer.parseInt(timeArr[0]);
            int mins = Integer.parseInt(timeArr[1]);
            System.out.print("Is this an evening concert (yes/no)? ");
            boolean isPM = scan.nextLine().equals("yes") ? true : false;
            System.out.print("What location? ");
            String location = scan.nextLine();

            // buy the ticket
            System.out.print("\nThank you! Purchasing ticket...\n\n");
            calendar.buyTicket(new Date("October", 12, 2019), new Time(7, 30, true), "9:30 Club");

            // ask the user for another purchase
            System.out.print("\nWould you like to buy another ticket? ");
            buyAnotherTicket = scan.nextLine().equals("yes") ? true : false;
        }
        while ( buyAnotherTicket );

    }
}
