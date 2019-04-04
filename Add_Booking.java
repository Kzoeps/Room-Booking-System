/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.ia;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.*;
import java.util.List;
import java.util.Date;
import java.awt.*;

/**
 *
 * @author zoepa
 */
public class Add_Booking extends javax.swing.JFrame {
    int pot = 0;
    /**
     * Creates new form Add_Booking
     */
    public Add_Booking() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cstID = new javax.swing.JTextField();
        cstName = new javax.swing.JTextField();
        noOfGuest = new javax.swing.JTextField();
        noOfRooms = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        todate = new com.toedter.calendar.JDateChooser();
        date = new com.toedter.calendar.JDateChooser();
        save1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rmIDs = new javax.swing.JPanel();
        r2 = new javax.swing.JCheckBox();
        r1 = new javax.swing.JCheckBox();
        r7 = new javax.swing.JCheckBox();
        r3 = new javax.swing.JCheckBox();
        r8 = new javax.swing.JCheckBox();
        r4 = new javax.swing.JCheckBox();
        r9 = new javax.swing.JCheckBox();
        r5 = new javax.swing.JCheckBox();
        r6 = new javax.swing.JCheckBox();
        r10 = new javax.swing.JCheckBox();
        r12 = new javax.swing.JCheckBox();
        r11 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        key = new javax.swing.JTextField();
        exit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        jLabel1.setText("Key ");

        jLabel2.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        jLabel3.setText("Number Of Guests");

        jLabel4.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        jLabel4.setText("Number Of Rooms");

        jLabel5.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        jLabel5.setText("Check In Date");

