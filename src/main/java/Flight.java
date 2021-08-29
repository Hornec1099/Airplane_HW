import Crew.CabinCrew;
import Crew.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String leaving;
    private String time;
    private CabinCrew[] crew;
    private ArrayList<Passenger> passengers;

    public Flight(Pilot pilot, Plane plane, String flightNo, String destination, String leaving, String time) {
        this.pilot= pilot;
        this.plane =plane;
        this. flightNo =flightNo;
        this.destination =destination;
        this.leaving =leaving;
        this.time= time;
        this.crew = new CabinCrew[2];
        this.passengers = new ArrayList<>();
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getLeaving() {
        return leaving;
    }

    public String getTime() {
        return time;
    }

   public void addCrew(CabinCrew crew, int index){
        this.crew[index] = crew;
   }

    public void addPassenger(Passenger passenger) {
        if( checkSeats() >0){
        this.passengers.add(passenger);
    }}

    public int countPassengers() {
        return this.passengers.size();
    }


    public int checkSeats() {
       int capacity = this.plane.getCapacityFromEnum();
       int passengerCount = countPassengers();
       return capacity -passengerCount;
    }
}
