/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koushik
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    JPanel userProcessContainer;
    public EcoSystem system;
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system = system;
        this.populateComboBox();
        this.populateTable();
    }
    
     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }
    
    private void populateComboBox() {
        cbNetwork.removeAllItems();
        cbEnterpriseName.removeAllItems();

        for (Network network : system.getNetworkList()) {
            cbNetwork.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            cbEnterpriseName.addItem(type);
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        scrollpaneEnterprise = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        lblNetwork = new javax.swing.JLabel();
        lblEnterpriseType = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cbEnterpriseName = new javax.swing.JComboBox();
        cbNetwork = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        deleteEnterprise = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("Manage Enterprise");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        tblEnterprise.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpaneEnterprise.setViewportView(tblEnterprise);

        add(scrollpaneEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 570, 210));

        lblNetwork.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblNetwork.setText("Network:");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        lblEnterpriseType.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblEnterpriseType.setText("Enterprise Type:");
        add(lblEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        txtName.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 170, -1));

        btnSubmit.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        btnBack.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        cbEnterpriseName.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        cbEnterpriseName.setForeground(new java.awt.Color(25, 56, 82));
        cbEnterpriseName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnterpriseNameActionPerformed(evt);
            }
        });
        add(cbEnterpriseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 170, 20));

        cbNetwork.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        cbNetwork.setForeground(new java.awt.Color(25, 56, 82));
        cbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNetworkActionPerformed(evt);
            }
        });
        add(cbNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 170, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/children.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 740, 270));

        deleteEnterprise.setText("Delete Enterprise");
        deleteEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEnterpriseActionPerformed(evt);
            }
        });
        add(deleteEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
//        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Network network = (Network) cbNetwork.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cbEnterpriseName.getSelectedItem();
        String name = txtName.getText();

        if (network == null || type == null || name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter All Fields to Proceed!");
            return;
        }
        if (system.checkIfEnterpriseIsUnique(name)) {
            Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
            JOptionPane.showMessageDialog(null, "Enterprise created sucessfully!");
            txtName.setText("");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Enterprise name already exists in system!", "Warning", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbEnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnterpriseNameActionPerformed
        

    }//GEN-LAST:event_cbEnterpriseNameActionPerformed

    private void cbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNetworkActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbNetworkActionPerformed

    private void deleteEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEnterpriseActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEnterprise.getSelectedRow();
        
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblEnterprise.getModel();
            String NetworkName = (String)tableRecords.getValueAt(selectedRow, 1);
            String Enterprise = (String)tableRecords.getValueAt(selectedRow, 0);
            
            for(Network network: this.system.getNetworkList()){
                if(network.getName().equals(NetworkName)){
                    Enterprise toDelete = null;
                    for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList()){
                        if(e.getName().equals(Enterprise)){
                            toDelete = e;
                            break;
                        }
                    }
                    if(toDelete!= null){
                        network.getEnterpriseDirectory().getEnterpriseList().remove(toDelete);
                        break;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Enterprise " + Enterprise+  " deleted sucessfully!");
            populateTable();
        }
        
        
    }//GEN-LAST:event_deleteEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbEnterpriseName;
    private javax.swing.JComboBox cbNetwork;
    private javax.swing.JButton deleteEnterprise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollpaneEnterprise;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
