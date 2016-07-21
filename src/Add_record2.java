
import java.sql.*;
import javax.swing.JOptionPane;
public class Add_record2 extends javax.swing.JFrame {

    
    protected Add_record2() {
        initComponents();
     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        room2 = new javax.swing.JButton();
        room3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nyts = new javax.swing.JTextField();
        guests = new javax.swing.JTextField();
        room1 = new javax.swing.JButton();
        record = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        rooms = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        roomname = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        sub = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        home = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setText("Arrival Date");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel2.setText("Nights");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setText("No. of Guests");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel4.setText("Room Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 81, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel6.setText("FOUNTAIN VIEW ROOM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel7.setText("RESORT ROOM");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel8.setText("PENTHOUSE SUITE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        room2.setFont(new java.awt.Font("Segoe Print", 0, 13)); // NOI18N
        room2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resort tower king room.jpg"))); // NOI18N
        room2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        room2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room2ActionPerformed(evt);
            }
        });
        getContentPane().add(room2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 80));

        room3.setFont(new java.awt.Font("Segoe Print", 0, 13)); // NOI18N
        room3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penthouse suite.jpg"))); // NOI18N
        room3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        room3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room3ActionPerformed(evt);
            }
        });
        getContentPane().add(room3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, 80));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel9.setText("(CLICK ON THE IMAGE TO CHOOSE YOUR ROOM TYPE)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 420, 30));

        nyts.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(nyts, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, -1));

        guests.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(guests, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 80, 30));

        room1.setFont(new java.awt.Font("Segoe Print", 0, 13)); // NOI18N
        room1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fountain view room.jpg"))); // NOI18N
        room1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        room1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room1ActionPerformed(evt);
            }
        });
        getContentPane().add(room1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 70));

        record.setFont(new java.awt.Font("Segoe Print", 0, 13)); // NOI18N
        record.setText("ADD RECORD");
        record.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordActionPerformed(evt);
            }
        });
        getContentPane().add(record, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel11.setText("Rate: Rs.6500");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        rooms.setFont(new java.awt.Font("Segoe Print", 0, 13)); // NOI18N
        rooms.setText("SHOW AVAILABLE ROOMS");
        rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsActionPerformed(evt);
            }
        });
        getContentPane().add(rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 220, -1));

        jLabel10.setText("Rate: Rs.4500");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        roomname.setEditable(true);
        roomname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F1", "F2", "F3", "F4", "R1", "R2", "R3", "R4", "P1", "P2", "P3", "P4" }));
        roomname.setSelectedIndex(-1);
        getContentPane().add(roomname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 90, -1));

        jLabel14.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel14.setText("ROOM NUMBER:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 220, 130));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel5.setText("Rate: Rs.3500");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        sub.setEnabled(false);
        getContentPane().add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 90, -1));

        total.setEnabled(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 90, -1));

        jLabel13.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel13.setText("NET AMOUNT");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel12.setText("TOTAL AMOUNT");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        home.setFont(new java.awt.Font("Segoe Print", 0, 13)); // NOI18N
        home.setText("HOME");
        home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 70, 30));

        background.setFont(new java.awt.Font("Segoe Print", 0, 13)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bellagio_king11.jpg"))); // NOI18N
        background.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, 0, 940, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void room2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room2ActionPerformed
       int nights= Integer.parseInt(nyts.getText());
        int subtotal=nights*4500;
        double bill=subtotal + subtotal*0.12 + nights*1000;
        sub.setText(" "+subtotal);
        total.setText(" "+bill);
    }//GEN-LAST:event_room2ActionPerformed

    private void room1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room1ActionPerformed
        int nights= Integer.parseInt(nyts.getText());
        int subtotal=nights*3500;
        double bill=subtotal + subtotal*0.12 + nights*1000;
        sub.setText(" "+subtotal);
        total.setText(" "+bill);
    }//GEN-LAST:event_room1ActionPerformed

    private void room3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room3ActionPerformed
 int nights= Integer.parseInt(nyts.getText());
        int subtotal=nights*6500;
        double bill=subtotal + subtotal*0.12 + nights*1000;
        sub.setText(" "+subtotal);
        total.setText(" "+bill);
    }//GEN-LAST:event_room3ActionPerformed

    private void recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordActionPerformed
            new visitor_management().setVisible(true);
             dispose();          
    try{
       Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","root");
      Statement stmt=con.createStatement();
      String qry= "INSERT INTO visitors(Name,Address,Nationality,Age,Phone_No,Email,Room_No,Nights,Guests,Amount,Bill) VALUES('"+Add_record.name.getText()+"','"+Add_record.add.getText()+"','"+Add_record.nat.getText()+"','"+Add_record.age.getText()+"','"+Add_record.pno.getText()+"','"+Add_record.email.getText()+"','"+roomname.getSelectedItem().toString()+"','"+nyts.getText()+"','"+guests.getText()+"','"+sub.getText()+"','"+total.getText()+"');";
     stmt.executeUpdate(qry);
          JOptionPane.showMessageDialog(null,"1 record inserted");
    }                                    
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null,e.getMessage());
        }
     try{
       Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","root");
      Statement stmt1=con.createStatement();
      String r=roomname.getSelectedItem().toString();
      String q="UPDATE room SET Availability = 'unavailable' WHERE Room_No='"+(r)+"';";
        stmt1.executeUpdate(q);
        jTextArea1.setText(" ");
        }
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_recordActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
    }//GEN-LAST:event_totalActionPerformed

    private void roomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsActionPerformed
        jTextArea1.setText(" ");
        int g= Integer.parseInt(guests.getText());
        if (g<3) {
          try{
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","root");
       Statement stmt=con.createStatement();
       String query3="SELECT * FROM room WHERE Availability='available';";
       ResultSet rs=stmt.executeQuery(query3);
       rs.first();
           int i =0;
           do{
               String result= rs.getString("Room_No");
               jTextArea1.setText(jTextArea1.getText()+"\n"+result);
           }
           while(rs.next());
            i++;
           
       }
       catch(Exception e)
        {
               JOptionPane.showMessageDialog(null,e.getMessage());
        }
            }
        else  JOptionPane.showMessageDialog(null,"Maximum 2 guests can be accomodated in one room");
    }//GEN-LAST:event_roomsActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
       new visitor_management().setVisible(true);
       dispose();
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Add_record2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_record2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_record2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_record2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Add_record2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField guests;
    private javax.swing.JButton home;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nyts;
    private javax.swing.JButton record;
    private javax.swing.JButton room1;
    private javax.swing.JButton room2;
    private javax.swing.JButton room3;
    private javax.swing.JComboBox roomname;
    private javax.swing.JButton rooms;
    private javax.swing.JTextField sub;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
