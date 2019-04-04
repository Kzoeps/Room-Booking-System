/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.ia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author zoepa
 */
public class checker {
    public static int pot =0;
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Room ID");
            int id = sc.nextInt();
            System.out.println("Enter Check in Date");
            String checkIn = sc.next();
            System.out.println("Enter Check out Date");
            String checkOut = sc.next();
            checkRooms(id,checkIn,checkOut); 
            if (pot==1)
                System.out.print("Room Conflict");
            }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void checkRooms(int id,String checkIn, String checkOut){
        try{
            String url = "jdbc:sqlite:/Users/zoepa/NetBeansProjects/CS IA/Database/hotel.db";
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();
            ResultSet loop = stmt.executeQuery("SELECT * FROM Rooms");
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date userCheckIn = df.parse(checkIn);
            Date userCheckOut = df.parse(checkOut);
            while(loop.next()){
                System.out.println(loop.getInt(3));
                if(id==loop.getInt(3)){
                     String chckIn = loop.getString(4);
                     String chckOut = loop.getString(5);
                     Date dbChckIn = df.parse(chckIn);
                     Date dbChckOut = df.parse(chckOut);
                     if((userCheckIn.equals(dbChckIn))){
                         pot = 1;
                     }
                     else if(userCheckIn.equals(dbChckOut)){
                         pot = 1;
                                }
                    else if(userCheckOut.equals(dbChckOut)){
                        pot = 1;
                    }
                    else if((userCheckOut.equals(dbChckOut))){
                        pot = 1;
                    }
                    else if((userCheckIn.before(dbChckIn))&&(userCheckOut.before(dbChckOut))){
                        pot = 1;
                    }
                    else if((userCheckIn.before(dbChckIn))&&(userCheckOut.after(dbChckOut))){
                        pot = 1;
                    }
                    else if((userCheckIn.after(dbChckIn))&&(userCheckOut.before(dbChckOut))){
                        pot = 1;
                    }
                    else if(((userCheckIn.after(dbChckIn))&&userCheckOut.before(dbChckOut))){
                        pot = 1;
                    }
                    else if(((userCheckOut.after(dbChckIn))&&userCheckOut.before(dbChckOut))){
                        pot = 1;
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
