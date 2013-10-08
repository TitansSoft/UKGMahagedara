/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Malsha Samani
 */
public class createAccount extends javax.swing.JPanel {

    /**
     * Creates new form createAccount
     */
    public createAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headreLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        pwLabel = new javax.swing.JLabel();
        cnfrmPwLabel = new javax.swing.JLabel();
        addrLabel = new javax.swing.JLabel();
        nicLabel = new javax.swing.JLabel();
        workLabel = new javax.swing.JLabel();
        acccTypeLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        lNameTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        pwTextField = new javax.swing.JTextField();
        cnfrmPwTextField = new javax.swing.JTextField();
        addrTextField = new javax.swing.JTextField();
        NICTextField = new javax.swing.JTextField();
        workTextField = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        headreLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        headreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        headreLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create account.png"))); // NOI18N
        headreLabel.setText("Create a new Account");

        nameLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nameLabel.setText("Name");

        idLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        idLabel.setText("ID Number");

        pwLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        pwLabel.setText("Create a password");

        cnfrmPwLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cnfrmPwLabel.setText("Confirm your password");

        addrLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        addrLabel.setText("Address");

        nicLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nicLabel.setText("NIC Number");

        workLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        workLabel.setText("Work started");

        acccTypeLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        acccTypeLabel.setText("Choose your account type");

        fNameTextField.setText("First");
        fNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fNameTextFieldMouseClicked(evt);
            }
        });
        fNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextFieldActionPerformed(evt);
            }
        });
        fNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fNameTextFieldFocusGained(evt);
            }
        });

        lNameTextField.setText("Last");
        lNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lNameTextFieldMouseClicked(evt);
            }
        });
        lNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTextFieldActionPerformed(evt);
            }
        });
        lNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lNameTextFieldKeyPressed(evt);
            }
        });

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        pwTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwTextFieldActionPerformed(evt);
            }
        });

        cnfrmPwTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnfrmPwTextFieldActionPerformed(evt);
            }
        });

        addrTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrTextFieldActionPerformed(evt);
            }
        });

        NICTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NICTextFieldActionPerformed(evt);
            }
        });

        workTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workTextFieldActionPerformed(evt);
            }
        });

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setText("Create New Account");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acccTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(workLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addrLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnfrmPwLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pwTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(idTextField)
                        .addComponent(cnfrmPwTextField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(addrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NICTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(workTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnfrmPwLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnfrmPwTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NICTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acccTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void pwTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwTextFieldActionPerformed

    private void cnfrmPwTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnfrmPwTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnfrmPwTextFieldActionPerformed

    private void addrTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrTextFieldActionPerformed

    private void NICTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NICTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NICTextFieldActionPerformed

    private void workTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workTextFieldActionPerformed

    private void fNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameTextFieldFocusGained
    }//GEN-LAST:event_fNameTextFieldFocusGained

    private void lNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTextFieldActionPerformed
    }//GEN-LAST:event_lNameTextFieldActionPerformed

    private void fNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextFieldActionPerformed
    }//GEN-LAST:event_fNameTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fNameTextFieldMouseClicked
        fNameTextField.setText(" ");
    }//GEN-LAST:event_fNameTextFieldMouseClicked

    private void lNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextFieldKeyPressed
    }//GEN-LAST:event_lNameTextFieldKeyPressed

    private void lNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lNameTextFieldMouseClicked
        lNameTextField.setText(" ");
    }//GEN-LAST:event_lNameTextFieldMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NICTextField;
    private javax.swing.JLabel acccTypeLabel;
    private javax.swing.JLabel addrLabel;
    private javax.swing.JTextField addrTextField;
    private javax.swing.JLabel cnfrmPwLabel;
    private javax.swing.JTextField cnfrmPwTextField;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JLabel headreLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nicLabel;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JTextField pwTextField;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel workLabel;
    private javax.swing.JTextField workTextField;
    // End of variables declaration//GEN-END:variables
}