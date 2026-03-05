
package shop.auto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Date;



public class SALES_FROM extends javax.swing.JFrame {

    
    public SALES_FROM() {
        initComponents();
        CARS();
    }
Connection Con= null;
Statement St = null;
ResultSet Rs = null;

    public void CARS(){
    try{
            
    Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");
St = Con.createStatement();
Rs = St.executeQuery("Select * from CARS.SALESTBL");
SALESTBL.setModel(DbUtils.resultSetToTableModel(Rs));
            
    }catch(Exception e){
        e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SALEDATE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CARID = new javax.swing.JTextField();
        button122 = new java.awt.Button();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SALEID = new javax.swing.JTextField();
        CLAENAME = new javax.swing.JTextField();
        EDIT = new java.awt.Button();
        ADD2 = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        SALESTBL = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        INFORMION_CLAENT = new java.awt.Button();
        REPORTS = new java.awt.Button();
        LOGOUT = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel2.setText("S A L E S");

        jLabel7.setBackground(new java.awt.Color(0, 51, 51));
        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel7.setText("SALE ID ");

        SALEDATE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel8.setText("CLAENT NAME");

        CARID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CARID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARIDActionPerformed(evt);
            }
        });

        button122.setBackground(new java.awt.Color(0, 102, 102));
        button122.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        button122.setForeground(new java.awt.Color(204, 204, 204));
        button122.setLabel("BACK");
        button122.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button122MouseClicked(evt);
            }
        });
        button122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button122ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 51, 51));
        jLabel9.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel9.setText("CAR ID");

        jLabel10.setBackground(new java.awt.Color(0, 51, 51));
        jLabel10.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel10.setText("SALE DATE ");

        SALEID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SALEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALEIDActionPerformed(evt);
            }
        });

        CLAENAME.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CLAENAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLAENAMEActionPerformed(evt);
            }
        });

        EDIT.setBackground(new java.awt.Color(0, 102, 102));
        EDIT.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        EDIT.setForeground(new java.awt.Color(204, 204, 204));
        EDIT.setLabel("EDIT");
        EDIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EDITMouseClicked(evt);
            }
        });
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });

        ADD2.setBackground(new java.awt.Color(0, 102, 102));
        ADD2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        ADD2.setForeground(new java.awt.Color(204, 204, 204));
        ADD2.setLabel("ADD");
        ADD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADD2MouseClicked(evt);
            }
        });
        ADD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD2ActionPerformed(evt);
            }
        });

        SALESTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SALEID", "CLAENTNAME", "CARID", "SALEDATE"
            }
        ));
        SALESTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALESTBLMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(SALESTBL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(ADD2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(button122, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CLAENAME, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SALEID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CARID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SALEDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(280, 280, 280))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SALEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CLAENAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CARID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(SALEDATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Forte", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SHOP AUTO");

        INFORMION_CLAENT.setBackground(new java.awt.Color(204, 204, 204));
        INFORMION_CLAENT.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        INFORMION_CLAENT.setForeground(new java.awt.Color(0, 102, 102));
        INFORMION_CLAENT.setLabel("INFORMATION OF CLAENT");
        INFORMION_CLAENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INFORMION_CLAENTMouseClicked(evt);
            }
        });
        INFORMION_CLAENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INFORMION_CLAENTActionPerformed(evt);
            }
        });

        REPORTS.setBackground(new java.awt.Color(204, 204, 204));
        REPORTS.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        REPORTS.setForeground(new java.awt.Color(0, 102, 102));
        REPORTS.setLabel("REPORTS");
        REPORTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REPORTSMouseClicked(evt);
            }
        });
        REPORTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPORTSActionPerformed(evt);
            }
        });

        LOGOUT.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUT.setText("LOGOUT");
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(INFORMION_CLAENT, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(REPORTS, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(326, 326, 326)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(INFORMION_CLAENT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(REPORTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CARIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CARIDActionPerformed

    private void button122MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button122MouseClicked
        new MAIN_INTERFACE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button122MouseClicked

    private void button122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button122ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button122ActionPerformed

    private void SALEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALEIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SALEIDActionPerformed

    private void CLAENAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLAENAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLAENAMEActionPerformed

    private void EDITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITMouseClicked
if(SALEID.getText().isEmpty() || CLAENAME.getText().isEmpty() || CARID.getText().isEmpty() || SALEDATE.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Missing information");
} else {
    try {
        Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");

        String Query = "UPDATE CARS.SALESTBL SET CLAENAME = ?, CARID = ?, SALEDATE = ? WHERE SALEID = ?";
        PreparedStatement pst = Con.prepareStatement(Query);

        pst.setString(1, CLAENAME.getText());
        pst.setInt(2, Integer.parseInt(CARID.getText()));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date utilDate = sdf.parse(SALEDATE.getText());
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        pst.setDate(3, sqlDate);
        pst.setInt(4, Integer.parseInt(SALEID.getText()));

        int updated = pst.executeUpdate();
        if (updated > 0) {
            JOptionPane.showMessageDialog(this, "Sales Updated Successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No record found for SALEID = " + SALEID.getText());
        }

        Con.close();
        CARS();

    } catch(Exception e) {
        e.printStackTrace();
    }
}

    }//GEN-LAST:event_EDITMouseClicked

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDITActionPerformed

    private void ADD2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADD2MouseClicked
        if(SALEID.getText().isEmpty()|| CLAENAME.getText().isEmpty()||CARID.getText().isEmpty()||SALEDATE.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");
                PreparedStatement add = Con.prepareStatement("insert into SALESTBL values(?,?,?,?)");
                add.setInt(1, Integer.valueOf(SALEID.getText()));
                add.setString(2, CLAENAME.getText());
                add.setInt(3, Integer.valueOf(CARID.getText()));
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date utilDate = sdf.parse(SALEDATE.getText()); 
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                add.setDate(4, sqlDate);
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sales Added Successfuly");
                Con.close();
                CARS();

            }catch(Exception e){
                e.printStackTrace();
            }    }
    }//GEN-LAST:event_ADD2MouseClicked

    private void ADD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADD2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void INFORMION_CLAENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INFORMION_CLAENTMouseClicked

             new INFORMAION_CLAENT().setVisible(true);
             this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_INFORMION_CLAENTMouseClicked

    private void INFORMION_CLAENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INFORMION_CLAENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INFORMION_CLAENTActionPerformed

    private void REPORTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTSMouseClicked
        new REPORTS_FROM().setVisible(true);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_REPORTSMouseClicked

    private void REPORTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPORTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REPORTSActionPerformed

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        new LOGIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void SALESTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESTBLMouseClicked
        DefaultTableModel model = (DefaultTableModel)SALESTBL.getModel();
    int Myindex = SALESTBL.getSelectedRow();
    SALEID.setText(model.getValueAt(Myindex, 0).toString());
    CLAENAME.setText(model.getValueAt(Myindex, 1).toString());
    CARID.setText(model.getValueAt(Myindex, 2).toString());
    SALEDATE.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_SALESTBLMouseClicked

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
            java.util.logging.Logger.getLogger(SALES_FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALES_FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALES_FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALES_FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALES_FROM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ADD2;
    private javax.swing.JTextField CARID;
    private javax.swing.JTextField CLAENAME;
    private java.awt.Button EDIT;
    private java.awt.Button INFORMION_CLAENT;
    private java.awt.Label LOGOUT;
    private java.awt.Button REPORTS;
    private javax.swing.JTextField SALEDATE;
    private javax.swing.JTextField SALEID;
    private javax.swing.JTable SALESTBL;
    private java.awt.Button button122;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
