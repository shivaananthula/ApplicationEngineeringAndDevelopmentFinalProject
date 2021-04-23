/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HouseLessorRole;

import Business.EcoSystem;
import Business.HouseLessor.HouseLessor;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author koushik
 */
public class HouseLessorViewProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HouseLessorViewProfileJPanel
     */
   JPanel userProcessContainer;    
    public EcoSystem system;
    public HouseLessor currentHouseLessor;
    public Organization Organization;
    public String role;
    public UserAccount account;
    
    public HouseLessorViewProfileJPanel(JPanel userProcessContainer,UserAccount account, HouseLessor currentHouseLessor,Organization organization,String Role, EcoSystem system) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.currentHouseLessor = currentHouseLessor;
        this.Organization = organization;
        this.role = Role;
        this.account = account;
        this.PopulateWidgets();
    }
    
     public void PopulateWidgets(){
        txtOrganization.setText(this.Organization.getName());
        txtRole.setText(role);
        txtName.setText(this.currentHouseLessor.getName());
        txtEmail.setText(this.currentHouseLessor.getEmail());
        txtPhone.setText(this.currentHouseLessor.getPhoneNumber());
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
        jLabel1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtOrganization = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrganization.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        lblOrganization.setText("Organization:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        lblRole.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 30));

        lblPhone.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        lblPhone.setText("Phone:");
        add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 20));

        lblUsername.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, 30));

        txtName.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 150, 30));

        txtPhone.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 150, 30));

        txtAddress.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 150, 30));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/children.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 740, 270));

        lblEmail.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, 30));

        txtEmail.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 150, 30));

        lblAddress.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 50));

        txtUsername.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 150, 30));

        txtOrganization.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 160, 30));

        txtRole.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 160, 30));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HouseLessorWorkAreaJPanel houseLessor = (HouseLessorWorkAreaJPanel) component;
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
