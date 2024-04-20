package project;
import java.util.*;
public class Passenger {
    
    private String passengerId ;
    private String name ;
    private String email ;
    private String paymentInfo ;

    public Passenger(String passengerId, String name, String email, String paymentInfo) {
        this.passengerId = passengerId;
        this.name = name;
        this.email = email;
        this.paymentInfo = paymentInfo;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

  
    public String getPassengerDetails() {
        return "Passenger{" + "passengerId=" + passengerId + ", name=" + name + ", email=" + email + ", paymentInfo=" + paymentInfo + '}';
    }
    
    
}

 
}
