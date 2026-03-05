
package shop.auto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class MAIN_INTERFACE extends javax.swing.JFrame {

    
    public MAIN_INTERFACE() {
        initComponents();
        CARS();
    }
Connection Con= null;
Statement St = null;
ResultSet Rs = null;

    public void CARS(){
    try{
            
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SHOP_AUTO","User1","1234");
St = Con.createStatement();
Rs = St.executeQuery("Select * from User1.SELLERTBL");
CARST.setModel(DbUtils.resultSetToTableModel(Rs));
            
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
        SHOW_CARS = new java.awt.Button();
        INFORMAION_CLAENT = new java.awt.Button();
        BACK = new java.awt.Button();
        REPORTS = new java.awt.Button();
        SALES_FROM = new java.awt.Button();
        REPORTS1 = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel2.setText("MAIN INTERFACE");

        SHOW_CARS.setBackground(new java.awt.Color(0, 102, 102));
        SHOW_CARS.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        SHOW_CARS.setForeground(new java.awt.Color(204, 204, 204));
        SHOW_CARS.setLabel("C A R S");
        SHOW_CARS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHOW_CARSMouseClicked(evt);
            }
        });

        INFORMAION_CLAENT.setBackground(new java.awt.Color(0, 102, 102));
        INFORMAION_CLAENT.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        INFORMAION_CLAENT.setForeground(new java.awt.Color(204, 204, 204));
        INFORMAION_CLAENT.setLabel("CLAENTS");
        INFORMAION_CLAENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INFORMAION_CLAENTMouseClicked(evt);
            }
        });
        INFORMAION_CLAENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INFORMAION_CLAENTActionPerformed(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(0, 102, 102));
        BACK.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        BACK.setForeground(new java.awt.Color(204, 204, 204));
        BACK.setLabel("BACK");
        BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKMouseClicked(evt);
            }
        });

        REPORTS.setBackground(new java.awt.Color(0, 102, 102));
        REPORTS.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        REPORTS.setForeground(new java.awt.Color(204, 204, 204));
        REPORTS.setLabel("EMPLOYEES");
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

        SALES_FROM.setBackground(new java.awt.Color(0, 102, 102));
        SALES_FROM.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        SALES_FROM.setForeground(new java.awt.Color(204, 204, 204));
        SALES_FROM.setLabel("S A L E S");
        SALES_FROM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALES_FROMMouseClicked(evt);
            }
        });

        REPORTS1.setBackground(new java.awt.Color(0, 102, 102));
        REPORTS1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        REPORTS1.setForeground(new java.awt.Color(204, 204, 204));
        REPORTS1.setLabel("REPORTS");
        REPORTS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REPORTS1MouseClicked(evt);
            }
        });
        REPORTS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPORTS1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SHOW_CARS, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INFORMAION_CLAENT, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SALES_FROM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPORTS1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(REPORTS, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SALES_FROM, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SHOW_CARS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(REPORTS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INFORMAION_CLAENT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(REPORTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Forte", 2, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SHOP AUTO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(322, 322, 322)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SHOW_CARSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOW_CARSMouseClicked
        new CARS().setVisible(true);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_SHOW_CARSMouseClicked

    private void INFORMAION_CLAENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INFORMAION_CLAENTMouseClicked
        new INFORMAION_CLAENT().setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_INFORMAION_CLAENTMouseClicked

    private void INFORMAION_CLAENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INFORMAION_CLAENTActionPerformed
        new INFORMAION_CLAENT().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_INFORMAION_CLAENTActionPerformed

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        new LOGIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BACKMouseClicked

    private void REPORTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTSMouseClicked
        new EMPLOYEES().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_REPORTSMouseClicked

    private void REPORTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPORTSActionPerformed
        new REPORTS_FROM().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_REPORTSActionPerformed

    private void SALES_FROMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALES_FROMMouseClicked
        new SALES_FROM().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_SALES_FROMMouseClicked

    private void REPORTS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTS1MouseClicked
        new REPORTS_FROM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_REPORTS1MouseClicked

    private void REPORTS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPORTS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REPORTS1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(MAIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN_INTERFACE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BACK;
    private java.awt.Button INFORMAION_CLAENT;
    private java.awt.Button REPORTS;
    private java.awt.Button REPORTS1;
    private java.awt.Button SALES_FROM;
    private java.awt.Button SHOW_CARS;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
