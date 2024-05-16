package javaapplication51;

public class Passenger {
private String firstname;    
private String laststname; 
private String email;
private String gender;
private String password;
private int id;

    public Passenger() {
    }

    public Passenger(String firstname, String laststname, String email, String gender, String password, int id) {
        this.firstname = firstname;
        this.laststname = laststname;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLaststname() {
        return laststname;
    }

    public void setLaststname(String laststname) {
        this.laststname = laststname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passenger{" + "firstname=" + firstname + ", laststname=" + laststname + ", email=" + email + ", gender=" + gender + ", password=" + password + ", id=" + id + '}';
    }
    
    public static void main(String[] args) {
        Passenger passenger =new  Passenger();
        System.out.println(""+passenger.toString());
    }
}
