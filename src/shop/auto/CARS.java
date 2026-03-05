
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



public class CARS extends javax.swing.JFrame {


    public CARS() {
        initComponents();
        CARS1();
    }
Connection Con= null;
Statement St = null;
ResultSet Rs = null;
@SuppressWarnings("unchecked")

    public void CARS1(){
    try{
            
    Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");
St = Con.createStatement();
Rs = St.executeQuery("Select * from CARS.CARTB");
CARTABLE.setModel(DbUtils.resultSetToTableModel(Rs));
            
    }catch(Exception e){
        e.printStackTrace();
    }
}

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CARNAME = new javax.swing.JTextField();
        CARPRICE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CARMODEL = new javax.swing.JTextField();
        DELETE = new java.awt.Button();
        Edit = new java.awt.Button();
        CLARE = new java.awt.Button();
        jLabel11 = new javax.swing.JLabel();
        CARID = new javax.swing.JTextField();
        ADD = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        CARTABLE = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        button6 = new java.awt.Button();
        button8 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        LOGOUT = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel2.setText("C A R S");

        jLabel4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel4.setText("MODEL");

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel5.setText("CAR.ID");
        jLabel5.setToolTipText("");

        CARNAME.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CARNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARNAMEActionPerformed(evt);
            }
        });

        CARPRICE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel6.setText("PRICE");

        CARMODEL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CARMODEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARMODELActionPerformed(evt);
            }
        });

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
        jLabel11.setText("NAME");
        jLabel11.setToolTipText("");

        CARID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CARID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARIDActionPerformed(evt);
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

        CARTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CARID", "CARNAME", "CARMODEL", "CARPRICE"
            }
        ));
        CARTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CARTABLEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CARTABLE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CARMODEL, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CARID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CARPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CARNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(416, 416, 416))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(CLARE, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(CARNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CARID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(CARPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CARMODEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DELETE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLARE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
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

        button8.setBackground(new java.awt.Color(204, 204, 204));
        button8.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        button8.setForeground(new java.awt.Color(0, 102, 102));
        button8.setLabel("REPORTS");
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button8MouseClicked(evt);
            }
        });
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CARNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CARNAMEActionPerformed

    private void CARMODELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARMODELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CARMODELActionPerformed

    private void DELETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEMouseClicked
if(CARID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Car to be deleted");
        }else{
            try{
                Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cars","1234");
                String PId = CARID.getText();
                String Query = "Delete from cars.CARTB where CARID = "+PId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);

                JOptionPane.showMessageDialog(this, "Car Deleted Successfuly");
                 CARS1();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEMouseClicked

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEActionPerformed

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
if(CARID.getText().isEmpty() || CARMODEL.getText().isEmpty() || CARNAME.getText().isEmpty() || CARPRICE.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Missing information");
} else {
    try {
        Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");

        String Query = "UPDATE CARS.CARTB SET CARID = ?, CARMODEL = ? WHERE CARNAME = ? AND CARPRICE = ?";
        PreparedStatement pst = Con.prepareStatement(Query);

        pst.setInt(1, Integer.valueOf(CARID.getText()));
        pst.setString(2, CARMODEL.getText());
        pst.setString(3, CARNAME.getText());
        pst.setInt(4, Integer.valueOf(CARPRICE.getText()));

        int row = pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Car Updated Successfully");

        Con.close();
        CARS1();

    } catch(Exception e) {
        e.printStackTrace();
    }
}

    }//GEN-LAST:event_EditMouseClicked

    private void Editbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbutton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Editbutton4ActionPerformed

    private void CLAREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLAREMouseClicked
        CARNAME.setText("");
        CARMODEL.setText("");
        CARPRICE.setText("");
        CARID.setText("");
    }//GEN-LAST:event_CLAREMouseClicked

    private void CLAREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLAREActionPerformed
        CARNAME.setText("");
        CARMODEL.setText("");
        CARPRICE.setText("");
        CARID.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_CLAREActionPerformed

    private void CARIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CARIDActionPerformed

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
        if(CARID.getText().isEmpty()|| CARNAME.getText().isEmpty()||CARMODEL.getText().isEmpty()||CARPRICE.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "cars", "1234");
                PreparedStatement add = Con.prepareStatement("insert into CARTB values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(CARID.getText()));
            add.setString(2,CARNAME.getText());
            add.setString(3,CARMODEL.getText());
            add.setString(4,CARPRICE.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Car Added Successfuly");
                Con.close();
                CARS1();

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

    private void button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseClicked
        new REPORTS_FROM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button8MouseClicked

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        new LOGIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void CARTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CARTABLEMouseClicked
    DefaultTableModel model = (DefaultTableModel)CARTABLE.getModel();
    int Myindex = CARTABLE.getSelectedRow();
    
    CARID.setText(model.getValueAt(Myindex, 0).toString());
    CARNAME.setText(model.getValueAt(Myindex, 1).toString());
    CARMODEL.setText(model.getValueAt(Myindex, 2).toString());
    CARPRICE.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_CARTABLEMouseClicked

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
            java.util.logging.Logger.getLogger(CARS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CARS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CARS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CARS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CARS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ADD;
    private javax.swing.JTextField CARID;
    private javax.swing.JTextField CARMODEL;
    private javax.swing.JTextField CARNAME;
    private javax.swing.JTextField CARPRICE;
    private javax.swing.JTable CARTABLE;
    private java.awt.Button CLARE;
    private java.awt.Button DELETE;
    private java.awt.Button Edit;
    private java.awt.Label LOGOUT;
    private java.awt.Button button6;
    private java.awt.Button button8;
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
