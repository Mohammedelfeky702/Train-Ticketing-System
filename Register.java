package javaapplication51;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register extends javax.swing.JFrame {

 private String userid;
    private String loggedInUserMail;
    
    public Register() {
        
        initComponents();

    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstn = new javax.swing.JTextField();
        lastn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        regist = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        back = new javax.swing.JButton();
        l = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setMinimumSize(new java.awt.Dimension(600, 800));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel4.setPreferredSize(new java.awt.Dimension(550, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("First Name :");

        firstn.setColumns(10);
        firstn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnActionPerformed(evt);
            }
        });

        lastn.setColumns(10);
        lastn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Last Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Email address :");

        mail.setColumns(25);
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });

        pass.setColumns(25);
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Password :");

        regist.setBackground(new java.awt.Color(0, 102, 102));
        regist.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regist.setForeground(new java.awt.Color(255, 255, 255));
        regist.setText("Register");
        regist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registActionPerformed(evt);
            }
        });

        male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male);
        male.setSelected(true);
        male.setText("Male");

        female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication51/left-arrow.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        l.setForeground(new java.awt.Color(255, 0, 0));

        l2.setForeground(new java.awt.Color(255, 0, 0));

        l3.setForeground(new java.awt.Color(255, 0, 0));

        l4.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass)
                            .addComponent(mail)
                            .addComponent(lastn)
                            .addComponent(firstn)
                            .addComponent(regist, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(l)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(l2)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(l3)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(l4)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(34, 34, 34)
                .addComponent(regist, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registActionPerformed
      Search searchform=new Search();
      String firstName = firstn.getText();
      String lastName = lastn.getText();
      String emailValue = mail.getText();
      String password = pass.getText();
      String gender = male.isSelected() ? "male" : "female";
      
     

// Regular expressions for validation
String nameRegex = "^[A-Za-z\\s-]+$"; // Allows letters, spaces, and hyphens
String emailRegex = "^(?!\\.)(?!.*\\.{2})[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(\\.[A-Za-z]{2,})?$";
// String mailRegex="\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
// Validate lengths and patterns
boolean isValidFirstName = firstName.length() >= 3 && firstName.matches(nameRegex);
boolean isValidLastName = lastName.length() >= 3 && lastName.matches(nameRegex);
boolean isValidEmail = emailValue.length() >= 16 && emailValue.matches(emailRegex);
boolean isValidPassword = password.length() >= 8;

if (isValidFirstName && isValidLastName && isValidEmail && isValidPassword) {
              searchform.setVisible(true);
            
      searchform.setLocationRelativeTo(null);
      this.dispose(); // to make this page disapper when you move for next page.
   
} else {
      if (firstn.getText().isEmpty()) {
          
    l.setText("This field is required");
} else if (firstn.getText().length() <= 3 || firstn.getText().matches("^(.)\\1+$")) {
    // Check for minimum length and if the name is a repeated character
    l.setText("Invalid First Name");
} else if (!firstn.getText().matches("^[A-Za-z]+$")) {
    // Check for valid characters after checking for repeated characters
    l.setText("Invalid First Name");
}

if (lastn.getText().isEmpty()) {
    l2.setText("This field is required");
} else if (lastn.getText().length() <= 3 || lastn.getText().matches("^(.)\\1+$")) {
    // Check for minimum length and if the name is a repeated character
    l2.setText("Invalid Last Name");
} else if (!lastn.getText().matches("^[A-Za-z]+$")) {
    // Check for valid characters after checking for repeated characters
    l2.setText("Invalid Last Name");
}

if (mail.getText().isEmpty()) {
    l3.setText("This field is required");
} else if (mail.getText().length() <= 16) {
    l3.setText("Invalid Email");
} else if (!mail.getText().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
    l3.setText("Invalid Email");
}

if (pass.getText().isEmpty()) {
    l4.setText("This field is required");
} else if (pass.getText().length() <= 8) {
    l4.setText("Password too short");
}

// Only proceed if all fields are valid
if (!firstn.getText().isEmpty() && firstn.getText().length() >= 3 && !firstn.getText().matches("^(.)\\1+$") && firstn.getText().matches("^[A-Za-z]+$") &&
    !lastn.getText().isEmpty() && lastn.getText().length() >= 3 && !lastn.getText().matches("^(.)\\1+$") && lastn.getText().matches("^[A-Za-z]+$") &&
    !mail.getText().isEmpty() && mail.getText().length() >= 16 && !mail.getText().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$") &&
    !pass.getText().isEmpty() && pass.getText().length() >= 8
) {
    searchform.setVisible(true);
   
    searchform.setLocationRelativeTo(null);
    this.dispose();
}

// Retrieve values from GUI text fields
firstName = firstn.getText();
lastName = lastn.getText();
emailValue = mail.getText();
password = pass.getText();
gender = male.isSelected()? "male" : "female";

// JDBC URL and credentials
String url = "jdbc:mysql://localhost:3306/Train1";
String user = "root";
String pass = "70207020";

String checkEmail = "SELECT * FROM passenger WHERE mail =?";
try (Connection conn = DriverManager.getConnection(url, user, pass);
     PreparedStatement checkStmt = conn.prepareStatement(checkEmail)) {
    checkStmt.setString(1, emailValue);
    ResultSet rs = checkStmt.executeQuery();
    if (rs.next()) {
        JOptionPane.showMessageDialog(null, "Email already exists! Please use a different email.");
    } else {
        String sql = "INSERT INTO passenger (passid, firstn, lastn, mail, pass, gender) VALUES (NULL,?,?,?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, emailValue);
            pstmt.setString(4, password);
            pstmt.setString(5, gender);

            // Execute the statement
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was registered successfully!");
                JOptionPane.showMessageDialog(null, "Account has been created successfully!");
            }

            // Reset text fields
            firstn.setText("");
            lastn.setText("");
            mail.setText("");
            this.pass.setText("");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while creating account: " + e.getMessage());
        }
    }
}         catch (SQLException ex) {
              Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
          }}
    }//GEN-LAST:event_registActionPerformed

    private void lastnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnActionPerformed
 
    }//GEN-LAST:event_lastnActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       Login b=new Login();
       b.setVisible(true);
       b.pack();
       b.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_backActionPerformed


    private void firstnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnActionPerformed


}
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {

    }//GEN-LAST:event_firstnActionPerformed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
    Search searchForm = new Search();
       searchForm.setVisible(true);
    searchForm.setLocationRelativeTo(null);
   this.dispose();
}
    }//GEN-LAST:event_passKeyPressed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstn;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JTextField lastn;
    private javax.swing.JTextField mail;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField pass;
    private javax.swing.JButton regist;
    // End of variables declaration//GEN-END:variables
}
