/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterParentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Parent.Parent;
import Business.UserAccount.UserAccount;
import Business.Voluteers.Volunteer;
import Business.WorkQueue.NGOContributeWorkRequest;
import Business.WorkQueue.RequestAStipendWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shiva
 */
public class FosterParentRequestAStipendJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FosterParentRequestAStipendJPanel
     */
     JPanel userProcessContainer;    
    public EcoSystem system;
    public Parent currentFosterParent;
   
    public UserAccount account;
    public Enterprise enterprise;
    public Network network;
    
    public FosterParentRequestAStipendJPanel(JPanel userProcessContainer,UserAccount account,Parent currentFosterParent ,Network network,Enterprise enterprise, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.currentFosterParent = currentFosterParent;
    
        this.account = account;
        this.enterprise = enterprise;
        this.network = network;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReason = new javax.swing.JLabel();
        btnRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReason.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblReason.setText("Reason:");
        add(lblReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        btnRequest.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("Request Stipend");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 180, -1));

        lblAmount.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblAmount.setText("Enter the amount:");
        add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));
        add(txtReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 130, 30));
        add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 130, 30));

        Back.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/FosterParentRole/index(1).png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 240, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        String reason=txtReason.getText();
          String a = txtAmount.getText();
        int amount;
        try{
            amount = Integer.parseInt(a);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter numeric values only.");
            return;
        }
        
        
        
        RequestAStipendWorkRequest wq = new RequestAStipendWorkRequest();
        wq.setEnterprise(enterprise);
        wq.setParent(currentFosterParent);
        wq.setNetwork(network);
        wq.setRequestedAmount(amount);

        wq.setStatus("Stipend Request Pending Approval.");

        wq.setReqId(this.system.getWorkQueue().getWorkRequestList().size() +1);
        this.system.getWorkQueue().getWorkRequestList().add(wq);
        JOptionPane.showMessageDialog(null, "Stipend requested.");
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FosterParentWorkAreaJPanel sysAdminwjp = (FosterParentWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblReason;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtReason;
    // End of variables declaration//GEN-END:variables
}
