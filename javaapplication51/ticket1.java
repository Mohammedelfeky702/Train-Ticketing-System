package javaapplication51;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


import static  javaapplication51.Search1.JourneyID;

public class ticket1 extends javax.swing.JFrame {
   private  String totalPriceString;     
    private static Connection conn;
    private static final String url = "jdbc:mysql://localhost:3306/Train1";
    private static final String user = "root";
    private static final String password = "70207020";

   static  int trainID ;
   static String trainn;
   static String departtime;
  static   String arrivaltime;

   static double totalprice;
  

   double disprice;
   double passprice;
   double ticketprice;


 double distance = 1  ;
 static String trainclass ;

    String passengertype =Search1.passengertype;
    String  tickettype =Search1.tickettype;
    
    
    public double calcluteprice(){
  if (trainclass == "First Class"){
               //    f=0.15;
              disprice=0.15*distance;
 
      }
              else  if (trainclass =="Standard"){
                //      s =0.1;
              disprice=0.1*distance;
                    
              } else {
              //      e=0.07;
               disprice =0.07*distance;
              }
                if(tickettype =="Single"){
                    ticketprice=1;
                } else {
                    ticketprice =2;
                }
                if (passengertype=="Adult"){
                    passprice=1;
                }else{
                    passprice=0.5;
                }
                    
     totalprice=disprice*passprice*ticketprice;
 
 totalPriceString = "$" + String.valueOf(totalprice);


return totalprice;
}
public ticket1() throws SQLException {
          initComponents();


    

        try {
          
            conn = DriverManager.getConnection(url, user, password);
         
String sql = "SELECT * FROM Journey WHERE journeyid = ? ";
PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println("Journey id : "+JourneyID);
 statement.setInt(1, JourneyID);
            // Execute the query and retrieve the result set
            ResultSet resultSet = statement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                 trainID = resultSet.getInt("trainid");
                 trainn=resultSet.getString("trainname");
                 departtime = resultSet.getString("departtime");
                 arrivaltime = resultSet.getString("arrivaltime");
                 trainclass = resultSet.getString("trainclass");
                 distance=resultSet.getDouble("distance");

        String stra =String.valueOf(trainID);
                jTextField1.setText(stra);
                jTextField2.setText(trainn);
                jTextField3.setText(departtime);
                jTextField4.setText(arrivaltime);
                jTextField5.setText(trainclass);
                
               price.setText(String.valueOf(calcluteprice())+"$");
       
               
 }
  
    } catch (SQLException ex) {
        // Log the error and show a user-friendly message
        System.err.println("Database Error: " + ex.getMessage());
        JOptionPane.showMessageDialog(this, "An error occurred while fetching data.", "Error", JOptionPane.ERROR_MESSAGE);
    }
 
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(ticket1.class.getName()).log(Level.SEVERE, null, ex);
        } 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trainname = new javax.swing.JLabel();
        txtdept = new javax.swing.JLabel();
        txtdept1 = new javax.swing.JLabel();
        txtdept2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();

        trainname.setBackground(new java.awt.Color(255, 255, 255));
        trainname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        trainname.setForeground(new java.awt.Color(204, 0, 0));
        trainname.setText("jLabel14");
        trainname.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtdept.setBackground(new java.awt.Color(255, 255, 255));
        txtdept.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtdept.setForeground(new java.awt.Color(204, 0, 0));
        txtdept.setText("jLabel15");
        txtdept.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtdept1.setBackground(new java.awt.Color(255, 255, 255));
        txtdept1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtdept1.setForeground(new java.awt.Color(204, 0, 0));
        txtdept1.setText("jLabel15");
        txtdept1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtdept2.setBackground(new java.awt.Color(255, 255, 255));
        txtdept2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtdept2.setForeground(new java.awt.Color(204, 0, 0));
        txtdept2.setText("jLabel15");
        txtdept2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Train ID :");

        jLabel8.setText("Train Name :");

        jLabel9.setText("Depart Time :");

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Arrival Time :");

        jLabel13.setText("Train Class :");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("      Booking Ticket");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Price");

        price.setEditable(false);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(84, 84, 84))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  Search1 s=new Search1();
        s.setVisible(true);
        s.pack();
        s.setLocationRelativeTo(null);
        this.dispose();    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   

    try {                                         
        printicket p = new printicket();
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        this.dispose();
        
        // Initialize seat management logic here if needed
        
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Ticket (journeyid,price,passid) VALUES (?,?,?)")) {
            pstmt.setInt(1, Search1.JourneyID);
            //   pstmt.setInt(2,Account.userid );
            pstmt.setInt(3,Account.userid);
            pstmt.setDouble(2, calcluteprice());
            
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Ticket inserted successfully!");
                JOptionPane.showMessageDialog(null, "Ticket has been created successfully!");
            }
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "An error occurred while creating ticket: " + e.getMessage());
        }
        
        
    } catch (SQLException ex) {
           Logger.getLogger(ticket1.class.getName()).log(Level.SEVERE, null, ex);
    }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
      
    }//GEN-LAST:event_priceActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                   }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField price;
    private javax.swing.JLabel trainname;
    private javax.swing.JLabel txtdept;
    private javax.swing.JLabel txtdept1;
    private javax.swing.JLabel txtdept2;
    // End of variables declaration//GEN-END:variables
}
