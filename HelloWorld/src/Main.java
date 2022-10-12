import java.awt.Color;

public class Main {

    public static void main( String args[] ) {

        // anything we put here is going to be executed when the program is run
        System.out.println("Hello World");

        Car car = new Car(32,"1BT2005",Color.blue,true);
        System.out.println(car.toString());
    }
}

