package javaapplication51;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JavaApplication51 {
    public static int power(int voltage, int current) {
		return (int) Math.pow(voltage,current);
	}
    public static void main(String[] args) {
        	
                System.out.println(power(10, 230));
/*
Login l=new Login();
l.setVisible(true);

// Database connection parameters
    
 
        // SQL query to add a column
        
//String sql = "ALTER TABLE your_table_name ADD COLUMN new_column_name VARCHAR(50)";
   String sql = "alter table users add column (nt varchar(30));";
        try (//   conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/Train1", "root", "70207020");
            // Establishing a connection to the database
   Connection      conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/Train1","root","70207020");
            // Creating a statement
            Statement statement = conn.createStatement()
        ) {
            // Executing the SQL query to add the column
            statement.executeUpdate(sql);
            System.out.println("Column added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        } */
    }
}


