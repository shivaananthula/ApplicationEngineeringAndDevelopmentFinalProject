/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterParentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FosterChild.FosterChild;
import Business.Network.Network;
import Business.Organization.ChildrenOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Parent.Parent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FosterAChildWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepika Reddy
 */
public class FosterAChild extends javax.swing.JPanel {

    /**
     * Creates new form FosterAChild
     */
     JPanel userProcessContainer;    
    public EcoSystem system;
    public Parent CurrentParent;
    public UserAccount account;
    public Enterprise Enterprise;
    public Network network;
    
    public FosterAChild(JPanel userProcessContainer,UserAccount account, Parent currentParent, Network network, Enterprise enterprise, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.CurrentParent = currentParent;
        this.Enterprise = enterprise;
        this.account = account;
        this.network = network;
        populateTable();
    }
    
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblFosterChild.getModel();
        model.setRowCount(0);
        
        for(FosterChild foster: Enterprise.fosterChildDirectory.FosterChildList){
            Object[] row = new Object[model.getColumnCount()];
                row[0] = foster.getFosterChildId();
                row[1] = foster.getName();
                row[2] = foster.getAge();
                row[3] = foster.IsAdopted;
               ((DefaultTableModel) tblFosterChild.getModel()).addRow(row);
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
        scrollpaneFosterChild = new javax.swing.JScrollPane();
        tblFosterChild = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("List Of Children Available");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        tblFosterChild.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        tblFosterChild.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "IsAdopted"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpaneFosterChild.setViewportView(tblFosterChild);

        add(scrollpaneFosterChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 520, 100));

        btnSelect.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnSelect.setText("Select Foster Child");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/FosterParentRole/index(1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 240, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblFosterChild.getSelectedRow();
        
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblFosterChild.getModel();
            int id = (int)tableRecords.getValueAt(selectedRow, 0);
            String name = (String)tableRecords.getValueAt(selectedRow, 1);
            
            FosterChild child = Enterprise.fosterChildDirectory.getFosterChildById(id);
            
            FosterAChildWorkRequest workreq = new FosterAChildWorkRequest();
            workreq.setChild(child);
            workreq.setParent(CurrentParent);
            workreq.setNetwork(network);
            workreq.setEnterprise(Enterprise);
            workreq.setStatus("Foster Requested");
            workreq.setReqId(system.getWorkQueue().getWorkRequestList().size() +1);
            
            system.getWorkQueue().getWorkRequestList().add(workreq);
            
            JOptionPane.showMessageDialog(null, " Foster A Child Requested Successfully.");
        }
        
    }//GEN-LAST:event_btnSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollpaneFosterChild;
    private javax.swing.JTable tblFosterChild;
    // End of variables declaration//GEN-END:variables
}
