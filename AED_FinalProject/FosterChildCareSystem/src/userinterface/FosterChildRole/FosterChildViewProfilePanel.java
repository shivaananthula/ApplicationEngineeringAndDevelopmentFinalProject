/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterChildRole;

import Business.EcoSystem;
import Business.FosterChild.FosterChild;
import Business.Organization.Organization;
import Business.Parent.Parent;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author shiva
 */
public class FosterChildViewProfilePanel extends javax.swing.JPanel {

    /**
     * Creates new form FosterChildViewProfilePanel
     */
    JPanel userProcessContainer;    
    public EcoSystem system;
    public FosterChild CurrentChild;
    public Organization Organization;
    public String role;
    public UserAccount account;
    
    public FosterChildViewProfilePanel(JPanel userProcessContainer,UserAccount account, FosterChild currentChild,Organization organization,String Role, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.CurrentChild = currentChild;
        this.Organization = organization;
        this.role = Role;
        this.account = account;
        this.PopulateWidgets();
    }
    
    public void PopulateWidgets(){
        txtOrganization.setText(this.Organization.getName());
        txtRole.setText(role);
        txtName.setText(this.CurrentChild.getName());
        txtEmail.setText(this.CurrentChild.getEmail());
        txtPhone.setText(this.CurrentChild.getPhone());
        txtUsername.setText(this.account.getUsername());
        txtAddress.setText(this.CurrentChild.getAddress());
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
        jLabel1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtOrganization = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrganization.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblOrganization.setText("Organization:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        lblRole.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, 30));

        lblPhone.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblPhone.setText("Phone:");
        add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, 20));

        lblUsername.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, 30));

        txtName.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 160, 30));

        txtPhone.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 160, 30));

        txtAddress.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 150, 30));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/children.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 740, 270));

        lblEmail.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, 30));

        txtEmail.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 150, 30));

        lblAddress.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, 50));

        txtUsername.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 150, 30));

        txtOrganization.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        txtOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrganizationActionPerformed(evt);
            }
        });
        add(txtOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 160, 30));

        txtRole.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 160, 30));

        Back.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FosterChildWorkAreaJPanel sysAdminwjp = (FosterChildWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackActionPerformed

    private void txtOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrganizationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
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
