/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.AdministrationRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author shiva
 */
public class FundRaiseEntAdminWorkAreaPanel extends javax.swing.JPanel {

    /** Creates new form FundRaiseEntAdminWorkAreaPanel */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    
    public FundRaiseEntAdminWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FundRaiserSplit = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageReq = new javax.swing.JButton();
        btnManageOrg = new javax.swing.JButton();
        btnManageEmp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        FundRaiserSplit.setDividerLocation(200);

        btnManageReq.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnManageReq.setText("Manage Requests");
        btnManageReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageReqActionPerformed(evt);
            }
        });

        btnManageOrg.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnManageOrg.setText("Manage Organization");
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });

        btnManageEmp.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnManageEmp.setText("Manage Employee");
        btnManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnManageReq, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageOrg)
                    .addComponent(btnManageEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnManageOrg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageEmp)
                .addGap(18, 18, 18)
                .addComponent(btnManageReq)
                .addContainerGap(436, Short.MAX_VALUE))
        );

        FundRaiserSplit.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );

        FundRaiserSplit.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundRaiserSplit)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundRaiserSplit)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
        // TODO add your handling code here:
        FundRaiserEntManageOrgJPanel fundorg=new FundRaiserEntManageOrgJPanel(enterprise.getOrganizationDirectory());
        FundRaiserSplit.setRightComponent(fundorg);
        
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpActionPerformed
        // TODO add your handling code here:
        FundRaiserEntManageEmpJPanel fundemp=new FundRaiserEntManageEmpJPanel(enterprise,organization,enterprise.getOrganizationDirectory());
        FundRaiserSplit.setRightComponent(fundemp);
    }//GEN-LAST:event_btnManageEmpActionPerformed

    private void btnManageReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageReqActionPerformed
        // TODO add your handling code here:
        FundRaiserEntManageReqJPanel fundreq=new FundRaiserEntManageReqJPanel();
        FundRaiserSplit.setRightComponent(fundreq);
    }//GEN-LAST:event_btnManageReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane FundRaiserSplit;
    private javax.swing.JButton btnManageEmp;
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton btnManageReq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
