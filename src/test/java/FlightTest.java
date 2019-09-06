import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setup(){
        flight1 = new Flight(Plane.AIRBUSA220, "FR5833", "BKK", "EDI", "18:00" );
        flight2 = new Flight(Plane.AIRBUSA120, "FR4833", "GLA", "LHW", "15:00" );
        passenger1 = new Passenger("Chris", 3);
        passenger2 = new Passenger("Frankie", 2);
        passenger3 = new Passenger("Pat", 1);
    }

    @Test
    public void flightStartsWithoutPassengers(){
        assertEquals(0, flight1.getNumberOfPassengers());
    }

    @Test
    public void passengerCanBeAddedToFlight() {
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.getNumberOfPassengers());
    }

    @Test
    public void wontAddMoreThanCapacity() {
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger2);
        flight2.addPassenger(passenger3);
        assertEquals(2, flight2.getNumberOfPassengers());
    }

    @Test
    public void showTheAvailableSeats() {
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        assertEquals(27, flight1.availableSeats());
    }

}
