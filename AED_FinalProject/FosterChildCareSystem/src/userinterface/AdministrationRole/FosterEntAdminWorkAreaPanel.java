/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrationRole;

/**
 *
 * @author shiva
 */
public class FosterEntAdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form FosterEntAdminWorkAreaPanel
     */
    public FosterEntAdminWorkAreaPanel() {
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

        FosterSplit = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageOrg = new javax.swing.JButton();
        btnManageEmp = new javax.swing.JButton();
        btnManageUserAcc = new javax.swing.JButton();
        btnManageReq = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        FosterSplit.setDividerLocation(200);

        btnManageOrg.setText("Manage Organization");
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });

        btnManageEmp.setText("Manage Employee");
        btnManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpActionPerformed(evt);
            }
        });

        btnManageUserAcc.setText("Manage User Account");
        btnManageUserAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccActionPerformed(evt);
            }
        });

        btnManageReq.setText("Manage Requests");
        btnManageReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnManageReq)
                    .addComponent(btnManageOrg)
                    .addComponent(btnManageEmp)
                    .addComponent(btnManageUserAcc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnManageOrg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageUserAcc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageReq)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageEmp, btnManageOrg, btnManageReq, btnManageUserAcc});

        FosterSplit.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );

        FosterSplit.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FosterSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FosterSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
        // TODO add your handling code here:
        FosterEntManageOrganizationJPanel fosterorg=new FosterEntManageOrganizationJPanel();
        FosterSplit.setRightComponent(fosterorg);
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpActionPerformed
        // TODO add your handling code here:
        FosterEntManageEmpJPanel fosteremp=new FosterEntManageEmpJPanel();
        FosterSplit.setRightComponent(fosteremp);
    }//GEN-LAST:event_btnManageEmpActionPerformed

    private void btnManageUserAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccActionPerformed
        // TODO add your handling code here:
        FosterEntManageUserAccountJPanel fosteruser=new FosterEntManageUserAccountJPanel();
        FosterSplit.setRightComponent(fosteruser);
    }//GEN-LAST:event_btnManageUserAccActionPerformed

    private void btnManageReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageReqActionPerformed
        // TODO add your handling code here:
        FosterEntManageRequestJPanel fosterreq=new FosterEntManageRequestJPanel();
        FosterSplit.setRightComponent(fosterreq);
    }//GEN-LAST:event_btnManageReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane FosterSplit;
    private javax.swing.JButton btnManageEmp;
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton btnManageReq;
    private javax.swing.JButton btnManageUserAcc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
