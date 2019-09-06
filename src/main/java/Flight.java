import java.util.ArrayList;

public class Flight {

   private ArrayList<Passenger> passengers;
   private Plane plane;
   private String flightNo;
   private String destination;
   private String departureAirport;
   private String departureTime;

   public Flight(Plane plane, String flightNo, String destination, String departureAirport, String departureTime){
       this.plane = plane;
       this.flightNo = flightNo;
       this.destination = destination;
       this.departureAirport = departureAirport;
       this.departureTime = departureTime;
       this.passengers = new ArrayList<Passenger>();
   }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }


    public int getNumberOfPassengers() {
       return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
       if (getNumberOfPassengers() < this.plane.getCapacity()) {
            this.passengers.add(passenger);
        }
    }

    public int availableSeats() {
       return this.plane.getCapacity() - getNumberOfPassengers();
    }
}
