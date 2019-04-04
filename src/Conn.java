/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.ia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zoepa
 */
public class Conn {
        
    public String url = "jdbc:sqlite:/Users/zoepa/NetBeansProjects/CS IA/Database/hotel.db";    
    public String driverName = "com.mysql.jdbc.Driver";   
    public Connection con;
    public void Connection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url);
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            } catch (SQLException ex) {
                Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
    }
}
