/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Organization.Organization.Type;
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

    public Organization createOrganization(Organization type, String name) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Agent.getValue())) {
            organization = new AgentOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Builder.getValue())) {
            organization = new BuilderOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.PropertyManager.getValue())) {
            organization = new PropertyManagerOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Inspector.getValue())) {
            organization = new InspectorOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Photographer.getValue())) {
            organization = new PhotographerOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Cleaning.getValue())) {
            organization = new CleaningOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Plumbing.getValue())) {
            organization = new PlumbingOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Electrician.getValue())) {
            organization = new ElectricianOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.PackersMovers.getValue())) {
            organization = new PackersMoversOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Goverment.getValue())) {
            organization = new GovermentOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Buyer.getValue())) {
            organization = new BuyerOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Seller.getValue())) {
            organization = new SellerOrganization(name);
            organizationList.add(organization);
        }
        return organization;
    }
}