        cstID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstIDActionPerformed(evt);
            }
        });

        noOfRooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 255, 255));
        jLabel6.setFont(new java.awt.Font("SignPainter", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dekyil Guest House");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 153)));

        save1.setText("Previous");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        jLabel8.setText("Check Out Date");

        jLabel9.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        jLabel9.setText("Room ID");

        r2.setText("102");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r1.setText("101");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        r7.setText("201");
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        r3.setText("103");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        r8.setText("202");
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });

        r4.setText("104");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        r9.setText("203");
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });

        r5.setText("105");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        r6.setText("106");
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        r10.setText("204");
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });

        r12.setText("206");
        r12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r12ActionPerformed(evt);
            }
        });

        r11.setText("205");
        r11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rmIDsLayout = new javax.swing.GroupLayout(rmIDs);
        rmIDs.setLayout(rmIDsLayout);
        rmIDsLayout.setHorizontalGroup(
            rmIDsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rmIDsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rmIDsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rmIDsLayout.createSequentialGroup()
                        .addComponent(r7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r12)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(rmIDsLayout.createSequentialGroup()
                        .addComponent(r1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        rmIDsLayout.setVerticalGroup(
            rmIDsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rmIDsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rmIDsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1)
                    .addComponent(r2)
                    .addComponent(r3)
                    .addComponent(r4)
                    .addComponent(r5)
                    .addComponent(r6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rmIDsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7)
                    .addComponent(r8)
                    .addComponent(r9)
                    .addComponent(r10)
                    .addComponent(r11)
                    .addComponent(r12))
                .addGap(22, 22, 22))
        );

        jLabel7.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        jLabel7.setText("Customer ID");

        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });

        exit1.setText("Clear");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(rmIDs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(noOfGuest, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cstName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cstID)
                                    .addComponent(key, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(109, 109, 109))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(todate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(noOfRooms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cstID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(noOfGuest, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noOfRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(todate, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rmIDs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save1)
                    .addComponent(save)
                    .addComponent(exit)
                    .addComponent(exit1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cstIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstIDActionPerformed
        int length = cstID.getText().length();
        System.out.println(length);
        
            // TODO add your handling code here:
    }//GEN-LAST:event_cstIDActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       try {
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:/Users/zoepa/NetBeansProjects/CS IA/Database/hotel.db";
            Connection conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String dateString = df.format(date.getDate());
            System.out.print(dateString);
            String dateString1 = df.format(todate.getDate());
            int cstid = Integer.parseInt(cstID.getText());
            int length = cstID.getText().length();
            int keys = Integer.parseInt(key.getText());
            int numberOfRooms = Integer.parseInt((String) noOfRooms.getSelectedItem());
            int rmIDSelected = 0; 
            Component[] cs = rmIDs.getComponents();
            for (Component c : cs ){
                if(c instanceof JCheckBox){
                    JCheckBox box = (JCheckBox) c;
                    if(box.isSelected()){
                        rmIDSelected++;
                    }
                }
            }
            int foKeys = 0;
            ResultSet k = stmt.executeQuery("SELECT Primary_key FROM customer");
            while (k.next()){
                if (keys == k.getInt(1)){
                    System.out.println("testing");
                    foKeys = 1;
                }
                if (foKeys == 1)break;
            }
            if (foKeys == 0){
                    if(numberOfRooms == rmIDSelected){
                    ResultSet rs = stmt.executeQuery("SELECT cstid FROM customer;");
                    int flag = 0;
                    while (rs.next()) {
                        if (cstid == rs.getInt(1)) flag = 1;
                        if (flag == 1) break;
                    }
                    int yesNo = 0;
                    if (flag == 1) {
                        int cnfirm = JOptionPane.showConfirmDialog(null, "Customer ID already exist, Are you sure you want to add booking?", "booking?", JOptionPane.YES_NO_OPTION);
                        if(cnfirm == JOptionPane.YES_OPTION){
                            yesNo = 1;
                        }
                    }
                    if ( yesNo == 1||flag==0){
                        if (pot == 0 ){
                            System.out.print(dateString);
                            if(r1.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+101+",'"+dateString+"','"+dateString1+"')");
                                r1.setSelected(false);
                            } 
                            if(r2.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key, customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+102+",'"+dateString+"','"+dateString1+"')");
                                r2.setSelected(false);
                            } 
                            if(r3.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+103+",'"+dateString+"','"+dateString1+"')");
                                r3.setSelected(false);
                            } 
                            if(r4.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+104+",'"+dateString+"','"+dateString1+"')");
                                r4.setSelected(false);
                            } 
                            if(r5.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+105+",'"+dateString+"','"+dateString1+"')");
                                r5.setSelected(false);
                            } 
                            if(r6.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+"."+cstID.getText()+","+106+",'"+dateString+"','"+dateString1+"')");
                                r6.setSelected(false);
                            } 
                            if(r7.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+201+",'"+dateString+"','"+dateString1+"')");
                                r7.setSelected(false);
                            } 
                            if(r8.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+202+",'"+dateString+"','"+dateString1+"')");
                                r8.setSelected(false);
                            } 
                            if(r9.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+203+",'"+dateString+"','"+dateString1+"')");
                                r9.setSelected(false);
                            } 
                            if(r10.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+204+",'"+dateString+"','"+dateString1+"')");
                                r10.setSelected(false);
                            } 
                            if(r11.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+205+",'"+dateString+"','"+dateString1+"')");
                               r11.setSelected(false);
                            } 
                            if(r12.isSelected()){
                                stmt.executeUpdate("INSERT INTO Rooms (Primary_Key,customerID, RoomID, CheckInDate, CheckOutDate) values ("+key.getText()+","+cstID.getText()+","+206+",'"+dateString+"','"+dateString1+"')");
                                r12.setSelected(false);
                            } 
                        stmt.executeUpdate("INSERT INTO customer (Primary_Key,cstid, name, NumberOfGuest, NumberOfRooms, CheckInDate, CheckOutDate) values ("+key.getText()+",'"+cstID.getText()+"', '"+ cstName.getText() +"' , '"+noOfGuest.getText()+"','"+Integer.parseInt(noOfRooms.getSelectedItem().toString())+"','"+dateString+"','"+dateString1+"')");
                        conn.commit();
                        cstID.setText(null);
                        cstName.setText(null);
                        noOfGuest.setText(null);
                        noOfRooms.setSelectedIndex(0);
                        date.setDate(null);
                        todate.setDate(null);
                        key.setText(null);
                        JOptionPane.showMessageDialog(null, "Room Booking Saved");
                        conn.close();

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Room Booked has already been reserved");
                    }

                    }

                }
                else{
                   JOptionPane.showMessageDialog(null,"Number of Rooms selected and Room ID's selected do not match");
                }
            }
        else{
            JOptionPane.showMessageDialog(null, "Key Already Exist!");
        }
            conn.close();
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "something gone wrong");
           e.printStackTrace();
       }
    }//GEN-LAST:event_saveActionPerformed
    public void checkRooms(int id){
         try{
            String url = "jdbc:sqlite:/Users/zoepa/NetBeansProjects/CS IA/Database/hotel.db";
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String dateString = df.format(date.getDate());
            String dateString1 = df.format(todate.getDate());
            Date userCheckIn = df.parse(dateString);
            Date userCheckOut = df.parse(dateString1);
                    try{
                        ResultSet loop = stmt.executeQuery("SELECT * FROM Rooms");
                        while (loop.next()){
                            if (id == loop.getInt(3)){
                                String chckIn =  (loop.getString(4));
                                Date dbChckIn = df.parse(chckIn);//dd first date
                                String chckOut =  (loop.getString(5));
                                Date dbChckOut = df.parse(chckOut);//gg second date
                                if((userCheckIn.equals(dbChckIn))){
                                    JOptionPane.showMessageDialog(null, "Booking Already exist!");
                                    pot = 1;
                                }
                                else if(userCheckIn.equals(dbChckOut)){
                                    JOptionPane.showMessageDialog(null, "Booking Already exist!");
                                    pot = 1;
                                }
                                else if(userCheckIn.equals(dbChckIn)){
                                    JOptionPane.showMessageDialog(null, "Booking Already exist!");
                                    pot = 1;
                                }
                                else if((userCheckOut.equals(dbChckOut))){
                                    JOptionPane.showMessageDialog(null, "Booking Already exist!");
                                    System.out.print("match!");
                                    pot = 1;
                                }
                                else if((userCheckIn.before(dbChckIn))&&(userCheckOut.before(dbChckOut))){
                                    JOptionPane.showMessageDialog(null, "Booking Already exist!");
                                    pot = 1;
                                }
                                else if((userCheckIn.before(dbChckIn))&&(userCheckOut.after(dbChckOut))){
                                    JOptionPane.showMessageDialog(null, "Booking Already exist!");
                                    pot = 1;
                                }
                                else if((userCheckIn.after(dbChckIn))&&(userCheckOut.before(dbChckOut))){
                                    JOptionPane.showMessageDialog(null, "Booking Already exist!");
                                    pot = 1;
                                }
                                else if(((userCheckIn.after(dbChckIn))&&userCheckIn.before(dbChckOut))){
                                    JOptionPane.showMessageDialog(null, "Booking Already exist!");
                                    pot = 1;
                                }
                                else if(((userCheckOut.after(dbChckIn))&&userCheckOut.before(dbChckOut))){
                                    JOptionPane.showMessageDialog(null, "Booking Already exist!");
                                    pot = 1;
                                }
                                }
                            }
                        conn.close();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                }
            conn.close();        
         }
        catch(Exception e){

                }
    }
    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        Function_Form fnc = new Function_Form();
        fnc.setVisible(true);       
        this.dispose();
    }//GEN-LAST:event_save1ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        checkRooms(101);
        if(pot==1){
            r1.setSelected(false);
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        checkRooms(102);
        if(pot==1){
            r2.setSelected(false);
        }
      // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        checkRooms(103);
        if(pot==1){
            r3.setSelected(false);
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        checkRooms(104);
        if(pot==1){
            r4.setSelected(false);
        }
    }//GEN-LAST:event_r4ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        checkRooms(105);
        if(pot==1){
            r5.setSelected(false);
        }
    }//GEN-LAST:event_r5ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        checkRooms(106);
        if(pot==1){
            r6.setSelected(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_r6ActionPerformed

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8ActionPerformed
        checkRooms(202);
        if(pot==1){
            r8.setSelected(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_r8ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        checkRooms(201);
        if(pot==1){
            r7.setSelected(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_r7ActionPerformed

    private void r10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10ActionPerformed
        checkRooms(204);
        if(pot==1){
            r10.setSelected(false);
        }
    }//GEN-LAST:event_r10ActionPerformed

    private void r11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r11ActionPerformed
        checkRooms(205);
        if(pot==1){
            r11.setSelected(false);
        }
    }//GEN-LAST:event_r11ActionPerformed

    private void r12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r12ActionPerformed
        checkRooms(206);
        if(pot==1){
            r12.setSelected(false);
        }
    }//GEN-LAST:event_r12ActionPerformed

    private void r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9ActionPerformed
        checkRooms(203);
        if(pot==1){
            r9.setSelected(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_r9ActionPerformed

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        key.setText("");
        cstID.setText("");  
        cstName.setText("");
        noOfGuest.setText("");
        noOfRooms.setSelectedIndex(0);
        date.setDate(null);
        todate.setDate(null);
        Component[] cs = rmIDs.getComponents();
        for (Component c : cs ){
                if(c instanceof JCheckBox){
                    JCheckBox box = (JCheckBox) c;
                    box.setSelected(false);
                }
            }
    }//GEN-LAST:event_exit1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cstID;
    private javax.swing.JTextField cstName;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField key;
    private javax.swing.JTextField noOfGuest;
    private javax.swing.JComboBox<String> noOfRooms;
    private javax.swing.JCheckBox r1;
    private javax.swing.JCheckBox r10;
    private javax.swing.JCheckBox r11;
    private javax.swing.JCheckBox r12;
    private javax.swing.JCheckBox r2;
    private javax.swing.JCheckBox r3;
    private javax.swing.JCheckBox r4;
    private javax.swing.JCheckBox r5;
    private javax.swing.JCheckBox r6;
    private javax.swing.JCheckBox r7;
    private javax.swing.JCheckBox r8;
    private javax.swing.JCheckBox r9;
    private javax.swing.JPanel rmIDs;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private com.toedter.calendar.JDateChooser todate;
    // End of variables declaration//GEN-END:variables

}
