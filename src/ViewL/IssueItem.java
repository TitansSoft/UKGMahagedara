package ViewL;

import DataAccess.DataAccessor;
import DataAccess.Item;
import DataAccess.ItemController;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IssueItem extends javax.swing.JPanel {

    int total = 0;
    int count = 0;

    public IssueItem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        issueItemLb = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        repIDLb = new javax.swing.JLabel();
        comboRepId = new javax.swing.JComboBox();
        dateLb = new javax.swing.JLabel();
        srepNameLb = new javax.swing.JLabel();
        vehicleIDTxt = new javax.swing.JTextField();
        vehicleIDLb = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        itemIDTxt = new javax.swing.JLabel();
        comboItemID = new javax.swing.JComboBox();
        qtySpinner = new javax.swing.JSpinner();
        qtyLb = new javax.swing.JLabel();
        desLb = new javax.swing.JLabel();
        desTxt = new javax.swing.JTextField();
        addItemBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        issueTable = new javax.swing.JTable();
        issueBtn = new javax.swing.JButton();
        removeSelectedBtn = new javax.swing.JButton();
        issueItem = new javax.swing.JButton();
        repName = new javax.swing.JTextField();
        comboKeeperID = new javax.swing.JComboBox();
        txtKeeperID = new javax.swing.JLabel();

        issueItemLb.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        issueItemLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issueitem.png"))); // NOI18N
        issueItemLb.setText("Issue Item");

        repIDLb.setText("Representative ID ");

        DataAccessor da = new DataAccessor();
        comboRepId.setModel(new javax.swing.DefaultComboBoxModel(da.getRepList().toArray()));
        comboRepId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRepIdActionPerformed(evt);
            }
        });

        dateLb.setText("Date");

        srepNameLb.setText("Sales Representative Name");

        vehicleIDTxt.setEditable(false);
        vehicleIDTxt.setText(da.getVehicleId((String)comboRepId.getSelectedItem()));
        vehicleIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleIDTxtActionPerformed(evt);
            }
        });

        vehicleIDLb.setText("Vehicle ID");

        itemIDTxt.setText("Item ID");

        comboItemID.setModel(new javax.swing.DefaultComboBoxModel(da.getItemList().toArray()));
        comboItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboItemIDActionPerformed(evt);
            }
        });

        qtySpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        qtySpinner.setValue(1);

        qtyLb.setText("Quantity");

        desLb.setText("Description");

        desTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desTxtMouseClicked(evt);
            }
        });
        desTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desTxtActionPerformed(evt);
            }
        });

        addItemBtn.setText("Add Item");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });
        addItemBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addItemBtnKeyPressed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        issueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue Code","Rep ID" , "Item ID", "Description", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(issueTable);

        issueBtn.setText("Cancel ");
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });

        removeSelectedBtn.setText("Remove Seletced");
        removeSelectedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSelectedBtnActionPerformed(evt);
            }
        });

        issueItem.setText("Issue Item");
        issueItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueItemActionPerformed(evt);
            }
        });

        repName.setEditable(false);
        repName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repNameActionPerformed(evt);
            }
        });

        comboKeeperID.setModel(new javax.swing.DefaultComboBoxModel(da.getKeeperList().toArray()));
        comboKeeperID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKeeperIDActionPerformed(evt);
            }
        });

        txtKeeperID.setText("Keeper ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Separator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(repIDLb)
                                .addGap(59, 59, 59)
                                .addComponent(comboRepId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(srepNameLb)
                                .addGap(18, 18, 18)
                                .addComponent(repName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtKeeperID)
                                .addGap(18, 18, 18)
                                .addComponent(comboKeeperID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)
                                .addComponent(dateLb))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(vehicleIDLb)
                                .addGap(18, 18, 18)
                                .addComponent(vehicleIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemIDTxt)
                            .addComponent(desLb))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qtyLb)
                                .addGap(18, 18, 18)
                                .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(desTxt)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addItemBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(issueItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeSelectedBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(issueBtn))))
                    .addComponent(issueItemLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(issueItemLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repIDLb)
                    .addComponent(comboRepId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLb)
                    .addComponent(comboKeeperID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKeeperID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(srepNameLb)
                    .addComponent(vehicleIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleIDLb)
                    .addComponent(repName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboItemID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itemIDTxt)
                        .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtyLb)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desLb)
                    .addComponent(desTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(addItemBtn))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueBtn)
                    .addComponent(removeSelectedBtn)
                    .addComponent(issueItem))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_issueBtnActionPerformed

    private void removeSelectedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSelectedBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) issueTable.getModel();
        while (issueTable.getSelectedRow() != -1) {
            model.removeRow(issueTable.getSelectedRow());
        }
        int i = 1;
        while (i < model.getRowCount()) {
            String issueId = (String) model.getValueAt(i - 1, 0);
            DecimalFormat df = new DecimalFormat("IS0000");
            df.setMinimumIntegerDigits(4);
            issueId = df.format(Integer.parseInt(issueId.substring(2)) + 1);
            model.setValueAt(issueId, i, 0);
            i++;
        }
    }//GEN-LAST:event_removeSelectedBtnActionPerformed

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        if (comboItemID.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Please select an Item to issue.");
        } else if (comboKeeperID.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Please select a keeper id.");
        } else if (comboRepId.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Please select a sales representative.");
        } else if ((Integer) qtySpinner.getValue() == 0) {
            JOptionPane.showMessageDialog(this, "You cannot issue zero items.");
        } else {
            String issueId;
            DefaultTableModel model = (DefaultTableModel) issueTable.getModel();
            if (model.getRowCount() == 0) {
                DataAccessor da = new DataAccessor();
                issueId = da.getIssueID();
            } else {
                issueId = (String) model.getValueAt(model.getRowCount() - 1, 0);
            }
            DecimalFormat df = new DecimalFormat("IS0000");
            df.setMinimumIntegerDigits(4);
            issueId = df.format(Integer.parseInt(issueId.substring(2)) + 1);
            model.addRow(new Object[]{issueId, (String) comboRepId.getSelectedItem(),
                        (String) comboItemID.getSelectedItem(), desTxt.getText(), (Integer) qtySpinner.getValue()});
        }
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void addItemBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addItemBtnKeyPressed
    }//GEN-LAST:event_addItemBtnKeyPressed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        comboRepId.setSelectedIndex(0);
        desTxt.setText("");
        comboItemID.setSelectedIndex(0);
        qtySpinner.setValue(Integer.parseInt("0"));
    }//GEN-LAST:event_clearBtnActionPerformed

    private void issueItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueItemActionPerformed
        DefaultTableModel model = (DefaultTableModel) issueTable.getModel();
        while (model.getRowCount() > 0) {
            String[] data = new String[6];
            data[ 0] = (String) model.getValueAt(0, 0);
            data[ 1] = (String) model.getValueAt(0, 2);
            SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
            String date = today.format(new Date());
            data[ 2] = date;
            data[ 3] = "" + model.getValueAt(0, 4);
            data[ 4] = (String)comboKeeperID.getSelectedItem();
            data[5] = (String)model.getValueAt(0, 1);
            DataAccessor da = new DataAccessor();
            da.issueItem(data);
            model.removeRow(0);
        }
    }//GEN-LAST:event_issueItemActionPerformed

    private void comboItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboItemIDActionPerformed
        String itemCode = (String) comboItemID.getSelectedItem();

        if (itemCode == null) {
            return;
        }
        String type;
        String length_inches;
        String length_mm;
        Item item;

        try {
            item = ItemController.searchItem(itemCode);
            if (item == null) {
                return;
            }
            type = item.getType();
            length_inches = item.getLength_inches();
            length_mm = item.getLength_mm();
            String txt = itemCode + "_" + type + "_" + length_inches + "_" + length_mm;
            desTxt.setText(txt);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IssueItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IssueItem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_comboItemIDActionPerformed

    private void desTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desTxtActionPerformed
    }//GEN-LAST:event_desTxtActionPerformed

    private void desTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desTxtMouseClicked
    }//GEN-LAST:event_desTxtMouseClicked

    private void comboRepIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRepIdActionPerformed
        DataAccessor da = new DataAccessor();
        repName.setText(da.getRepName((String) comboRepId.getSelectedItem()));
        vehicleIDTxt.setText(da.getVehicleId((String) comboRepId.getSelectedItem()));
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRepIdActionPerformed

    private void comboKeeperIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKeeperIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboKeeperIDActionPerformed

    private void repNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repNameActionPerformed

    private void vehicleIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleIDTxtActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JButton addItemBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JComboBox comboItemID;
    private javax.swing.JComboBox comboKeeperID;
    private javax.swing.JComboBox comboRepId;
    private javax.swing.JLabel dateLb;
    private javax.swing.JLabel desLb;
    private javax.swing.JTextField desTxt;
    private javax.swing.JButton issueBtn;
    private javax.swing.JButton issueItem;
    private javax.swing.JLabel issueItemLb;
    private javax.swing.JTable issueTable;
    private javax.swing.JLabel itemIDTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel qtyLb;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JButton removeSelectedBtn;
    private javax.swing.JLabel repIDLb;
    private javax.swing.JTextField repName;
    private javax.swing.JLabel srepNameLb;
    private javax.swing.JLabel txtKeeperID;
    private javax.swing.JLabel vehicleIDLb;
    private javax.swing.JTextField vehicleIDTxt;
    // End of variables declaration//GEN-END:variables
}
