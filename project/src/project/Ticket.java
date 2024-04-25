package project;

import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Ticket  {
    // Declaring Variables
private String TicketId; private Passenger passenger; private Train train;
private Station departurestation; private Station arrivalstation;
private int seatNumber;private double price; private Date departureTime;
private String type; // Ticket type (e.g., "Standard", "First Class", "Economy")
  // Constructor to define attributes
    public Ticket(String TicketId, Passenger passenger, Train train, Station departurestation, Station arrivalstation, int seatNumber, double price, Date departureTime) {
        this.TicketId = TicketId;
        this.passenger = passenger;
        this.train = train;
        this.departurestation = departurestation;
        this.arrivalstation = arrivalstation;
        this.seatNumber = seatNumber;
        this.price = price;
        this.departureTime = departureTime;
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
    // method to print the dettails of the booking
     public String Ticket_Details(){
     return  "ID:"+TicketId +"departureTime:"+ departureTime +"seatNumber:"+ seatNumber +"price:"+ price +"From"+ departurestation +"to"+ arrivalstation
       +"passenger:"+ passenger+"Train:"+ train;
     }
/**********public double CalcPrice(){return 0;};*/
     // Calculate price based on ticket type
    public double CalcPrice() {
        switch (this.type.toLowerCase()) {
            case "standard":
                return 50.0;
            case "first class":
                return 70.0;
            case "economy":
                return 30.0;
            default:
                return 0.0;
        }}
}
