package project;
import java.util.*;
public class Station {
private int statioID ;
private String staionName;
private String location;

    public Station(int statioID, String staionName, String location) {
        this.statioID = statioID;
        this.staionName = staionName;
        this.location = location;
    }

    public int getStatioID() {
        return statioID;
    }

    public void setStatioID(int statioID) {
        this.statioID = statioID;
    }

    public String getStaionName() {
        return staionName;
    }

    public void setStaionName(String staionName) {
        this.staionName = staionName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

public void getStationinfo(){
    System.out.println("Station ID"+getStatioID());
    System.out.println("Station Name"+getStaionName());
    System.out.println("Station Location"+getLocation());
}
}
