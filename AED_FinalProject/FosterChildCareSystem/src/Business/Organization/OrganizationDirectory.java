/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Organization.Organization;
import java.util.ArrayList;


/**
 *
 * @author Deepika Reddy
 */
public class OrganizationDirectory {

    private final ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.OrganizationType type, String name) {
        Organization organization = null;
        
        if (type.getValue().equals(Organization.OrganizationType.ChildrenOrganization.getValue())) {
            organization = new ChildrenOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.HouseLessorOrganization.getValue())) {
            organization = new HouseLessorOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.NgoOrganization.getValue())) {
            organization = new NgoOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.ParentOrganization.getValue())) {
            organization = new ParentOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.ParentTrainingOrganization.getValue())) {
            organization = new ParentTrainingOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.RehabilitationOrganization.getValue())) {
            organization = new RehabilitationOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.RehabilitationOrganization.getValue())) {
            organization = new RehabilitationOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.SocialWorkerOrganization.getValue())) {
            organization = new SocialWorkerOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.SocialWorkerOrganization.getValue())) {
            organization = new SocialWorkerOrganization(name);
            organizationList.add(organization);
        } 
        return organization;
    }
}

