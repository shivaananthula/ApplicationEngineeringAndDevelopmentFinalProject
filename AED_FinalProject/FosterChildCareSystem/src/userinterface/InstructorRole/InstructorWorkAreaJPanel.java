/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InstructorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Instructor.Instructor;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.SysAdminRole.ManageEnterpriseAdminJPanel;

/**
 *
 * @author shiva
 */
public class InstructorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InstructorWorkAreaJPanel
     */
   JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    public Instructor currentInstructor;
    public InstructorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ComputeCurrentInstructor();
    }
    
    public void ComputeCurrentInstructor(){
        String name = this.account.getEmployee().getName();
        
        this.currentInstructor = this.enterprise.getInstructorDirectory().getInstructorByName(name);
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        btnManageWorkRequest.setText("Manage Work Request");
        btnManageWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWorkRequestActionPerformed(evt);
            }
        });
        add(btnManageWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
         InstructorViewProfileJPanel viewProfile = new InstructorViewProfileJPanel(userProcessContainer,account, currentInstructor, organization, account.getRole().toString(), system);
        userProcessContainer.add("InstructorViewProfileJPanel",viewProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnManageWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWorkRequestActionPerformed
        // TODO add your handling code here:
         InstructorManageWorkReqJPanel manageWorkReq = new InstructorManageWorkReqJPanel(userProcessContainer,account, currentInstructor, organization, account.getRole().toString(), system);
        userProcessContainer.add("InstructorManageWorkReqJPanel",manageWorkReq);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageWorkRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageWorkRequest;
    private javax.swing.JButton btnViewProfile;
    // End of variables declaration//GEN-END:variables
}
