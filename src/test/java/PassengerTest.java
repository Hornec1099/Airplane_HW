import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("John Jacob", 2);
    }

    @Test
    public void HasName(){
        assertEquals("John Jacob", passenger.getName());
    }

    @Test
    public void hasNoOfBags(){
        assertEquals( 2, passenger.getNoOfBags());
    }
}
