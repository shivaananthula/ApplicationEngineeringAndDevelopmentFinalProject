/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.EnterpriseAdmin.EnterpriseAdmin;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;


/**
 *
 * @author Deepika 
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Organization organization;
    public EnterpriseAdmin admin;

    public EnterpriseAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(EnterpriseAdmin admin) {
        this.admin = admin;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        FosterCare("Foster Care"),
        TrainingCenter("Training Center"),
        Rental("Rental"),
        FundRaiser("FundRaiser");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
}
