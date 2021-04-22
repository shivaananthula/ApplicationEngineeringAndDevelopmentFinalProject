/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CounsellorRole.CounsellorRoleWorkAreaJPanel;
import userinterface.FosterChildRole.FosterChildWorkAreaJPanel;
import userinterface.FosterParentRole.FosterParentWorkAreaJPanel;

/**
 *
 * @author Deepika Reddy
 */

public class CounsellorRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new CounsellorRoleWorkAreaJPanel(userProcessContainer,account,organization, enterprise, network, business);//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public RoleType getRoleType(){
        return RoleType.Counsellor;
    }
    
}

