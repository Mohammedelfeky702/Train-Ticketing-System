package project;

import java.util.List;

public class Train {
    

private String trainID;
private int capacity;
private String trainName;
private List<Station> route;
private String trainClass;

    public Train(String trainID, int capacity, String trainName, List<Station> route, String trainClass) {
        this.trainID = trainID;
        this.capacity = capacity;
        this.trainName = trainName;
        this.route = route;
        this.trainClass = trainClass;
    }

    public String getTrainID() {
        return trainID;
    }

    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public List<Station> getRoute() {
        return route;
    }

    public void setRoute(List<Station> route) {
        this.route = route;
    }

    public String getTrainClass() {
        return trainClass;
    }

    public void setTrainClass(String trainClass) {
        this.trainClass = trainClass;
    }


       
    public  void getTrainDetails(){
        System.out.println("Train ID"+getTrainID());
        System.out.println("Train Name"+getTrainName());
        System.out.println("Capacity"+getCapacity());
        System.out.println("Train Class"+getTrainClass());
        System.out.println("Rout");
        
        for(Station station : route){
            System.out.print(station.getStaionName()+" ");
         }
        System.out.println();
     }
}
    


