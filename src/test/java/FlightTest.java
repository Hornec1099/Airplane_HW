import Crew.CabinCrew;
import Crew.Pilot;
import Enums.PlaneType;
import Enums.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;

    @Before
    public void before(){
        pilot = new Pilot("John", RankType.CAPTAIN, "ABC123");
        cabinCrew1 = new CabinCrew("Joan",RankType.FLIGHTATTENDANT);
        cabinCrew2 = new CabinCrew("Josh",RankType.FLIGHTATTENDANT);
        passenger1 = new Passenger( "Michael", 4);
        passenger2 = new Passenger( "Mark", 2);
        passenger3 = new Passenger( "Michaela", 1);
        plane = new Plane("EasyJet", PlaneType.PROPELLER);
        flight = new Flight(pilot, plane, "245", "Barbados", "GLA", "14:00");
        flight.addCrew(cabinCrew1, 0);
        flight.addCrew(cabinCrew2, 1);
    }

    @Test
    public void canAddPassengers(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.countPassengers());
    }
    @Test
    public void canCheckSeatsLeft(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger2);
        assertEquals(1, flight.checkSeats());
    }
    @Test
    public void cantBookPassengersIfNoSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger2);

        assertEquals(4, flight.countPassengers());

    }
}
