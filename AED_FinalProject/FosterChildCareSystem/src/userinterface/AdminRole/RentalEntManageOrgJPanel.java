/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdminRole;

/**
 *
 * @author koushik
 */
public class RentalEntManageOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RentalEntManageOrgJPanel
     */
    public RentalEntManageOrgJPanel() {
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

        lblTitle = new javax.swing.JLabel();
        splitpaneTable = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        lblOrganizationName = new javax.swing.JLabel();
        lblOrganizationType = new javax.swing.JLabel();
        cbOrganizationType = new javax.swing.JComboBox<>();
        txtOrganizationName = new javax.swing.JTextField();
        btnAddOrganization = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setText("Manage Rental Enterprise Organizations");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        splitpaneTable.setViewportView(tblOrganization);

        add(splitpaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 520, 200));

        lblOrganizationName.setText("Organization Name:");
        add(lblOrganizationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        lblOrganizationType.setText("Organization Type:");
        add(lblOrganizationType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        cbOrganizationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "House Lessor", " ", " " }));
        add(cbOrganizationType, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 180, -1));
        add(txtOrganizationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 170, -1));

        btnAddOrganization.setText("Add Organization");
        add(btnAddOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 140, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JComboBox<String> cbOrganizationType;
    private javax.swing.JLabel lblOrganizationName;
    private javax.swing.JLabel lblOrganizationType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane splitpaneTable;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTextField txtOrganizationName;
    // End of variables declaration//GEN-END:variables
}
