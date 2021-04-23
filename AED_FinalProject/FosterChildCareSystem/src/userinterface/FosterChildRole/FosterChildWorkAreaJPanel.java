/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterChildRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FosterChild.FosterChild;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.FosterParentRole.TrainerJPanel;
import userinterface.FosterParentRole.ViewProfileJPanel;

/**
 *
 * @author shiva
 */
public class FosterChildWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FosterChildWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    public FosterChild currentChild;
    public FosterChildWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ComputeCurrentChild();
        labelHelloChild.setText("Hello "+ this.currentChild.getName());
    }
    
     public void ComputeCurrentChild(){
        String name = this.account.getEmployee().getName();
        
        this.currentChild = this.enterprise.getFosterChildDirectory().getChildbyName(name);
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
        btnBookSlot = new javax.swing.JButton();
        labelHelloChild = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCounsHistory = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewProfile.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, 100));

        btnBookSlot.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnBookSlot.setText("Book slot for Counselling");
        btnBookSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookSlotActionPerformed(evt);
            }
        });
        add(btnBookSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 200, 100));
        add(labelHelloChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 150, 30));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/children.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, 270));

        btnCounsHistory.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnCounsHistory.setText("View Counselling History");
        btnCounsHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCounsHistoryActionPerformed(evt);
            }
        });
        add(btnCounsHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 170, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
        FosterChildViewProfilePanel viewProfile=new FosterChildViewProfilePanel(userProcessContainer,account,currentChild,organization,account.getRole().toString(), system);
         userProcessContainer.add("View Profile",viewProfile);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnBookSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookSlotActionPerformed
        // TODO add your handling code here:
        FosterChildCounselingSlotJPanel trainer=new FosterChildCounselingSlotJPanel(userProcessContainer,account,currentChild,network,enterprise, system);
        userProcessContainer.add("View Counselors",trainer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBookSlotActionPerformed

    private void btnCounsHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCounsHistoryActionPerformed
        // TODO add your handling code here:
        ChildCounsellingHistoryJPanel trainer=new ChildCounsellingHistoryJPanel(userProcessContainer,account,currentChild,network,enterprise, system);
        userProcessContainer.add("View Counselors",trainer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCounsHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookSlot;
    private javax.swing.JButton btnCounsHistory;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelHelloChild;
    // End of variables declaration//GEN-END:variables
}
