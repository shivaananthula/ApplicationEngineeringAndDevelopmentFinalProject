/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrationRole;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koushik
 */
public class FundRaiserEntManageOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FundRaiserEntManageOrgJPanel
     */
            private final OrganizationDirectory directory;

    public FundRaiserEntManageOrgJPanel(OrganizationDirectory directory) {
        initComponents();
        this.directory = directory;
        volPopulate();
        populateOrganizationTypeComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void volPopulate() {
            
               DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();

        model.setRowCount(0);

        for (Organization organization : directory.getOrganizationList()) {
            {
                Object[] row = new Object[2];
                row[0] = organization.getType().getValue();
                row[1] = organization.getName();
                model.addRow(row);
            }

        }
            
        }
    
    private void populateOrganizationTypeComboBox() {
        cbOrganizationType.removeAllItems();
        cbOrganizationType.addItem(Organization.OrganizationType.TreasurerOrganization);
                cbOrganizationType.addItem(Organization.OrganizationType.NgoOrganization);


    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        splitpaneTable = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        lblOrganizationName = new javax.swing.JLabel();
        lblOrganizationType = new javax.swing.JLabel();
        txtOrganizationName = new javax.swing.JTextField();
        btnAddOrganization = new javax.swing.JButton();
        cbOrganizationType = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("Manage Fundraiser Enterprise Organizations");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        tblOrganization.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization Type", "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        splitpaneTable.setViewportView(tblOrganization);

        add(splitpaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 520, 200));

        lblOrganizationName.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        lblOrganizationName.setText("Organization Name:");
        add(lblOrganizationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        lblOrganizationType.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        lblOrganizationType.setText("Organization Type:");
        add(lblOrganizationType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        txtOrganizationName.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        add(txtOrganizationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 170, -1));

        btnAddOrganization.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });
        add(btnAddOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 140, -1));

        cbOrganizationType.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        cbOrganizationType.setForeground(new java.awt.Color(25, 56, 82));
        add(cbOrganizationType, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 171, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed
        // TODO add your handling code here:
         Organization.OrganizationType type = (Organization.OrganizationType) cbOrganizationType.getSelectedItem();

        if ("".equals(txtOrganizationName.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!");
        } else {
            Organization organization = directory.createOrganization(type, txtOrganizationName.getText());
            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            txtOrganizationName.setText("");
            volPopulate();
        }
    }//GEN-LAST:event_btnAddOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JComboBox cbOrganizationType;
    private javax.swing.JLabel lblOrganizationName;
    private javax.swing.JLabel lblOrganizationType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane splitpaneTable;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTextField txtOrganizationName;
    // End of variables declaration//GEN-END:variables
}
