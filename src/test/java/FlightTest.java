import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void setup(){
        flight = new Flight(Plane.AIRBUSA220, "FR5833", "BKK", "EDI", "18:00" );
    }

    @Test
    public void flightStartsWithoutPassengers(){
        assertEquals(0, flight.getNumberOfPassengers());
    }

}
