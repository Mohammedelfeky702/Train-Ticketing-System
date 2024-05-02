/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication176;

import javaapplication176.project.javaapplication51.Change_password;

/**
 *
 * @author mahmo
 */
public class JavaApplication176 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Account frame=new Account();
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
        
        new Change_password();
    }
    
}
