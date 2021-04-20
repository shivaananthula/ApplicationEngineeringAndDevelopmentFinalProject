/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrationRole;

/**
 *
 * @author koushik
 */
public class FundRaiserEntManageEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FundRaiserEntManageEmpJPanel
     */
    public FundRaiserEntManageEmpJPanel() {
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
        scrollpaneTable = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        lblOrganization = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        cbOrganization = new javax.swing.JComboBox<>();
        cbRole = new javax.swing.JComboBox<>();
        lblCreateEmp = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setText("Manage Fundraiser Enterprise Employees");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        scrollpaneTable.setViewportView(tblEmployee);

        add(scrollpaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 580, 200));

        lblOrganization.setText("Organization:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        cbOrganization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Treasurer", "NGO" }));
        add(cbOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 150, -1));

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Treasurer", "NGO" }));
        add(cbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 150, -1));

        lblCreateEmp.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lblCreateEmp.setForeground(new java.awt.Color(25, 56, 82));
        lblCreateEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateEmp.setText("CREATE AN EMPLOYEE");
        add(lblCreateEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 465, 40));

        btnCreate.setText("Create");
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cbOrganization;
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JLabel lblCreateEmp;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollpaneTable;
    private javax.swing.JTable tblEmployee;
    // End of variables declaration//GEN-END:variables
}
