package javaapplication51;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Database {
    Connection conn ;
      public  void initializeDatabaseConnection() {
          
        String url = "jdbc:mysql://localhost:3306/Train1";
        String user = "root";
        String password = "70207020";  

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
       
        }
    }
}
