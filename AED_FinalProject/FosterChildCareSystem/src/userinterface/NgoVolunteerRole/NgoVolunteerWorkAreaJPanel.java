/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NgoVolunteerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Voluteers.Volunteer;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shiva
 */
public class NgoVolunteerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NgoVolunteerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    public Volunteer currentVolunteer;
    public NgoVolunteerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ComputeCurrentVolunteer();
        
    }

     public void ComputeCurrentVolunteer(){
        String name = this.account.getEmployee().getName();
        
        this.currentVolunteer = this.enterprise.getVolunteerDirectory().getVolunteerByName(name);
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewProfile = new javax.swing.JButton();
        btnManageWorkRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewProfile.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 150, 110));

        btnManageWorkRequest.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnManageWorkRequest.setText("Manage Work Request");
        btnManageWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWorkRequestActionPerformed(evt);
            }
        });
        add(btnManageWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 110));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/donate.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 740, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NgoVolunteerRole/coins.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, -30, 320, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
          NgoViewProfileJPanel viewProfile = new NgoViewProfileJPanel(userProcessContainer,account,currentVolunteer,organization,account.getRole().toString(), system);
        userProcessContainer.add("ManageEnterpriseAdminJPanel",viewProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnManageWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWorkRequestActionPerformed
        // TODO add your handling code here:
        NgoManageWorkReqJPanel manageWorkReq = new NgoManageWorkReqJPanel(userProcessContainer,account,currentVolunteer,organization,account.getRole().toString(), system);
        userProcessContainer.add("ManageEnterpriseAdminJPanel",manageWorkReq);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnManageWorkRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageWorkRequest;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
