package project;
public class Ticket {
    private Passenger passenger;
    private Train train;
    private Station departurestaion;
    private Station arrivalstaion;
    private int seatNumber;
    private double price; 

  public Ticket(String ticketID, Passenger passenger, Train train, Station departurestaion, Station arrivalstaion, int seatNumber, double price) {
        this.ticketID = ticketID;
        this.passenger = passenger;
        this.train = train;
        this.departurestaion = departurestaion;
        this.arrivalstaion = arrivalstaion;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
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

    public Station getDeparturestaion() {
        return departurestaion;
    }

    public void setDeparturestaion(Station departurestaion) {
        this.departurestaion = departurestaion;
    }

    public Station getArrivalstaion() {
        return arrivalstaion;
    }

    public void setArrivalstaion(Station arrivalstaion) {
        this.arrivalstaion = arrivalstaion;
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

  public void TicketDetails(){
      System.out.println(" ");
  }
  
}
