/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Deepika Reddy
 */
public class TrainingCenterEnterprise extends Enterprise {
    
    public TrainingCenterEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.TrainingCenter);
    }

    @Override

    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new CleaningRole());
        roles.add(new ElectricianRole());
        roles.add(new PlumbingRole());
        roles.add(new PackersMoversRole());
        roles.add(new GovermentEmployeeRole());
        return roles;
    }
}
