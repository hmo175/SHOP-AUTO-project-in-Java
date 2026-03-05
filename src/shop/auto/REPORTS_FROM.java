
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

public class REPORTS_FROM extends javax.swing.JFrame {


    public REPORTS_FROM() {
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
        REPQUA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        REPNAME = new javax.swing.JTextField();
        BILLID = new javax.swing.JLabel();
        BillID = new javax.swing.JTextField();
        PRINT = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        SALESTBL = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        CLARE = new java.awt.Button();
        ADD = new java.awt.Button();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LOGOUT = new java.awt.Label();
        button123 = new java.awt.Button();
        button124 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel2.setText("R E P O R T S ");

        jLabel7.setBackground(new java.awt.Color(0, 51, 51));
        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel7.setText("QUANTITY");

        REPQUA.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel8.setText("NAME");

        REPNAME.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        REPNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPNAMEActionPerformed(evt);
            }
        });

        BILLID.setBackground(new java.awt.Color(0, 51, 51));
        BILLID.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        BILLID.setText("BILLID");

        BillID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BillID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillIDActionPerformed(evt);
            }
        });

        PRINT.setBackground(new java.awt.Color(0, 102, 102));
        PRINT.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        PRINT.setForeground(new java.awt.Color(204, 204, 204));
        PRINT.setLabel("PRINT");
        PRINT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRINTMouseClicked(evt);
            }
        });
        PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        SALESTBL.setBackground(new java.awt.Color(204, 204, 204));
        SALESTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SALEID", "CARID", "CLANETNAME", "SALEDATA"
            }
        ));
        SALESTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALESTBLMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(SALESTBL);

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane3.setViewportView(bill);

        CLARE.setBackground(new java.awt.Color(0, 102, 102));
        CLARE.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        CLARE.setForeground(new java.awt.Color(204, 204, 204));
        CLARE.setLabel("CLAER");
        CLARE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLAREMouseClicked(evt);
            }
        });
        CLARE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLAREActionPerformed(evt);
            }
        });

        ADD.setBackground(new java.awt.Color(0, 102, 102));
        ADD.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        ADD.setForeground(new java.awt.Color(204, 204, 204));
        ADD.setLabel("ADD TO BILL");
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
        });
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BILLID)
                                .addGap(66, 66, 66))
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(396, 396, 396))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(PRINT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(158, 158, 158))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(REPQUA, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(REPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BillID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(CLARE, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))
                                .addGap(52, 52, 52))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BillID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BILLID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(REPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(REPQUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CLARE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(PRINT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Forte", 2, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SHOP AUTO");

        LOGOUT.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUT.setText("LOGOUT");
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });

        button123.setBackground(new java.awt.Color(204, 204, 204));
        button123.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        button123.setForeground(new java.awt.Color(0, 102, 102));
        button123.setLabel("SALES");
        button123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button123MouseClicked(evt);
            }
        });
        button123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button123ActionPerformed(evt);
            }
        });

        button124.setBackground(new java.awt.Color(204, 204, 204));
        button124.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        button124.setForeground(new java.awt.Color(0, 102, 102));
        button124.setLabel("MAIN INTERFACE");
        button124.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button124MouseClicked(evt);
            }
        });
        button124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button124ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button124, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(button123, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button123, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button124, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
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

    private void REPNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REPNAMEActionPerformed

    private void BillIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIDActionPerformed

    private void PRINTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRINTMouseClicked
        try{
            bill.print();
        }catch(Exception e){

        }

        Double Uprice,ProdTot=0.0,GrdTotal=0.0;
        int AvailQty;

    }//GEN-LAST:event_PRINTMouseClicked

    private void PRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRINTActionPerformed

    private void CLAREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLAREMouseClicked
        BillID.setText("");
        REPNAME.setText("");
        REPQUA.setText("");
        REPNAME.setText("");
    }//GEN-LAST:event_CLAREMouseClicked

    private void CLAREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLAREActionPerformed
        BillID.setText("");
        REPNAME.setText("");
        REPQUA.setText("");
        REPNAME.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_CLAREActionPerformed
    int i = 0 ;
    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
if(REPQUA.getText().isEmpty()||REPNAME.getText().isEmpty()){
    JOptionPane.showMessageDialog(this,"Missing information");
}
else if(AvailQty <= Integer.valueOf(REPQUA.getText())){
        JOptionPane.showMessageDialog(this,"Not Enough  in stock");

}

else{
    i++;
    ProdTot=Uprice*Integer.valueOf(ProdQty.getText());
    GrdTotal = GrdTotal + ProdTot;

    if(i == 1){
     BillTxt.setText(BillTxt.getText()+"============FAMILY POINT===========\n NUM     PRODUCT     PRICE     QUANTITY"
             + "     TOTAL\n"
             +i+"             "+ProdName.getText()+"                 "+Uprice+"              "+ProdQty.getText()
             +"                 "+ProdTot+"\n");
    }else{
         BillTxt.setText(BillTxt.getText()+i+"             "+ProdName.getText()+"                 "+Uprice+""
                 + "              "+ProdQty.getText()+"                 "+ProdTot+"\n");
    }
    Grdtotlbl.setText("Rs"+GrdTotal);
    update();
    
}
    }//GEN-LAST:event_ADDMouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        new LOGIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void button123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button123MouseClicked
        new SALES_FROM().setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_button123MouseClicked

    private void button123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button123ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button123ActionPerformed

    private void button124MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button124MouseClicked
        new MAIN_INTERFACE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button124MouseClicked

    private void button124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button124ActionPerformed

    private void SALESTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESTBLMouseClicked
//                DefaultTableModel model = (DefaultTableModel)SALESTBL.getModel();
//                int Myindex = SALESTBL.getSelectedRow();
//                // = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
//                AvailQty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
//                // newQty = AvailQty - Integer.valueOf(REPQUA.getText());
//                REPNAME.setText(model.getValueAt(Myindex, 1).toString());
//                Uprice=Double.valueOf(model.getValueAt(Myindex, 3).toString());
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
            java.util.logging.Logger.getLogger(REPORTS_FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REPORTS_FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REPORTS_FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REPORTS_FROM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REPORTS_FROM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ADD;
    private javax.swing.JLabel BILLID;
    private javax.swing.JTextField BillID;
    private java.awt.Button CLARE;
    private java.awt.Label LOGOUT;
    private java.awt.Button PRINT;
    private javax.swing.JTextField REPNAME;
    private javax.swing.JTextField REPQUA;
    private javax.swing.JTable SALESTBL;
    private javax.swing.JTextArea bill;
    private java.awt.Button button123;
    private java.awt.Button button124;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
