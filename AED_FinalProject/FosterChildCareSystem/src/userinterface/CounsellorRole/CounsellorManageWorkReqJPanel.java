/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CounsellorRole;

import Business.ChildCounsellor.ChildCounsellor;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnrolForTrainingWorkRequest;
import Business.WorkQueue.EnrollforCounselingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koushik
 */
public class CounsellorManageWorkReqJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CounsellorManageWorkReqJPanel
     */
JPanel userProcessContainer; 
     public EcoSystem system;
    public ChildCounsellor currentChildCounsellor;
    public Organization Organization;
    public String role;
    public UserAccount account;         
    public CounsellorManageWorkReqJPanel(JPanel userProcessContainer,UserAccount account, ChildCounsellor currentChildCounsellor,Organization organization,String Role, EcoSystem system) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
          this.system = system;
        this.currentChildCounsellor = currentChildCounsellor;
        this.Organization = organization;
        this.role = Role;
        this.account = account;
    this.PopulateTable();
    }
    
    public void PopulateTable(){
        DefaultTableModel model = (DefaultTableModel)tblCounsellorWorkRequest.getModel();
        model.setRowCount(0);
        for(WorkRequest wq: this.system.getWorkQueue().getWorkRequestList()){
            if(wq.getClass() == EnrollforCounselingWorkRequest.class){
                Object[] row = new Object[model.getColumnCount()];
                EnrollforCounselingWorkRequest facwq = (EnrollforCounselingWorkRequest)wq;
                row[0] = facwq.getFosterChild().getName();
                row[1] = facwq.getReqId();
                row[2] = facwq.getStatus();
               ((DefaultTableModel) tblCounsellorWorkRequest.getModel()).addRow(row);
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCounsellorWorkRequest = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("Manage Counselor Work Request");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        tblCounsellorWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Foster Child", "ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCounsellorWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 620, 100));

        btnBack.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/children.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 740, 270));

        btnReject.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 90, 30));

        btnAccept.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CounsellorRoleWorkAreaJPanel fosterParent = (CounsellorRoleWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCounsellorWorkRequest.getSelectedRow();
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblCounsellorWorkRequest.getModel();
            int id = (int)tableRecords.getValueAt(selectedRow, 1);
            for(WorkRequest wq: system.getWorkQueue().getWorkRequestList()){
                if(wq.getReqId()==id){
                    EnrollforCounselingWorkRequest rwq= (EnrollforCounselingWorkRequest)wq;
                    rwq.setStatus("Rejected by the Counselor");
                    JOptionPane.showMessageDialog(null, "Request Rejected");
                }
            }
            PopulateTable();}
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCounsellorWorkRequest.getSelectedRow();
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblCounsellorWorkRequest.getModel();
            int id = (int)tableRecords.getValueAt(selectedRow, 1);
            for(WorkRequest wq: system.getWorkQueue().getWorkRequestList()){
                if(wq.getReqId()==id){
                    EnrollforCounselingWorkRequest rwq= (EnrollforCounselingWorkRequest)wq;
                    rwq.setStatus("Approved by the Counselor");
                    JOptionPane.showMessageDialog(null, "Request Accepted.");

                }
            }
            PopulateTable();
        }
    }//GEN-LAST:event_btnAcceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCounsellorWorkRequest;
    // End of variables declaration//GEN-END:variables
}
