
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


public class INFORMAION_CLAENT extends javax.swing.JFrame {

    public INFORMAION_CLAENT() {
        initComponents();
        CARS();
    }
Connection Con= null;
Statement St = null;
ResultSet Rs = null;

    public void CARS(){
    try{
            
    Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cars","1234");
St = Con.createStatement();
Rs = St.executeQuery("Select * from cars.CLAENTTBL");
CLAETTBL.setModel(DbUtils.resultSetToTableModel(Rs));
            
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
        jLabel4 = new javax.swing.JLabel();
        CLANAME = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CLAPHONE = new javax.swing.JTextField();
        DELET = new java.awt.Button();
        ADD = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        CLAID = new javax.swing.JTextField();
        Edit = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        CLAETTBL = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        button122 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        LOGOUT = new java.awt.Label();
        button123 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Forte", 1, 40)); // NOI18N
        jLabel2.setText("INFORMATION OF CLAENT");

        jLabel4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel4.setText("NAME");

        CLANAME.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel6.setText("ID");

        CLAPHONE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        DELET.setBackground(new java.awt.Color(0, 102, 102));
        DELET.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        DELET.setForeground(new java.awt.Color(204, 204, 204));
        DELET.setLabel("DELETE");
        DELET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETMouseClicked(evt);
            }
        });
        DELET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETActionPerformed(evt);
            }
        });

        ADD.setBackground(new java.awt.Color(0, 102, 102));
        ADD.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        ADD.setForeground(new java.awt.Color(204, 204, 204));
        ADD.setLabel("ADD");
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

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel8.setText("PHONE NUMBER");

        CLAID.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        CLAID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLAIDActionPerformed(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(0, 102, 102));
        Edit.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        Edit.setForeground(new java.awt.Color(204, 204, 204));
        Edit.setLabel("EDIT");
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbutton4ActionPerformed(evt);
            }
        });

        CLAETTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAME", "PHONENUMBER", "ID"
            }
        ));
        CLAETTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLAETTBLMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CLAETTBL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(DELET, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel8)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(170, 170, 170))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(205, 205, 205)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CLANAME, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CLAPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CLAID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CLAID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CLANAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CLAPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DELET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
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

        button122.setBackground(new java.awt.Color(204, 204, 204));
        button122.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        button122.setForeground(new java.awt.Color(0, 102, 102));
        button122.setLabel("MAIN INTERFACE");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(button122, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button123, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DELETMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETMouseClicked
if(CLAID.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Enter the Claent to be deleted");
}else{
try{
        Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cars","1234");
        String PId = CLAID.getText();
        String Query = "Delete from cars.CLAENTTBL where CLAID = "+PId;
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
       
        
        JOptionPane.showMessageDialog(this, "Claent Deleted Successfuly");
}catch(Exception e){
    e.printStackTrace();
}
}
    }//GEN-LAST:event_DELETMouseClicked

    private void DELETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETActionPerformed

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
        if(CLAID.getText().isEmpty()|| CLANAME.getText().isEmpty()||CLAPHONE.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cars","1234");
                PreparedStatement add = Con.prepareStatement("insert into CLAENTTBL values(?,?,?)");
                add.setInt(1, Integer.valueOf(CLAID.getText()));
                add.setString(2,CLANAME.getText());
                add.setInt(3, Integer.valueOf(CLAPHONE.getText()));

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Claent Added Successfuly");
                Con.close();
                CARS();

            }catch(Exception e){
                e.printStackTrace();
            }    }
    }//GEN-LAST:event_ADDMouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
if(CLAID.getText().isEmpty() || CLANAME.getText().isEmpty() || CLAPHONE.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Missing information");
} else {
    try {
        Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");

        String Query = "UPDATE CARS.CLAENTTBL SET CLAID = ?, CLANAME = ? WHERE CLAPHONE = ?";
        PreparedStatement pst = Con.prepareStatement(Query);

        pst.setInt(1, Integer.valueOf(CLAID.getText()));
        pst.setString(2, CLANAME.getText());
        pst.setInt(3, Integer.valueOf(CLAPHONE.getText()));

        int row = pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Claent Updated Successfully");

        Con.close();
        CARS();

    } catch(Exception e) {
        e.printStackTrace();
    }
}
    }//GEN-LAST:event_EditMouseClicked

    private void Editbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbutton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Editbutton4ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void button122MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button122MouseClicked
        new MAIN_INTERFACE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button122MouseClicked

    private void button122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button122ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button122ActionPerformed

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

    private void CLAETTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLAETTBLMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)CLAETTBL.getModel();
    int Myindex = CLAETTBL.getSelectedRow();
    CLAID.setText(model.getValueAt(Myindex, 0).toString());
    CLANAME.setText(model.getValueAt(Myindex, 1).toString());
    CLAPHONE.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_CLAETTBLMouseClicked

    private void CLAIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLAIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLAIDActionPerformed

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
            java.util.logging.Logger.getLogger(INFORMAION_CLAENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INFORMAION_CLAENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INFORMAION_CLAENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INFORMAION_CLAENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INFORMAION_CLAENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ADD;
    private javax.swing.JTable CLAETTBL;
    private javax.swing.JTextField CLAID;
    private javax.swing.JTextField CLANAME;
    private javax.swing.JTextField CLAPHONE;
    private java.awt.Button DELET;
    private java.awt.Button Edit;
    private java.awt.Label LOGOUT;
    private java.awt.Button button122;
    private java.awt.Button button123;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
