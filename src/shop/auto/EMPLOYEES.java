
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

public class EMPLOYEES extends javax.swing.JFrame {


    public EMPLOYEES() {
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
Rs = St.executeQuery("Select * from CARS.EMPLOYEETBL");
EMPTABLE.setModel(DbUtils.resultSetToTableModel(Rs));
            
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
        jLabel5 = new javax.swing.JLabel();
        EMPPASS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DELETE = new java.awt.Button();
        Edit = new java.awt.Button();
        CLARE = new java.awt.Button();
        jLabel11 = new javax.swing.JLabel();
        EMPID = new javax.swing.JTextField();
        ADD = new java.awt.Button();
        EMPGEN = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        EMPTABLE = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        EMPNAME = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        button6 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        LOGOUT = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Forte", 3, 48)); // NOI18N
        jLabel2.setText("MANAGER EMPLOYEES ");

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel5.setText("SELLERID");
        jLabel5.setToolTipText("");

        EMPPASS.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EMPPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMPPASSActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel6.setText("GENDER");

        DELETE.setBackground(new java.awt.Color(0, 102, 102));
        DELETE.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        DELETE.setForeground(new java.awt.Color(204, 204, 204));
        DELETE.setLabel("DELETE");
        DELETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETEMouseClicked(evt);
            }
        });
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
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

        CLARE.setBackground(new java.awt.Color(0, 102, 102));
        CLARE.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
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

        jLabel11.setBackground(new java.awt.Color(0, 51, 51));
        jLabel11.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel11.setText("PASSWORD");
        jLabel11.setToolTipText("");

        EMPID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EMPID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMPIDActionPerformed(evt);
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

        EMPGEN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));

        EMPTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SALID", "SALNAME", "SALPASS", "SALGEN"
            }
        ));
        EMPTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMPTABLEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(EMPTABLE);

        jLabel4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel4.setText("NAME");

        EMPNAME.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(86, 86, 86)
                        .addComponent(EMPID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel11)
                                .addGap(78, 78, 78)
                                .addComponent(EMPPASS))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 105, Short.MAX_VALUE)
                                .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel4))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(CLARE, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EMPGEN, 0, 166, Short.MAX_VALUE)
                            .addComponent(EMPNAME))))
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(EMPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EMPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EMPGEN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(EMPPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DELETE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLARE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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

        button6.setBackground(new java.awt.Color(204, 204, 204));
        button6.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        button6.setForeground(new java.awt.Color(0, 102, 102));
        button6.setLabel("BACK");
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
        });
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(336, 336, 336)
                                .addComponent(jLabel3))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(479, 479, 479)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void EMPPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMPPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMPPASSActionPerformed

    private void DELETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEMouseClicked
if(EMPID.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Enter the Seller to be deleted");
}else{
try{
        Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");
        String SId = EMPID.getText();
        String Query = "Delete from CARS.EMPLOYEETBL where EMPID = "+SId;
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
        CARS();
        JOptionPane.showMessageDialog(this, "Employee Deleted Successfuly");
}catch(Exception e){
    e.printStackTrace();
}
}
    }//GEN-LAST:event_DELETEMouseClicked

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEActionPerformed

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
if(EMPID.getText().isEmpty() || EMPNAME.getText().isEmpty() || EMPPASS.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Missing information");
} else {
    try {
        Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");

        String Query = "UPDATE CARS.EMPLOYEETBL SET EMPNAME = ?, EMPPASS = ?, EMPGEN = ? WHERE EMPID = ?";
        PreparedStatement pst = Con.prepareStatement(Query);

        pst.setString(1, EMPNAME.getText());
        pst.setString(2, EMPPASS.getText());
        pst.setString(3, EMPGEN.getSelectedItem().toString());
        pst.setInt(4, Integer.valueOf(EMPID.getText()));

        int row = pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Employee Updated Successfully");

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

    private void CLAREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLAREMouseClicked
        EMPPASS.setText("");
        EMPNAME.setText("");
        EMPID.setText("");
    }//GEN-LAST:event_CLAREMouseClicked

    private void CLAREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLAREActionPerformed
        EMPPASS.setText("");
        EMPNAME.setText("");
        EMPID.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_CLAREActionPerformed

    private void EMPIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMPIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMPIDActionPerformed

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
        if(EMPID.getText().isEmpty()|| EMPNAME.getText().isEmpty()||EMPPASS.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");
                PreparedStatement add = Con.prepareStatement("insert into EMPLOYEETBL values(?,?,?,?)");
                add.setInt(1, Integer.valueOf(EMPID.getText()));
                add.setString(2,EMPNAME.getText());
                add.setString(3,EMPPASS.getText());
                add.setString(4, EMPGEN.getSelectedItem().toString());

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Employee Added Successfuly");
                Con.close();
                CARS();

            }catch(Exception e){
                e.printStackTrace();
            }    }
    }//GEN-LAST:event_ADDMouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
        new MAIN_INTERFACE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button6MouseClicked

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        new LOGIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void EMPTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPTABLEMouseClicked
        
    DefaultTableModel model = (DefaultTableModel)EMPTABLE.getModel();
    int Myindex = EMPTABLE.getSelectedRow();
    EMPID.setText(model.getValueAt(Myindex, 0).toString());
    EMPNAME.setText(model.getValueAt(Myindex, 1).toString());
    EMPPASS.setText(model.getValueAt(Myindex, 2).toString());

    
        
    }//GEN-LAST:event_EMPTABLEMouseClicked

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
            java.util.logging.Logger.getLogger(EMPLOYEES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EMPLOYEES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EMPLOYEES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EMPLOYEES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMPLOYEES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ADD;
    private java.awt.Button CLARE;
    private java.awt.Button DELETE;
    private javax.swing.JComboBox<String> EMPGEN;
    private javax.swing.JTextField EMPID;
    private javax.swing.JTextField EMPNAME;
    private javax.swing.JTextField EMPPASS;
    private javax.swing.JTable EMPTABLE;
    private java.awt.Button Edit;
    private java.awt.Label LOGOUT;
    private java.awt.Button button6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
