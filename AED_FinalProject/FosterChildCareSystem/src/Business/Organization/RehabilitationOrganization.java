/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CounsellorRole;
import Business.Role.FosterParentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Deepika Reddy
 */
public class RehabilitationOrganization extends Organization{
    public RehabilitationOrganization(String name){
        super(name);
    }
    @Override
    
     public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CounsellorRole());
        return roles;
    }
       @Override
    public Organization.OrganizationType getType() {
        return Organization.OrganizationType.RehabilitationOrganization;
    }  
}

