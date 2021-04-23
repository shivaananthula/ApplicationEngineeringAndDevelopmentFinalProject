/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TreasurerRole;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Treasurer.Treasurer;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author koushik
 */
public class TreasurerViewProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TreasurerViewProfileJPanel
     */
   JPanel userProcessContainer;
    public EcoSystem system;
    public Treasurer currentTreasurer;
    public Organization Organization;
    public String role;
    public UserAccount account;
    
    public TreasurerViewProfileJPanel(JPanel userProcessContainer,UserAccount account, Treasurer currentTreasurer,Organization organization,String Role, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.currentTreasurer = currentTreasurer;
        this.Organization = organization;
        this.role = Role;
        this.account = account;
        this.PopulateWidgets();
    }
    
     public void PopulateWidgets(){
        txtOrganization.setText(this.Organization.getName());
        txtRole.setText(role);
        txtName.setText(this.currentTreasurer.getName());
        txtEmail.setText(this.currentTreasurer.getEmail());
        txtPhone.setText(this.currentTreasurer.getPhoneNumber());
        txtUsername.setText(this.account.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrganization = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtOrganization = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrganization.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblOrganization.setText("Organization:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        lblRole.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, 30));

        lblPhone.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblPhone.setText("Phone:");
        add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 20));

        lblUsername.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, 30));

        txtName.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 160, 30));

        txtPhone.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 160, 30));

        txtAddress.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 150, 30));

        lblEmail.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, 30));

        txtEmail.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 150, 30));

        lblAddress.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, 50));

        txtUsername.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 150, 30));

        txtOrganization.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 160, 30));

        txtRole.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 160, 30));

        btnBack.setBackground(new java.awt.Color(255, 229, 180));
        btnBack.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/TreasurerRole/dollar.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 1120, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TreasurerWorkAreaJPanel fosterParent = (TreasurerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrganization;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
