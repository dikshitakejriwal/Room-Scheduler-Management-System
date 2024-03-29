
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acv
 */
public class RoomSchedulerFrame extends javax.swing.JFrame
{

    
    /**
     * Creates new form RoomSchedulerFrame
     */
    public RoomSchedulerFrame()
    {
        initComponents();
        
        // Load the combo boxes with data.
        rebuildFacultyComboBoxes();
        rebuildDateComboBoxes();
    }
    
    public void rebuildFacultyComboBoxes()
    {
        reserveFacultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getFacultyList().toArray()));        
    }
    
    public void rebuildDateComboBoxes()
    {
        reserveDateComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDatesList().toArray()));
        reserveDateComboBox2.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDatesList().toArray()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        waitlistPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addFacultyTextField = new javax.swing.JTextField();
        addFacultyButton = new javax.swing.JButton();
        addFacultyStatusLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        reserveFacultyComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        reserveDateComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        reserveSeatsTextField = new javax.swing.JTextField();
        reserveSubmitButton = new javax.swing.JButton();
        reserveStatusLabel = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        reserveDateComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReservationsTextArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        waitlistTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Room Scheduler");

        jLabel2.setText("Faculty Name: ");

        addFacultyTextField.setColumns(20);
        addFacultyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultyTextFieldActionPerformed(evt);
            }
        });

        addFacultyButton.setText("Submit");
        addFacultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultyButtonActionPerformed(evt);
            }
        });

        addFacultyStatusLabel.setText("    ");

        jLabel7.setText("   ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addFacultyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(addFacultyButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addFacultyStatusLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addFacultyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(addFacultyButton)
                .addGap(18, 18, 18)
                .addComponent(addFacultyStatusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        waitlistPanel.addTab("Add Faculty", jPanel1);

        jLabel4.setText("Faculty: ");

        reserveFacultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveFacultyComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Date: ");

        reserveDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveDateComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Seats Required: ");

        reserveSeatsTextField.setColumns(3);
        reserveSeatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveSeatsTextFieldActionPerformed(evt);
            }
        });

        reserveSubmitButton.setText("Submit");
        reserveSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonSubmitActionPerformed(evt);
            }
        });

        reserveStatusLabel.setText("   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(reserveStatusLabel)
                        .addContainerGap(467, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reserveFacultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reserveDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reserveSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(reserveSubmitButton)
                                .addGap(26, 26, 26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(reserveFacultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(reserveDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(reserveSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(reserveSubmitButton)
                .addGap(18, 18, 18)
                .addComponent(reserveStatusLabel)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        waitlistPanel.addTab("Reserve Room", jPanel2);

        jLabel3.setText("Dates:");

        jButton1.setText("Check Reservation Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkReservationButtonActionPerformed(evt);
            }
        });

        ReservationsTextArea.setColumns(20);
        ReservationsTextArea.setRows(5);
        jScrollPane1.setViewportView(ReservationsTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(reserveDateComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reserveDateComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        waitlistPanel.addTab("Reservation Status", jPanel3);

        jButton2.setText("Check Waitlist Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWaitlistStausActionPerformed(evt);
            }
        });

        waitlistTextArea.setColumns(20);
        waitlistTextArea.setRows(5);
        jScrollPane2.setViewportView(waitlistTextArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(151, 151, 151))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        waitlistPanel.addTab("Waitlist Status", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(waitlistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waitlistPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reserveFacultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveFacultyComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reserveFacultyComboBoxActionPerformed

    private void addFacultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacultyButtonActionPerformed
        // Add the faculty to the faculty table.
        String name = addFacultyTextField.getText();
        Faculty.addFaculty(name);
        addFacultyStatusLabel.setText(name+" has been added to the Faculty.");

        // rebuild the reservation faculty combo box.
        rebuildFacultyComboBoxes();
    }//GEN-LAST:event_addFacultyButtonActionPerformed

    private void addFacultyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacultyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addFacultyTextFieldActionPerformed

    private void reserveDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveDateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reserveDateComboBoxActionPerformed

    private void reserveSeatsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveSeatsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reserveSeatsTextFieldActionPerformed

    private void reserveButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonSubmitActionPerformed
        // TODO add your handling code here:
         //When the submit button is clicked, This class makes a reservation or add data to waitlist Entry
        String Faculty=reserveFacultyComboBox.getSelectedItem().toString();
        Date date=Date.valueOf(reserveDateComboBox.getSelectedItem().toString());
        int seats=Integer.parseInt(reserveSeatsTextField.getText());
        ArrayList<String> possibleRooms=RoomQueries.getAllPossibleRooms(seats);
        ArrayList<String> reservedRooms=ReservationQueries.getRoomsReservedByDate(date);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        //determine that if the reserve is there in the database
        for (String room:possibleRooms){
            if(!reservedRooms.contains(room)){
                ReservationQueries.addReservationEntry(Faculty,date, seats);
                reserveStatusLabel.setText("Room "+room+" has been reserved for "+Faculty+".");
                return;
            }
            
        }
        WaitlistQueries.addWaitlistEntry(Faculty, date, seats);
        reserveStatusLabel.setText(Faculty+" has been added to the waitlist");
        
    }//GEN-LAST:event_reserveButtonSubmitActionPerformed

    private void checkReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkReservationButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<ReservationEntry> reservations= ReservationQueries.getReservationByDate((Date)reserveDateComboBox2.getSelectedItem());
        ReservationsTextArea.setText("faculty \t date\t room\n");
        for(ReservationEntry reservation: reservations){
            ReservationsTextArea.append(reservation.getFaculty()+"\t"+reservation.getRooms()+"\n");
        }
    }//GEN-LAST:event_checkReservationButtonActionPerformed

    private void checkWaitlistStausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWaitlistStausActionPerformed
        // TODO add your handling code here:
        Date date= Date.valueOf(reserveDateComboBox.getSelectedItem().toString());
        ArrayList<WaitlistEntry> WaitlistStatus=WaitlistQueries.getWaitlistByDate(date);
        waitlistTextArea.setText("faculty \t date \n");
        for(WaitlistEntry Waitlist_status: WaitlistStatus){
            waitlistTextArea.append(Waitlist_status.getFaculty()+"/t"+Waitlist_status.getDate());
        
    }//GEN-LAST:event_checkWaitlistStausActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RoomSchedulerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ReservationsTextArea;
    private javax.swing.JButton addFacultyButton;
    private javax.swing.JLabel addFacultyStatusLabel;
    private javax.swing.JTextField addFacultyTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JComboBox<String> reserveDateComboBox;
    private javax.swing.JComboBox<String> reserveDateComboBox2;
    private javax.swing.JComboBox<String> reserveFacultyComboBox;
    private javax.swing.JTextField reserveSeatsTextField;
    private javax.swing.JLabel reserveStatusLabel;
    private javax.swing.JButton reserveSubmitButton;
    private javax.swing.JTabbedPane waitlistPanel;
    private javax.swing.JTextArea waitlistTextArea;
    // End of variables declaration//GEN-END:variables
}
