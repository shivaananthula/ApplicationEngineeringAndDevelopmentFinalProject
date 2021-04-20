/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysAdminRole;

import Business.EcoSystem;

/**
 *
 * @author koushik
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    
    public EcoSystem system;
    public ManageEnterpriseJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        
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
        cbNetwork = new javax.swing.JComboBox<>();
        cbEnterpriseName = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setText("Manage Enterprise");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

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

        add(scrollpaneEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 570, 210));

        lblNetwork.setText("Network:");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        lblEnterpriseType.setText("Enterprise Type:");
        add(lblEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 170, -1));

        cbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 170, -1));

        cbEnterpriseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbEnterpriseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 170, -1));

        btnSubmit.setText("Submit");
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbEnterpriseName;
    private javax.swing.JComboBox<String> cbNetwork;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollpaneEnterprise;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
