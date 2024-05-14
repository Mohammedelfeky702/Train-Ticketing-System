package project;


import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Ticket extends Station{
    // Declaring Variables
private String TicketId; private Passenger passenger; private Train train;
private Station departurestation; private Station arrivalstation;
private int seatNumber;private double price; private String departureTime;
private String type; // Ticket type (e.g., "Standard", "First Class", "Economy")
  // Constructor to define attributes
    public Ticket(String TicketId, Passenger passenger, Train train, Station departurestation, Station arrivalstation, int seatNumber, double price, String departureTime, String type, int statioID, String staionName, String location) {
        super(statioID, staionName, location);
        this.TicketId = TicketId;
        this.passenger = passenger;
        this.train = train;
        this.departurestation = departurestation;
        this.arrivalstation = arrivalstation;
        this.seatNumber = seatNumber;
        this.price = price;
        this.departureTime = departureTime;
        this.type = type;
    }
   
  // setters and getters 
    public String getTicketId() {
        return TicketId;
    }

    public void setTicketId(String TicketId) {
        this.TicketId = TicketId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getDeparturestation() {
        return departurestation;
    }

    public void setDeparturestation(Station departurestation) {
        this.departurestation = departurestation;
    }

    public Station getArrivalstation() {
        return arrivalstation;
    }

    public void setArrivalstation(Station arrivalstation) {
        this.arrivalstation = arrivalstation;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    // method to print the dettails of the booking
       public void TicketDetails(){

    System.out.println("Ticket ID: " + TicketId);
    System.out.println("Passenger: " + passenger.getName());
    System.out.println("Train: " + train.getTrainID());
    System.out.println("Departure Station: " + departurestation.getStaionName());
    System.out.println("Arrival Station: " + arrivalstation.getStaionName());
    System.out.println("Seat Number: " + seatNumber);
    System.out.println("Price: " + price);
    System.out.println("Departure Time: " + departureTime.toString());
    System.out.println();
}
/**********public double CalcPrice(){return 0;};*/
     // Calculate price based on ticket type
    public double CalcPrice() {
        switch (this.type.toLowerCase()) {
            case "standard":
                return 10.0;
            case "first class":
                return 15.0;
            case "economy":
                return 7.0;
            default:
                return 0.0;
        }}

    @Override
    public String toString() {
        return "Ticket{" + "TicketId=" + TicketId + ", passenger=" + passenger + ", train=" + train + ", departurestation=" + departurestation + ", arrivalstation=" + arrivalstation + ", seatNumber=" + seatNumber + ", price=" + price + ", departureTime=" + departureTime + ", type=" + type + '}';
    }
    
}

