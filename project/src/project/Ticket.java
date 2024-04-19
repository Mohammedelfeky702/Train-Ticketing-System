package project;
/*- `ticketID: String`
  - `passenger: Passenger`
  - `train: Train`
  - `departureStation: Station`
  - `arrivalStation: Station`
  - `departureTime: DateTime`
  - `seatNumber: int`
  - `price: double`*/
public class Ticket {
    private Passenger passenger;
    private Train train;
    private Station departurestaion;
    private Station arrivalstaion;
    private int seatNumber;
    private double price; 

  /*   public Ticket(Passenger passenger, Train train, Station departurestaion, Station arrivalstaion, int seatNumber, double price) {
        this.passenger = passenger;
        this.train = train;
        this.departurestaion = departurestaion;
        this.arrivalstaion = arrivalstaion;
        this.seatNumber = seatNumber;
        this.price = price;
    } */

    public Ticket(Passenger passenger, Train train, Station departurestaion, Station arrivalstaion, int seatNumber, double price) {
        this.passenger = passenger;
        this.train = train;
        this.departurestaion = departurestaion;
        this.arrivalstaion = arrivalstaion;
        this.seatNumber = seatNumber;
        this.price = price;
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
  // `calculatePrice(): double`  
  public void TicketDetails(){
      System.out.println(" ");
  }
  
}
